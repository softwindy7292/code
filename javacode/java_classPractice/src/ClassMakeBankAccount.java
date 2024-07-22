class BankAccount{
	String accNumber;
	String ssNumber;
	int balance;
	
	BankAccount(String acc, String ss, int bal){
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	void initBankAccount(String acc, String ss, int bal){
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
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
		BankAccount kim = new BankAccount("7746-12-22", "1359823", 10000);
		BankAccount lee = new BankAccount("7746-12-22", "1359823", 10000);
		
		kim.initBankAccount("1294-11-23", "2086454", 10000);
		
		kim.deposit(20000);
		lee.deposit(30000);
		
		kim.withdraw(2000);
		lee.withdraw(5000);
		
		kim.checkMyBalance();
		lee.checkMyBalance();
		
		kim.checkBalance(kim);
		
		BankAccount ref1 = new BankAccount("none", "none", 0);
		BankAccount ref2 = ref1;
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref1.withdraw(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();					
	}

}
