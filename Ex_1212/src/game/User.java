package game;

import java.io.Serializable;

import javax.naming.Context;

public class User implements Serializable {

	
	/*
	 * 객체를 통째로 저장하기 위해 serializable을 통한
	 * 객체의 직렬화가 필수!
	 * 메모리에 존재하는 변수들을 한번에 쓰고 받을 수 있도록
	 * 새로운 메모리 영역에 일렬로 만들어서 복사해둠
	 * 
	 */
	
	private String id;
	private int win; 
	private int draw;
	private int lose;
	
	public User() {
		this.win = 0;
		this.draw = 0;
		this.lose = 0;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getWin() {
		return win;
	}
	public void setWin() {
		win++;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw() {
		draw++;
	}
	public int getLose() {
		return lose;
	}
	public void setLose() {
		lose++;
	}
	
}
