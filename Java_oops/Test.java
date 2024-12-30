package Java_oops;

class RBIBank{
	int balance;
	
	
	void deposit(int amt) {
		this.balance = this.balance+amt;
		System.out.println("From RBI succesfully deposited.... amount.. "+amt);
	}
	void withDraw(int amt) {
		this.balance = this.balance-amt;
		System.out.println("From RBI succesfully WithDrawn.... amount.. "+amt);
	}
	
	void checkBalance() {
		System.out.println("From RBI avl balance ..."+this.balance);
	
	}
}

class SBIBank extends RBIBank{
	public SBIBank(int balance) {
		this.balance = balance;
	}
	void deposit(int amt) {
		if (amt<50000) {
			this.balance=this.balance+amt;
			System.out.println("From SBI succesfully deposited.... amount.. "+amt );
		}else {
			System.out.println("From SBI Day limit exceeds");
		}
	}
	void withDraw(int amt) {
		if (amt<50000) {
			this.balance=this.balance-amt;
			System.out.println("From SBI succesfully withdrawn.... amount.. "+amt );
		}else {
			System.out.println("From SBI Day limit exceeds");
		}
	}
}
class ICICIBank extends RBIBank{
	public ICICIBank(int balance) {
		this.balance = balance;
	}
	void deposit(int amt) {
		if (amt<200000) {
			this.balance=this.balance+amt;
			System.out.println("From ICICI succesfully deposited.... amount.. "+amt );
		}else {
			System.out.println("From ICICI Day limit exceeds");
		}
	}
	void withDraw(int amt) {
		if (amt<200000) {
			this.balance=this.balance-amt;
			System.out.println("From ICICI succesfully withdrawn.... amount.. "+amt );
		}else {
			System.out.println("From ICICI Day limit exceeds");
		}
	}
}
class HDFCBank extends RBIBank{
	public HDFCBank(int balance) {
		this.balance = balance;
	}
	void deposit(int amt) {
		if (amt<500000) {
			this.balance=this.balance+amt;
			System.out.println("From HDFC succesfully deposited.... amount.. "+amt );
		}else {
			System.out.println("From HDFC Day limit exceeds");
		}
	}
	void withDraw(int amt) {
		if (amt<500000) {
			this.balance=this.balance-amt;
			System.out.println("From HDFC succesfully withdrawn.... amount.. "+amt );
		}else {
			System.out.println("From HDFC Day limit exceeds");
		}
	}
}
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBIBank sbi = new SBIBank(10000);
		ICICIBank icici = new ICICIBank(65500);
		HDFCBank hdfc = new HDFCBank(150000);
		
		System.out.println("WELCOME TO SBI BANK...");
		sbi.checkBalance();
		sbi.deposit(5000);
		sbi.checkBalance();
		sbi.deposit(52000);
		sbi.checkBalance();
		System.out.println("THANK YOU.....");
		
		System.out.println("WELCOME TO ICICI BANK...");
		icici.checkBalance();
		icici.deposit(8500);
		icici.checkBalance();
		icici.deposit(82450);
		icici.checkBalance();
		System.out.println("THANK YOU.....");
		
		System.out.println("WELCOME TO HDFC BANK...");
		hdfc.checkBalance();
		hdfc.deposit(9800);
		hdfc.checkBalance();
		hdfc.deposit(440000);
		hdfc.checkBalance();
		System.out.println("THANK YOU.....");
		
		

	}

}
