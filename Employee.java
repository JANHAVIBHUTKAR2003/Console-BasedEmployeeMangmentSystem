package HardProgram;

public class Employee
{
	  private int id;
	  private String name;
	  private double salary;
	 
	  public Employee(int id, String name, double salary) 
	  {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

	

	
}
