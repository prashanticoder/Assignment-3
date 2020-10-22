package Lab3.Assignment1;

public class HourlyEmployee extends Employee implements IncreasePercentage{
	private int salaryHourly;
	private int noOfHours;

	public HourlyEmployee(int salary, int noOfHours) {
		this.salaryHourly = salary;
		this.noOfHours = noOfHours;
		
	}

	@Override
	public int getSalary() {
		System.out.println("Hourly employee salary ");		
		return salaryHourly * noOfHours;
	}

	@Override
	public int increaseSalary() {
		
		return 3;
	}

	@Override
	public double getPayment() {
		return salaryHourly * noOfHours;
	}
}
