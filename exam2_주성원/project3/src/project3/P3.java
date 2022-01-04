package project3;

import java.util.Random;
import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 객체인 sc를 생성
		Random rand = new Random(); // Random 객체인 rand를 생성
		int yn = 1;
		int sum = 0;
		int ans = 0;
		String[] op = {"+", "-"}; // 연산자 +와 -를 보관하는 배열 op를 생성
		System.out.println("암산 훈련!!");
		do {
			int num1 = rand.nextInt(900) + 100; // 3자리 난수를 생성
			int num2 = rand.nextInt(900) + 100;
			int num3 = rand.nextInt(900) + 100;
			int rn1 = rand.nextInt(2); // 연산자를 꺼내기 위한 난수 생성
			int rn2 = rand.nextInt(2);
			do {
				System.out.print(num1 + op[rn1] + num2 + op[rn2] + num3 + "="); // 발생한 난수로 이루어진 문제 출력
				ans = sc.nextInt(); // 사용자의 답 입력
				if (rn1 == 0 && rn2 == 0) { // 연산자가 나올 경우의 수의 결과 지정
					sum = num1 + num2 + num3;
				} else if (rn1 == 0 && rn2 == 1) {
					sum = num1 + num2 - num3;
				} else if (rn1 == 1 && rn2 == 1) {
					sum = num1 - num2 - num3;
				} else {
					sum = num1 - num2 + num3; 
				}
				if(sum != ans) {
					System.out.println("틀렸습니다!");
				}
			} while(sum != ans); // 컴퓨터가 계산한 값이 사용자가 입력한 답과 맞지 않을 경우에만 반복 실행
			System.out.print("다시 한 번?<Yes..1/No..0>:");
			yn = sc.nextInt();
		} while(yn == 1); // yn이 0이 아닌 1일 시에만 계속 반복
		
	}
	
}
