package staticModifier14;

public class AccountTest14 {
	public static void main(String[] args) {
		Account14 acc = new Account14(1122, 20000);
	
		acc.withdraw(2500);
		acc.deposit(2000);
		
		System.out.println("Balance: " + acc.getBalance() + "\nMonthly inerest: " + acc.getMonthlyInterest() + 
				"\nDate: " + acc.getDateCreated());
	}
}