import java.util.*;
class Employee implements Comparable<Employee> {
	//method to override inorder to make Collections.sort() work on employee class
	//we will sort according to id here
	private int id;
	private String name;
	private int salary;
	public Employee() {
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public int compareTo(Employee e) {
		int id1 = this.id;
		int id2 = e.id;
		if(id1 > id2) {
			return 1;
		}
		return -1;
	}
	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}
}
public class ComparableExmp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees:");
		int n = sc.nextInt();
		List<Employee> empLst = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter id of employee " + (i));
			int id = sc.nextInt();
			System.out.println("Enter name of employee " + (i));
			String name = sc.next();
			System.out.println("Enter salary of employee " + (i));
			int salary = sc.nextInt();
			empLst.add(new Employee(id, name, salary));
		}
		System.out.println("Before sorting according to id, employee details as follows");
		for(Employee emp : empLst) {
			System.out.println(emp);
		}
		Collections.sort(empLst);
		System.out.println("After sorting according to id, employee details as follows");
		for(Employee emp : empLst) {
			System.out.println(emp);
		}
	}
}
