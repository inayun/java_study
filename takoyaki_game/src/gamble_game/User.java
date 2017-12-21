package gamble_game;

public class User {
	static int balance = 0;
	
	public User(int balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
	}
	
	public static int getBalance() {
		return balance;
	}
	public void depositBalance(int n) {
		this.balance += n;
	}
	public void withdrawBalance(int n) {
		this.balance -= n;
	}
}
