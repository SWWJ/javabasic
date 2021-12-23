package oopExam;

interface Repairable {}

class Units {
	int hitPoint;
	final int MAX_HP;
	Units(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Units {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Units {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150); // GroundUnit(int hp)에 150을 주고 MAX_HP = 150
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) {
		if (r instanceof Units) {
			Units u = (Units) r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
		}
		System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank); // Tank, Dropship은 Repairable을 구현하고 있다. 따라서 하나로 묶인다
		scv.repair(dropship);
//		scv.repair(marine); // 얘는 안 묶여 있다!  marine은 repairable을 구현하지 않고 있기 때문이다.
		
	}

}
