package game;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ScoreLoader {

	private User user;

	public User getUser() {
		return user;
	}

	public ScoreLoader (User user) throws IOException {
		this.user = user;

		String path = "c:/java_study/RspGame/" 
				+ user.getId() + "/RspSave.txt";
		File file = new File(path);
		if(file.exists()) {
			ObjectInputStream ois = null;
			FileInputStream fis = null;

			try {
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);
				this.user = (User)ois.readObject();
				System.out.println("�ε� ����!");

			} catch (Exception e) {
				System.out.println("�ε� ����!");
			} finally {

				if(fis != null) {
					fis.close();
				}
				if(ois != null) {
					ois.close();
				}
			}

		} else {
			System.out.println(user.getId() + "�� ����!ù �湮!");
		}
	}
}
