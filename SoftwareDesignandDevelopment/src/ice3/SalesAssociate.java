package ice3;

public class SalesAssociate extends Employee {
	private double vacPay;

	public SalesAssociate(String name, double wage, int numHours, double vacPay) {
		super(name, wage, numHours);
		this.vacPay = vacPay;
	}

	public double getVacPay() {
		return this.vacPay;
	}

	public void setVacPay(double value) {
		this.vacPay = value;
	}

	public double calculatePay() {
		return numHours * wage + vacPay;
	}
}
