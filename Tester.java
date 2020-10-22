package Lab3.Assignment1;
import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice = sc.nextInt();

		if(choice==1)
		{
				
				Employee employee;
				employee = new SaalariedEmployee(10000);
				System.out.println(employee.getSalary());

	             employee = new HourlyEmployee(1000, 5);
	             System.out.println(employee.getSalary());
				employee = new CommissionEmployee(50, 100);
				System.out.println(employee.getSalary());
				
		}
		else
		{
				Employee employee1;
				employee1 = new SaalariedEmployee(1000);
				employee1.setRate((4)*employee1.getSalary());
				System.out.println(employee1.getRate());
				
				employee1 = new HourlyEmployee(1000, 12);
				employee1.setRate((3*employee1.getSalary()));
				System.out.println(employee1.getRate());

				employee1 = new CommissionEmployee(1000, 50);
				employee1.setRate((2)*employee1.getSalary());
				System.out.println(employee1.getRate());
		}
	}
}
