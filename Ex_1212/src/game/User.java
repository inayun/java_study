package game;

import java.io.Serializable;

import javax.naming.Context;

public class User implements Serializable {

	
	/*
	 * ��ü�� ��°�� �����ϱ� ���� serializable�� ����
	 * ��ü�� ����ȭ�� �ʼ�!
	 * �޸𸮿� �����ϴ� �������� �ѹ��� ���� ���� �� �ֵ���
	 * ���ο� �޸� ������ �Ϸķ� ���� �����ص�
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
