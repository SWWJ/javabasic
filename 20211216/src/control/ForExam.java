package control;

import java.util.Scanner;

public class ForExam {
	
/* for 반복문 : 어떤 작업을 반복적으로 수행되도록 할 때 사용
  반복 횟수를 정확히 특정할 때 주로 사용된다.
  문법이 직관적이라 가독성이 좋다.
  
  기본형태
  		for(start ; stop ; step)
 			 초기값        조건식       증감식
 초기값(한번) -> 조건식 -> 수행 문장들 -> 증감식
 	      -> 조건식 -> 수행 문장들 -> 증감식
 	      -> 조건식 -> 수행 문장들 -> 증감식
 	      -> 조건식 -> 종료 
 	      
 초기값 : 반복문에 사용할 변수를 초기화 처음에 딱 한 번만 실행된다.
 	       보통은 변수를 하나만 사용하지만 2개 이상도 가능하긴 하다.
 	       
 	       for(int i=1, j=0; i<10; i++) {}
 	       
 조건식 : 조건식의 값이 참일 경우 계속 반복 실행하다가 거짓이 되는 경우 반복을 종료한다.
  	       조건식을 잘못 설정할 경우 한번도 실행되지 않는 경우가 발생할 수도 있고 영원히 반복되는 경우가 발생할 수 있다.(무한루프)
  	       
 증감식 : i++, i--; i += 2(i = i + 2)
 
 	       초기값, 조건식, 증감식 전부 혹은 하나를  생략할 수 있다.
 	       
 	       for (;;) 무한반복
 	       
 	       quiz 1부터 5까지를 
 	       1
 	       2
 	       3
 	       4
 	       5
 	       12345
 
 */

	public static void main(String[] args) {
		
//		for(int i=1; i<=5; i++) {
//			System.out.println(i);
//		} for(int i=1; i<=5; i++) {
//			System.out.print(i);
//		}
		
		// 1~10 합 누계값까지
		
//		int total = 0;
//		
//		for(int i = 1; i <= 10; i++) {
//			total = total + i;
//			// System.out.printf("1부터 %d까지의 합: %d%n", i, i += total += i);
//			System.out.println("1부터 " + i + "까지의 합 : " + total);
//		}
		
//		for(int i = 1, j = 10; i <= 10; i++, j--) {
//			
//				System.out.printf("%d \t %d%n", i , j);
//				// \t 는 일정 간격 벌리기
//		}
/*1 	 10
2 	 9
3 	 8
4 	 7
5 	 6
6 	 5
7 	 4
8 	 3
9 	 2
10 	 1
*/
		
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//			System.out.printf("%d * %d = %d\t", i, j, i*j);
//			}
//			System.out.println();
//			}

		Scanner sc = new Scanner(System.in);
		
//		System.out.print("*을 출력할 라인의 수를 입력하세요 > "); 
		
//		int num = 5;
		
		// 삼각형 만들기
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) { // 5줄이면 4개까지만
//				System.out.print("*");
//				}
//			System.out.println();
//			}
		
		// 역삼각형 만들기
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 5; j >= i; j--) { // 5줄이면 4개까지만
//				System.out.print("*");
//				}
//			System.out.println();
//			}
		
		// 향상된 for 구문 - for each
		// for (타입 변수명 : 배열 또는 컬렉션) {
		
//	 	}
		
		int[] arr = {1, 2, 3, 4, 5};
		
		//1      2      3      4      5
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]); // Array에서 몇 번째를 꺼내쓴다는 개념
//		}
		int sum = 0;
		int count = 0;
		
		for (int i : arr) { // 타입   변수명  : 배열?
			System.out.println(i); // 그냥 하나씩 꺼내는 것
			sum += i;
			count++; // count += 1; -> 꺼낼 때마다 하나씩 더함
		}
		System.out.printf("총합은 %d%n", sum);
		System.out.printf("갯수는 %d", count);

	}

}
