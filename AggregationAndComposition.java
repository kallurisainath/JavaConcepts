//defining class OS
class Os {
	private String name;
	private int size;

	public Os() {
	}

	public Os(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

class Charger {
	private String brand;
	private float voltage;

	public Charger() {
	}

	public Charger(String brand, float voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getVoltage() {
		return voltage;
	}

	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}

}

//Here mobile and os are tight coupling - composition
class Mobile {
	Os os = new Os("Android", 512);

	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}

public class AggregationAndComposition {

	public static void main(String[] args) {
		// charger is loose bound
		// but both os and charger are has-A relationship with mobile
		Charger c = new Charger("Samsung", 30.5f);
		Mobile m = new Mobile();
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		m.hasA(c);
		m = null;
		// the below lines will give null pointer exception
		// when we make mobile as null os also null
//		System.out.println(m.os.getName());
//		System.out.println(m.os.getSize());
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}

}
