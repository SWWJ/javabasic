package oopExam;

class Car2 {
	String color;
	String gear;
	int door;
	
	Car2() {
		this("white", "auto", 4);
	}
	
	Car2(String color, String gear, int door) {
		this.color = color;
		this.gear = gear;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
//		c1.color = "red";
//		c1.gear = "auto";
//		c1.door = 4;
//		
//		// 위와 아래가 같은 것
//		Car c2 = new Car("red", "auto", 4);

		System.out.println("c1의 색상은 " + c1.color);
//		System.out.println("c2의 색상은 " + c2.color);

	}

}
