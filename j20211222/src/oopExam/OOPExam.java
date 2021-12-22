package oopExam;

public class OOPExam {

	public static void main(String[] args) {
	/* 객체지향의 핵심은 '실제 세계는 객체로 이루어져 있고 발생하는 모든 사건들은
	 객체들간의 상호작용이다.' 실제 세계를 컴퓨터 속에 옮겨 놓은 것과 같은 가상세계
	 를 구현하고 이를 통해 많은 비용과 시간을 절약할 수 있다. 
	
	객체지향 언어의 특징 (재사용성, 유지보수, 중복코드 제거)
	1. 코드의 재사용성이 높다. 새로운 프로그램을 만들 때 기존에 만들어 놓은 코드를
	   그대로 가져다가 쓸수 있다.
	2. 코드의 관리가 용이하다. 코드들 간의 관계를 이용하여 적은 노력으로 쉽게 
	 코드를 변경하여 업데이트 할 수 있다. 
	3. 신뢰성이 높은 프로그래밍을 가능하게 한다. 
	 코드의 중복을 제거하고 새로운 코드 작성에 따른 오작동을 미연에 방지 할수 있다. 
	 
	 
	 클래스와 객체
	 
	 클래스의 정의 - 클래스는 객체를 정의 한다. 
	 클래스의 용도 - 클래스는 객체를 생성 한다. 
	 
	 객체의 사전적인 의미는 ' 실제로 존재하는 것 ' 
	 
	 객체의 정의 - 객체는 실제로 존재하는 사물 또는 개념
	 객체의 용도 - 각 객체들의 기능과 속성에 따라 달라진다. 
	 
	 유형의 객체 - 책상, 자동차, TV .....등의 사물
	 무형의 객체 - 수학 공식, 프로그램 에러 등의 논리나 개념
	 
	클래스 - 자동차 설계도, 붕어빵기계
          객체 -      자동차, 붕어빵 
          
     클래스를 한번 만 제대로 만들기만하면 매번 객체를 어떻게 만들까 고민할 필요가 없다. 
   
     
     객체와 인스턴스 
        객체는 단독으로 표현할 때 사용하는 명칭이며 
  인스턴스는 클라스와의 연계된 표현이 필요할 경우 사용된다. 
  
  	예 ) 책상은 객체다 (o)   책상은 목수 클래스로 만든 인스턴스이다.(o)
  	   책상은 인스턴스다(x)   책상은 목수 클래스로 만든 객체이다.(x)
  	   
  	객체의 구성요소 ( 속성property, 기능function)
  	   속성property - 변수, 특성, 필드, 상태
          기능function - 매서드, 함수, 행위 
          
     TV 객체      1) 속성 - 크기, 너비, 높이, 색상....     
              2) 기능 - 켜기, 끄기, 채널벼경, 볼륨변경....
          
     객체 생성 방법 
     
          Tv t = new Tv();
          Tv클래스 타입의 참조변수 t를 선언하여 Tv 인스턴스 를 생성한 후 
                  생성된 Tv인스턴스의 주소를 t에 저장한다. 
          
   # 객체 배열
   
          많은 수의 객체들을 다뤄야 할때 배열로 사용하면 더욱 편리하다. 
         예를 들면 게시물 객체들을 배열로 모두 담아 처리하면 수월하게 게시판 관리를 
            할수 있다. 엄밀히 말하면 실제 객체들이 배열에 저장되는 것이 아니라.
     실제 객체들이 위치한 위치값을 저장하게 된다. 
          
*/
//	Tv[] tvArr = new Tv[3];
//	//Tv클래스로 만든 객체들만 담을수 있는 tvArr 배열을 3개짜리로 생성
//	for(int i = 0 ; i < tvArr.length ; i++) {
//		tvArr[i] = new Tv(); //새로운 Tv객체 3개 생성 후 tvArr 저장 
//		tvArr[i].channel = i + 10; //tvArr[i]의 channel 에 i+10 저장
//	}
//	
//	for(int j = 0; j <tvArr.length;j++) {
//		tvArr[j].channelUp();
//		System.out.printf("tvArr[%d].channel=%d%n", j, tvArr[j].channel);
//	}
		
//		int result = add(3,5);
//		int result = add(3,5,1);   // 에러 개수가 다름
//		int result = add(1.0,2.0); // 에러 타입이 다름
//	}
//	
//	int add(int x, int y) {
//		int result = x + y;
//		return result;
		
		
		
		
		
	}

}

//class Tv {
//	String color;
//	boolean power;
//	int channel;
//	
//	void power() {
//		power = !power;
//	}
//	void channelUp() {
//		++channel;
//	}
//	void channelDown() {
//		--channel;
//	}
//}