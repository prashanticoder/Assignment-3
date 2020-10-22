package Lab3.Assignment1;

public class CommissionEmployee extends Employee implements IncreasePercentage{
	private int percentage;
	private int weeklySalary;
	
	public CommissionEmployee(int percentage, int weeklySalary) {
		this.percentage = percentage;
		this.weeklySalary = weeklySalary;
	}

	@Override
	public int getSalary() {
		System.out.println("Salary of comission employee is ");
		return (percentage*weeklySalary)/100;
	}

	@Override
	public int increaseSalary() {
		return 3;
	}

	@Override
	public double getPayment() {
		
		return (percentage*weeklySalary)/100;
	}

	@Override
	public String toString() {
		return "CommissionEmployee [percentage=" + percentage + ", weeklySalary=" + weeklySalary + "]";
	}
	

}
