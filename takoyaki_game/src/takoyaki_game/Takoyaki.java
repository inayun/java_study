package takoyaki_game;

public class Takoyaki {

	private String[] ball;
	private int moldCount;

	public Takoyaki() {
		moldCount = 18;
		ball = new String[moldCount];
	
		for (int i = 0; i < ball.length; i++) {
			ball[i] = "¡Û";
		}
	}
	public String getBall(int i) {
		return ball[i];
	}
	public void setBall(int i, String process) {
		ball[i] = process;
	}
	
	public int getMoldCount() {
		return moldCount;
	}
	
}
