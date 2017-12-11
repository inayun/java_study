package ex_byte_output_stream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex_Output {

	public static void main(String[] args) throws IOException {

		/*
		 * OutputStream�� ��ǥ���� �ڽ� Ŭ���� �� �ϳ�
		 */

		PrintStream ps = null;
		OutputStream out = null;
		
		try {
			
			ps = System.out;
			out = ps;
			
			int first = 'A';
			int second = 'B';
			
			out.write(first);
			out.write(second);
			
			//System.out.println��
			//OutputStream�� �ڽ��� PrintStream�� ����Ͽ�
			//����� ����� �� �־��� ��
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(ps != null) {
				ps.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}

}
