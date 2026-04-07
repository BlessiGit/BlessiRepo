package Package2;

public class Employee {
	String name;
	int salary;
	
	Employee(String name)
	{
		this.name=name;
		
	}
	
	Employee(String name, int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	public void EmployeeDetails(String name) {
		System.out.println(name);
		
	}
	
	
	public void EmployeeDetails(String name,int salary) {
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Employee emp = new Employee("Blessi");
		Employee emp2 = new Employee("blessi",100);
		emp.EmployeeDetails("Blessi");
		emp2.EmployeeDetails("blessi",100);
		
		
		
	}

}
