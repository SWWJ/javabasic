package oopExam;

public class OverridingExam {

	public static void main(String[] args) {
/*  오버라이딩 overriding 조상 클래스로부터 상속받은 메서드의 내용을 변경하여 동일한
	이름으로 자식 클래스에 만드는 것
	
	1. 부모의 메서드 이름과 동일한 이름을 사용한다.
	2. 부모의 메서드에 있는 매개 변수와 같은 매개 변수의 type과 개수를 사용한다.
	3. 부모의 메서드에 있는 반환(return) 타입과도 동일하여야 한다.
	
	*. 오버로딩과 오버라이딩은 단어가 비슷해서 혼동을 일으키기 쉽다.
	오버로딩은 기존에 없는 새로운 메서드를 정의하는 것이다. (new)
	오버라이딩은 상속받은 메서드의 내용을 변경하는 것이다. (change, modify)
	
	class Parent {
		void parentMethod() {
		}
	}
	
	class Child extends Parent {
		void parentMethod() {}   // 오버라이딩
		void parentMethod(int t) {} // 오버로딩 -> 새로운 것을 들고 들어옴
		
		void childMethod() {} // 중복정의
		void childMethod(int i) {} 
		void childMethod() {} // 에러... 중복정의
	}
	
	super
	생성자에서 this를 사용하듯 상속에서는 super를 사용해서 부모 클래스를 가리킨다.

*/

	}

}
