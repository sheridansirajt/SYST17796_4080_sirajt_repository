package ice3;

public class Manager extends Employee {
	private double bonus;

	public Manager(String name, double wage, int numHours, double bonus) {
		super(name, wage, numHours);
		this.bonus = bonus;
	}

	public double getBonus() {
		return this.bonus;
	}

	public void setBonus(double value) {
		this.bonus = value;
	}

	public double calculatePay() {
		return numHours * wage +bonus;
	}
}
