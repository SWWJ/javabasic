package oopExam;

class Car {
	String color;
	String gear;
	int door;
	
	Car() {
		
	}
	
	Car(String c, String g, int d) {
		color = c;
		gear = g;
		door = d;
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "red";
		c1.gear = "auto";
		c1.door = 4;
		
		// 위와 아래가 같은 것
		Car c2 = new Car("red", "auto", 4);

		System.out.println("c1의 색상은 " + c1.color);
		System.out.println("c2의 색상은 " + c2.color);

	}

}
