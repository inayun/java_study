package ex10_interface;

//implements 는 여러개 구현가능
public class InterChild implements InterMenu3 {

	@Override
	public String jjajang() {
		return "춘장소스 + 중면 ";
	}
	
	@Override
	public String jjambbong() {
		// TODO Auto-generated method stub
		return "오징어 육수 + 중면";
	}
	
	@Override
		public String tangsuyuck() {
			return "돼지고기 + 소스 ";
		}
	
	@Override
	public String boggembab() {
		return "양파 + 당근 + 밥";
	}
}
