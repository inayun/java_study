package ex_string_buffer;

public class Ex_StringBuffer {

	public static void main(String[] args) {

		StringBuffer name = new StringBuffer();
		name.append("È«±æµ¿");
		name.append("¾È³ç");
		System.out.println(name);
		
		
		StringBuffer name2 = name.reverse();
		String result = name2.toString();
		
		System.out.println(result);
	}

}
