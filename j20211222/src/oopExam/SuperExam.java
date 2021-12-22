package oopExam;

class Parent {
	int x = 10;
}

class Child extends Parent {
	
	int x = 20;
	
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x); // 부모의 것
	}
}

public class SuperExam {

	public static void main(String[] args) {
/* super와 this는 static에서는 사용할 수 없다. // 객체를 찍지 않기 때문에 자신의 객체, 부모의 객체 호출 불가
*/
		Child c = new Child();
		c.method();

	}

}
