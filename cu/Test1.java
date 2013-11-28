package kr.ac.kaywon.cu;
public class Test1 {
	private int a; //내클래스에선 접근가능!
	public int b;
	int c;
	
	void aaa(){
		a = 100;
	}
}
/*import java.io.File;

import kr.ac.kaywon.jung.Jung;
// ctrl+shift+O 를이용해 생성.

//import java.lang.*; 은 생략되어 있다. 항상 포함되어있음.

public class Test1 {
	Jung obj = new Jung(); //패키지가 다르기 때문에 import를 이용해 선언해줌(Public)
	
	Test2 obj2 = new Test2(); //같은 패키지에 있기때문에 import 생략가능.
	
	File file = new File("test"); // default 패키지 내의 클래스도 import 를 통해 사용가능.
}*/
