package Charan;

public class BankAccount {
	
	long accno;
	String name;
	int balance;
	String address;
	String mobile;
	public BankAccount(long accno, String name, int balance, String address, String mobile) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
		this.address = address;
		this.mobile = mobile;
		System.out.println("account got created with opening balance..."+this.balance);
	}
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", name=" + name + ", balance=" + balance + ", address=" + address
				+ ", mobile=" + mobile + "]";
	}
	
	
	void deposit(int amt) {
		balance = balance + amt;
		System.out.println("successfully deposited amt..."+amt);
	}
	
	
	void withDraw(int amt) {
		this.balance = this.balance - amt;
		System.out.println("successfully withdrawn amt..."+amt);
			
		
	}
	
	void checkBalance() {
		System.out.println("avl balance---->"+this.balance);
	}
}