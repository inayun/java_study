package takoyaki_game;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserWriter {
	private User user;
	
	public UserWriter(User user) throws IOException {
		this.user = user;

		String path = "c:/java_study/Takoyaki_tycoon/" 
				+ user.getId() + "/InfoSave.txt";

		File file = new File("c:/java_study/Takoyaki_tycoon/"+ user.getId());

		if(!file.exists()) {
			file.mkdirs();
		}
		
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		try {

			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(user);
			System.out.println("저장 완료!");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("기록 저장 실패");
		} finally {

			if(oos != null)
				oos.close();
			if(fos != null)
				fos.close();
		}
	}
}
