package oopExam;

class Tv {
	boolean power; // 전원
	int channel; // 채널
	
	void power() {} //전원기능
	void channelUp() {} //채널 올림 기능
	void channelDown() {} // 채널 내림 기능
}

class CaptionTv extends Tv {
	boolean caption; // 캡션
	void caption() {}  // 캡션 기능
}

public class CaptionTvExam {

	public static void main(String[] args) {
		CaptionTv tv = new CaptionTv();
		tv.power();       // 부모 메서드
		tv.channel = 11;  // 부모 변수
		tv.channelUp();   // 부모 메서드
		System.out.println(tv.channel);
		
		tv.caption = true;
		tv.caption();
		System.out.println(tv.caption);
		
	}
}
