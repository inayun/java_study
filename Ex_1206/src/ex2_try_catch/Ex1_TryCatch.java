package ex2_try_catch;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		
		/*
		 * Try-Catch ����ó��
		 * �ڹٿ��� ���α׷��� ����Ǵ� ���� 
		 * ���ܰ� �߻��ϸ�
		 * �� �������� ���α׷��� ���������� ����ȴ�
		 * 
		 * �̰��� �ùٸ� �Ǵ�������,
		 * ���δ� ������ �� �ִ� ������ ������ �ְų�
		 * ���� �߻��ÿ��� �������� ���� �ʰ�
		 * ������ �۾����� Ȯ���ϰ��� �Ҷ��� ����
		 * 
		 * ���� ó���� ����
		 * ���α׷��� ���������� ���Ḧ ���̰�
		 * ���������� ���α׷��� ��� ����� �� �ֵ��� ��
		 */
		
		int n = 2;
		int result = 0;
		
		try {
			result = 10 / n ;
			
			String str = "ȫ�浿";
			str.charAt(3);
			
			//try���ȿ��� ���ܰ� �߻��ϸ� catch�� ��
		} catch(ArithmeticException e) {
			//Exception ����ó������ �θ�
			
			n = 1; //(������ ���� �ذ�å�� �������� �� �� ����
			System.err.println("0���δ� ���� �� �����ϴ�.");
			//e.printStackTrace();
			
			
			//����ó�� �������� �� �������� �� ���� 
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("���¹�");
		} finally {
			//���ܰ� �߻��ϵ� ���ϵ� ������ �鷶�ٰ� ����
			System.out.println("end");
		}
		
		System.out.println(result);
		//ArithmeticException : ������ 0���� ������ �߻��Ǵ� ����
		
		
		
	}
}
