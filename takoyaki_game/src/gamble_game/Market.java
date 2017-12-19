package gamble_game;

import java.util.Random;

public class Market {
	static User user;
	static int goal = new Random().nextInt(4000)+8000;
	int playerMoney;
	int price = 100;
	static int tray = 0;
	int flow = 0;
	int time = 0;
	
	public Market() {};
	
	public Market(int money) {
		user= new User(money);
	}
	public User getUser() {
		return this.user;
	}
	
	public int passTime() {
		time ++;
		flow = ((new Random().nextInt(5)-2)*2);
		return flow;
	}
	public int getFlow() {
		return flow;
	}
	public void selector(String a, int amount) {
		if (a.equalsIgnoreCase("D")) {
			System.out.println("µ·µé¾î°£´Ù");
			user.withdrawBalance(amount);
			this.buyStok(amount);
		}else if(a.equalsIgnoreCase("W")){
			System.out.println("µ·»«´Ü´Ù");
			user.depositBalance(amount);
			this.sellStok(amount);
		}else if(a.equalsIgnoreCase("x")){
			System.out.println("°ü¸ÁÇÑµ¥");
		}
	}
	public void buyStok(int m) {
		tray+= m;
	}
	public void sellStok(int m) {
		tray-= m;
	}
	public void calculateFlow() {
		//»ó½Â·ü¸¸Å­ µ·À» °è»ê.
		tray += (((tray/100)*2)*flow);
		System.out.println(tray);
	}
	
}