//46 - bank account
import java.util.*;

class BankAccount{
	private String accNo;
	private double bal;
	
	public BankAccount(String accNo, double bal) {
		this.accNo = accNo;
		this.bal = bal;
	}
	
	public void deposit(double amt) {
		bal+=amt;
	}
	
	public void withdraw(double amt) {
		if(bal>=amt)
				bal-=amt;
		else
			System.out.println("Insufficient balance.");
	}
	
	public double getBal() {
		return bal;
	}
}

class SavingsAccount extends BankAccount{
	public SavingsAccount(String accNo, double bal) {
		super(accNo, bal);
	}
	
	@Override
	public void withdraw(double amt) {
		if(getBal()-amt<100 && getBal()-amt>0)
			System.out.println("Savings fall below minimum balance of $100");
		else
			super.withdraw(amt);
	}
}
class prg46{
	public static void main(String args[]) {
		SavingsAccount ABC123 = new SavingsAccount("ABC123", 2000);
		System.out.println("Depositing 1000: ");
		ABC123.deposit(1000);
		System.out.println(ABC123.getBal());
		System.out.println("Withdrawing 2500: ");
		ABC123.withdraw(2500);
		System.out.println(ABC123.getBal());
		System.out.println("Withdrawing 450: ");
		ABC123.withdraw(450);
		System.out.println("Withdrawing 750: ");
		ABC123.withdraw(750);
	}
}