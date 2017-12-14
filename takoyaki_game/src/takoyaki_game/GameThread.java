package takoyaki_game;

public class GameThread implements Runnable{

	private static int timer = 0;
	Takoyaki takoyaki = new Takoyaki();
	String[] process = {"¡Ý","¢Ä","¡Ü"};

	public Takoyaki getTakoyaki() {
		return takoyaki;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			timer++;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void changeBytime(Takoyaki takoyaki)  {
		this.takoyaki = takoyaki;

		try {
			for(int i = 0; i < takoyaki.getMoldCount(); i++) {
				Thread.sleep(4000);
				if(takoyaki.getBall(i).equals(process[0])) {
					takoyaki.setBall(i, process[1]);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
