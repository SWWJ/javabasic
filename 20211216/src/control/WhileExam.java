package control;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
/* while 반복문은 for에 비해 구조가 간단하다. 조건식이 참일 동안 반복적으로 수행.
 * 조건식 생략 불가, 보통 조건식에 true를 넣어 무한반복 수행
 * for(;;) == while(true)
 * 무한반복 설정 시에는 반드시 종료 조건을 만들어야 한다.
 
 while(조건식) {
 
 }
 
 for(초기화; 조건식; 증감식)
 for(int i = 0; i < 5; i++)
 
 초기화
 
 while(조건식) {
 증감식
 }

int i = 0;

while(i<5) {
i++   수행문장
}
*/
		
//		int i = 11;
//		System.out.println("카운트다운 시작");
//		
//		while(i > 1) {
//			i--;
//			System.out.println(i);
//			long j = 9_999_999_999l; // _는 자리 표시, 계속 처리하게 해서 시간 지연
//			while(j >= 0) {
//				j--;
//			}
//		}
//		System.out.println("Awesome!!");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 > "); int num = sc.nextInt();
		int n = 1;
		int sum = 0;
		
		while(n <= num) { // n이 i까지 증가
		sum += n;
		System.out.println(n + "-" + sum);
		n++;
		}
			
//		System.out.print("숫자를 입력하세요 > "); int i = sc.nextInt();
//		int sum = 0;
//		
//		while(i != 0) {
//			sum += i%10;
//			i /= 10; // /10을 계속 한 것을 저장   i = i/10;
//		}
//		System.out.println("각 자리수의 합: " + sum);
		
		

	}

}
