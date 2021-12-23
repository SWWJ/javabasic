package oopExam;

class Car1 {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive!!");
	}
	
	void stop() {
		System.out.println("stop!!");
	}
}

class FireCar extends Car1 {
	void water() {
		System.out.println("water!!");
	}
}

public class PolyExam {

	public static void main(String[] args) {
		
		Car1 car = null; // 초기화
		FireCar fe = new FireCar();
		FireCar fe2 = null;
		
		fe.water();
		car = fe; // car = (Car1) fe; 형변환 생략 가능
		
		// car.water(); // 에러 발생. Car 타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireCar)car; // 에러 발생 X
		fe2.water();
		
		
/* 다형성 Polymorphism
상속과 함께 객체지향개념의 중요한 특징 중 하나이다. 상속과 깊은 관계가 있기 때문에 상속을 완전히 이해하고 접근하는 것이 좋다.

다형성은 '여러 가지 형태를 가질 수 있는 능력'을 의미한다. 자바에서는 한 타입의 참조변수로
여러 타입의 객체를 참조할 수 있도록 함으로 다형성을 구현한다.

Tv class(부모)    <=     CaptionTv class(자식)
부모의 기능을 모두 가지고 있고 자신의 기능도 모두 가지고 있다.

Tv t = new Tv();
CaptionTv c = new CaptionTv();
-> 부모, 자식 거 모두 사용 가능

CaptionTv x = new Tv(); (사용이 불가)
-> 자식 타입의 참조변수로 조상 타입의 객체를 참조할 수 없다.

위와 같이 객체 t, c의 타입과 우측의 타입이 일치하는 것이 보통이지만 상속관계 있을 경우
부모 타입의 참조 변수로 자식 클래스의 객체를 참조하도록 하는 것도 가능하다.

// 자료타입        참조
Tv t2 = new CaptionTv(); // 조상 타입의 참조 변수로 자식 객체를 참조할 수 있다.
-> 부모 변수만 사용 가능

실제 객체가 CaptionTv 타입이라 하더라도 참조 변수 t로는 CaptionTv객체의 모든 멤버 변수를 사용할 수는 없다.

Tv (부모) 타입의 참조 변수로는 CaptionTv 객체 중에서 Tv 클래스의 멤버들(상속받은 것 포함) 만 사용할 수 있다.
따라서 생성된 CaptionTv 객체의 멤버 중에서 Tv클래스에 정의되지 않은 멤버는 사용이 불가하다.

둘 다 같은 타입의 객체지만 참조 변수의 타입에 따라(부모/자식) 사용할 수 있는 멤버의 개수가 달라진다.

참조 변수가 사용할 수 있는 멤버의 개수는 객체의 멤버 개수보다 같거나 적어야 한다.

오히려 객체 타입이 일치하는 참조 변수를 사용하면 모두 다 사용할 수 있는데 왜 굳이 조상 타입의 변수를 사용해서 일부만 사용할까?

조상 타입의 참조 변수로도 자손 클래스의 객체를 참조할 수 있다는 점, 그 차이에 대해서만 이해하자.

*. 참조변수의 형변환
기본형 변수와 같이 참조변수도 형변환이 가능하다. 단, 상속관계에 있는 클래스 사이에만 가능하고
자손 타입의 참조변수를 조상 타입의 참조변수로, 조상 타입의 참조변수를 자손타입의 참조변수로 형변환이 가능하다.
바로 윗 조상이나 바로 아래 자손이 아닌 조상의 조상으로도 형변환은 가능하다.

기본형 변수의 형변환에서 작은 자료형에서 큰 자료형의 형변환은 생략이 가능하듯 자손타입의 참조변수를
조상타입으로 형변환하는 경우는 생략 가능하다.
참조변수 간의 형변환 역시 캐스트 연산자를 사용하며 ()안에 변환하고자 하는 타입의 이름을 적는다.

자손타입 -> 조상타입: 형변환 생략 가능 Up casting
자손타입 <- 조상타입: 형변환 생략 불가 Down casting

Car <- FireCar
	<- AmbuCar
	
	class Car {}
	Class FireCar extends Car {}
	Class AmbuCar extends Car {}
	
	FireCar f;
	AmbuCar a;
	
	a = (AmbuCar) f; // 에러발생 상속관계가 아닌 클래스 간의 형변환은 불가
	f = (FireCar) a; // 에러발생 상속관계가 아닌 클래스 간의 형변환은 불가
	
	Car car = null;
	FireCar fe = new FireCar(); // 자식 객체 생성
	FireCar fe2 = null;
	
	car = fe; // car = (Car) fe; // 형변환 생략이 가능하다. Up casting
	fe2 = (FireCar) car; // 형변환 생략 불가, Down casting

*/

	}

}
