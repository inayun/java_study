package ex10_interface;

//implements �� ������ ��������
public class InterChild implements InterMenu3 {

	@Override
	public String jjajang() {
		return "����ҽ� + �߸� ";
	}
	
	@Override
	public String jjambbong() {
		// TODO Auto-generated method stub
		return "��¡�� ���� + �߸�";
	}
	
	@Override
		public String tangsuyuck() {
			return "������� + �ҽ� ";
		}
	
	@Override
	public String boggembab() {
		return "���� + ��� + ��";
	}
}
