package oopExam;

public class AnonymousExam {

	public static void main(String[] args) {
/* 익명 클래스 Anonymous class
 
 익명 클래스는 이름이 없다. 클래스 선언과 동시에 객체를 생성한다. 단 한 번만 사용된다. 
 단하나의 객체만 생성할 수 있는 일회용 클래스이다.
 이름이 없기 때문에 생성자도 가질 수 없다. 오로지 단 하나의 클래스를 상속받거나 단 하나의 인터페이스 만을 구현할 수 있다.

*/

	}
}

class InnerExam {
	Object iv = new Object() { void method() {} }; // 익명 클래스
	static Object cv = new Object() { void method() {} }; // 익명 클래스
	
	void method() {
		Object lv = new Object() { void method() {} }; // 익명 클래스
	}
}