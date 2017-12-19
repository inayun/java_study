package takoyaki_game;

import java.io.Serializable;

public class User implements Serializable{

	private String id;
	private int money;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money += money;
	}
	public void setFinalMoney(int money) {
		this.money = money;
	}
	
}
