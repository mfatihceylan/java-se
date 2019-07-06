package _01.naming.standart;

public class Employee {

	private String name;
	private String surname;
	private String deparment;
	private int id;
	private long salary;

	public Employee(String name, String surname, String deparment, int id, long salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.deparment = deparment;
		this.id = id;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", surname=" + surname + ", deparment=" + deparment + ", id=" + id
				+ ", salary=" + salary + "]";
	}
	
}
