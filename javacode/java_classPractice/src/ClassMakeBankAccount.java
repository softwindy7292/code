class BankAccount{
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("잔액: " + balance);
		return balance;
	}
	
	public void checkBalance(BankAccount acc) {
		acc.checkMyBalance();
	}
}



public class ClassMakeBankAccount {

	public static void main(String[] args) {
		BankAccount kim = new BankAccount();
		BankAccount lee = new BankAccount();
		
		kim.deposit(20000);
		lee.deposit(30000);
		
		kim.withdraw(2000);
		lee.withdraw(5000);
		
		kim.checkMyBalance();
		lee.checkMyBalance();
		
		kim.checkBalance(kim);
		
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref1.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();					
	}

}
