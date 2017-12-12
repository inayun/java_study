package ex_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_Reader {

	public static void main(String[] args) {
		
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String data = reader.readLine();
			
			while(data != null) {
				System.out.println(data);
				data = reader.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
