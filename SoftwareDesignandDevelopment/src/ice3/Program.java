package ice3;
public class Program {
	public static void main(String[] args) {
		Employee em = new Employee("Jack", 14.50, 20);
		Manager ma = new Manager("Mark", 20.20, 40, 1000);
		SalesAssociate sa = new SalesAssociate("Kira", 18.20, 40, 300);
		
		System.out.println(em.name+" pay for the week is $"+em.calculatePay());
		System.out.println(ma.name+" pay for the week is $"+ma.calculatePay());
		System.out.println(sa.name+" pay for the week is $"+sa.calculatePay());
	}
}
