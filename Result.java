package Lab3.Assignment1;

public class Result {
public static void main(String[] args) {
		
		Invoice invoice  = new Invoice("1", "Bag", 2, 300.0);
		System.out.println("Total payment is: " + invoice.getPayment());
		
		SaalariedEmployee salariedEmp = new SaalariedEmployee(1000);
		System.out.println("Total payment of Saliried employee is: " + salariedEmp.getPayment());
		
		CommissionEmployee comissionEmp = new CommissionEmployee(50, 500);
		System.out.println("Total payment of Comission employee is: " + comissionEmp.getPayment());
		
		HourlyEmployee hourlyEmp = new HourlyEmployee(2, 1000);
		System.out.println("Total payment of Saliried employee is: " + hourlyEmp.getPayment());
		
		
	}
}