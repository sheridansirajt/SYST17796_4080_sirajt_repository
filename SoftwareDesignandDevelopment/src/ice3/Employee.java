package ice3;

public class Employee {

	protected String name;
	protected double wage;
	protected int numHours;

	public Employee(String name, double wage, int numHours) {
		this.name = name;
		this.wage = wage;
		this.numHours = numHours;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public double getWage() {
		return this.wage;
	}

	public void setWage(double value) {
		this.wage = value;
	}

	public int getNumHours() {
		return this.numHours;
	}

	public void setNumHours(int value) {
		this.numHours = value;
	}

	public double calculatePay() {
		return numHours * wage;
	}
}
