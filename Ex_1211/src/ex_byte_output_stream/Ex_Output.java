package ex_byte_output_stream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Ex_Output {

	public static void main(String[] args) throws IOException {

		/*
		 * OutputStream의 대표적인 자식 클래스 중 하나
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
			
			//System.out.println은
			//OutputStream의 자식인 PrintStream을 사용하여
			//결과를 출력할 수 있었던 것
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
