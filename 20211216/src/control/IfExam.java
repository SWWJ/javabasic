package control;

import java.util.Random;
import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
/* 제어문 control statement - if, switch
       코드의 제일 위에서부터 아래로 한 문장씩 순차적으로 진행되는 프로그램의 흐름을 조절하여 일부분은 건너뛰기도 하고
       다시 위에서부터 내려올 수 있게 제어한다.
       
       if(조건문) {
       true case;
       }
       
       if(score > 60) {
       System.out.println("합격");
       }
 
 */
//		int score = 80;
//		
//	     if(score > 60) {// 80 > 60 - true
//	     	System.out.println("합격");
//	          }
	     
/*
 (90 <= x && x <= 100) 점수 x가 90점 이상 100점 이하 동시 만족
 (x < 0 || x > 100) 점수 x가 0 미만 또는 x가 100 초과 하나만 만족해도 true
 (x % 3 == 0 && x % 2 != 0) x가 3의 배수이기는 하지만 2의 배수는 아닌 조건
 depar == "영업부" || depar == "기획부" 영업부와 기획부만 조건
 
*/
		
//		if (false) {
//			System.out.println("welcome");
//			System.out.println("hello"); // true라 찍힌 것이 아님. if의 영향을 받지 않음
//		}

/* if - else 구문
else는 그 밖의 나머지 모든 것.

if(조건식) {
	true
	} else {
	else
	}

*/		
		
/* if - else if구문
if else는 경우의 수가 두개(분기가 두 개)수행되는 구조인 반면 처리해야 할 경우의 수가 3개 이상일 때 사용 - else if

조건식을 만족하면 더 이상 다른 조건식을 확인하지 않는다.

          if(조건식1) {
			true
			} else if (조건식2){
			true
			} else {
			else
			}
			
			//중첩 if
          if(조건식1) {
			true
			} else {
				if (조건식) {
					true
				} else {
				else
			}
			
			quiz 2 점수 입력 받아 98 이상이면 A+ 94이상 A 90이상 A-
			Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요. > "); int score = sc.nextInt();
		
		
		if (score >= 90) {
			System.out.print("A");
		} else if (score >= 80) {
			System.out.print("B");
		} else if (score >= 70) {
			System.out.print("C");
		} else if (score >= 60) {
			System.out.print("D");
		} else {
			System.out.println("F");
		}
		
		if (score % 10 >= 8 && score > 60) {
			System.out.print("+");
		} else if (score % 10 >= 4 && score > 60) {
			System.out.print(" ");
		} else if (score % 10 == 0 && score > 60) {
			System.out.print("-");
		}			
		
		println(삼항연산자)
			
			switch 구문
			if 문의 경우 항목이 많아질수록 복잡해지고 코드 가독성이 많이 떨어지게 된다.
			평균적인 처리시간도 항목이 늘어날수록 길어지게 된다.
			이러한 if문과 달리 switch보다 간결하고 알아보기 쉽다.
			보통 처리해야 하는 경우의 수가 아주 많을 경에 switch를 쓴다.
			switch로 만든 구문은 if로 구현할 수 있지만 if로 모든 구문을 switch로 구현할 수는 없다.
			
			1. 조건식을 계산한다.
			2. 조건식을 만족하는 case문으로 이동한다.
			3. 해당 case문의 구문들을 실행한다.
			4. break를 만나기 전까지는 모든 구문을 전부 실행한다.
			*. switch 구문의 조건식의 결과는 정수 또는 문자열이다.
			
			특정 월을 입력
			
		*/	
		
//		Scanner sc = new Scanner(System.in);
//		
//		int season = sc.nextInt();
		// int a = sc.nextInt();
		// switch (season) {
		// case 3 : case 4 : case 5 : season = "봄"; break; }
		// System.out.println(a + "월의 계절은 " + season + "입니다.);
		
//		switch(season) {
//		case 1 : case 2 : case 12: System.out.println(season + "월의 계절은 겨울입니다.");
//			break;
//		case 3 : case 4 : case 5 : System.out.println(season + "월의 계절은 봄입니다.");
//			break;
//		case 6 : case 7 : case 8 : System.out.println(season + "월의 계절은 여름입니다.");
//			break;
//		case 9 : case 10 : case 11 : System.out.println(season + "월의 계절은 가을입니다.");
//			break;
//		}
		
		// 가위(1) 바위(2) 보(3)
		// Math
		
		// 가위바위보 중 하나를 입력하세요.> 1
		// 당신은 가위이고 컴퓨터는 ~~입니다.
		// 컴퓨터가 이겼습니다.
		
		// 가위바위보 중 하나를 입력하세요.> 1
		// 당신은 가위이고 컴퓨터는 ~~입니다.
		// 당신이 이겼습니다.
		
		// 가위바위보 중 하나를 입력하세요.> 1
		// 당신은 가위이고 컴퓨터는 ~~입니다.
		// 비겼습니다.
		
		// 모든 경우의 수를 찾아 최소한으로 줄이는 것이 중요
		
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//		
//		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 > "); int a = sc.nextInt();
//		
//		int b = 1 + rand.nextInt(3); // ~3 -> 0, 1, 2, 3 -> 시작 +1
//		System.out.println("당신은 " + a + "이고 컴퓨터는 " + b + "입니다.");
//		
//		switch(a - b) {
//		case -1 : case 2 : System.out.println("컴퓨터가 이겼습니다."); break;
//		case 1 : case -2 : System.out.println("사람이 이겼습니다."); break;
//		case 0 : System.out.println("비겼습니다."); break;
//		}
		
//		주민등록번호를 입력하세요. 당신은 남성입니다 / 당신은 여성입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력하세요 > "); String num = sc.nextLine();
		char number = num.charAt(7);
		
		switch(number) {
		case '1' : case '3' : System.out.println("당신은 남성입니다."); break;
		case '2' : case '0' : System.out.println("당신은 여성입니다."); break;
		}
		
//		.charAt();
		
		}
		
	}


