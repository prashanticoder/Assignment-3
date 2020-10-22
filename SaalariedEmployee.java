package Lab3.Assignment1;

public class SaalariedEmployee extends Employee implements IncreasePercentage{
private int salary;

public SaalariedEmployee(int salary) {
	super();
	this.salary = salary;
}

public int getSalary() {
	return salary;
}

public int increaseSalary() {
	return 5;
}

@Override
public String toString() {
	return "SaalariedEmployee [salary=" + salary + "]";
}
public double getPayment() {
	System.out.println(this.toString());
	return salary;
}
}
