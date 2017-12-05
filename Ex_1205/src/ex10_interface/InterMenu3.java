package ex10_interface;

//상속은 여러개의 부모를 가질 수 없지만!
//인터페이스는 여러개의 부모를 가질 수 있음!!!
public interface InterMenu3 extends InterMenu, InterMenu2{

	//인터페이스는 구현 능력이 없기 때문에 다중 상속 가능
	String boggembab();
	
}
