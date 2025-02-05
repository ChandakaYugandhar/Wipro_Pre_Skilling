package day_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Employee{
	String name;
	int age;
	double salary;
	
	public Employee(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee{name= "+name+", age= "+age+", salary= "+salary+"}";
	}
}

public class StreamAPIQ2 {
	

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee("Ravi",24,30000),
				new Employee("Yuggu",24,25000),
				new Employee("Swaroop",34,50000),
				new Employee("Karthik",50,60000),
				new Employee("Mani",43,40000)
				);
		
		System.out.println("All Employees:");
		employees.forEach(System.out::println);
		
		List<String>employeeNames=employees.stream()
		.filter(emp->emp.getAge()>30)
		.map(Employee::getName)
		.collect(Collectors.toList());
		double avgSalary = employees.stream()
				.filter(emp->emp.getSalary()>30)
				.mapToDouble(Employee::getSalary)
				.average()
				.orElse(0.0);
		
		
		System.out.println("Employees age greater than 30: "+employeeNames);
		System.out.println("Average Salary: "+avgSalary);
		

	}

}
