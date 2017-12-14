package refrigerator_project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserWriter {
	
	public UserWriter(User user) throws IOException {

		String path = "c:/java_study/refrigerator_project/" 
				+ user.getId() + "/InfoSave.txt";

		File file = new File("c:/java_study/refrigerator_project/"+ user.getId());

		if(!file.exists()) {
			file.mkdirs();
		}
		
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		
		try {

			fos = new FileOutputStream(path);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(user);
			System.out.println("���� �Ϸ�!");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��� ���� ����");
		} finally {

			if(oos != null)
				oos.close();
			if(fos != null)
				fos.close();
		}
	}
}