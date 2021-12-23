package j20211223;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// # 7-2
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 a : ");
//		int a = sc.nextInt();
//		
//		System.out.print("정수 b : ");
//		int b = sc.nextInt();
//		
//		System.out.print("정수 c : ");
//		int c = sc.nextInt();
//		
//		int min = a;
//		
//		if(min > b) {
//			min = b;
//		} else if (min > c) {
//			min = c;
//		} 
//		
//		System.out.println("최솟값은 " + min + "입니다.");

//		Scanner sc = new Scanner(System.in);

		// # 7-1
//		System.out.print("정수 x : ");
//		int x = sc.nextInt();
//		int n;
//		
//		if(x > 0) {
//			n = 1;
//		} else if(x < 0) {
//			n = -1;
//		} else {
//			n = 0;
//		}
//		
//		System.out.println("singOf(x)는 " + n + "입니다.");

		// # 6-18
//		Scanner sc = new Scanner(System.in);
//		
//		int[][] a = new int[4][3];
//		int[][] b = new int[3][4];
//		int[][] c = new int[4][4];
//		
//		System.out.println("행렬 a의 요소를 입력하세요.");
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print("a[" + i + "][" + j  + "]: ");
//				a[i][j] = sc.nextInt();
//			}
//		}
//		
//		System.out.println("행렬 b의 요소를 입력하세요.");
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 4; j++) {
//				System.out.print("b[" + i + "][" + j  + "]: ");
//				b[i][j] = sc.nextInt();
//			}
//		}
//		
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 4; j++) {
//				for(int k = 0; k < 3; k++) {
//					c[i][j] = a[i][k]*b[k][j];
//				}
//			}
//		}
//		
//		System.out.println("행렬 a와 b의 곱");
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 4; j++) {
//				System.out.print(c[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		// # 6-16 - 반복이 되지 않음
//		Random rand = new Random();
//		Scanner sc = new Scanner(System.in);
//
//		int k = 0;
//		int num1;
//
//		String[] seven = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
//		String[] mon = {"월", "화", "수", "목", "금", "토", "일"};
//		
//		System.out.println("요일명을 영어 소문자로 입력하시오.");
//
//		int i = 0;
//		int l = -1;
//
//		do {
//			int n;
//			do {
//				n = rand.nextInt(7);
//			} while(n == l);
//			l = n;
//
//			while (k == 0) {
//				System.out.print(mon[n] + "요일:");
//				String days = sc.next();
//
//				if (days.equals(seven[n])) {
//					System.out.println("정답입니다.");
//					k++;
//				} else {
//					System.out.println("틀렸습니다.");
//				}
//			}
//			System.out.print("다시 한번? 1...Yes/0...No:");
//			num1 = sc.nextInt();
//		} while(num1 == 1);
		
		// # 6-15 - 반복이 되지 않음
//		Random rand = new Random();
//		Scanner sc = new Scanner(System.in);
//
//		int k = 0;
//		int num1;
//
//		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
//				"October", "November", "December" };
//
//		System.out.println("해당 월의 영어 단어를 입력하시오.");
//		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
//
//		int i = 0;
//		int l = -1;
//
//		do {
//			int n;
//			do {
//				n = rand.nextInt(12);
//			} while(n == l);
//			l = n;
//
//			while (k == 0) {
//				System.out.print(n+1 + "월:");
//				String mon = sc.next();
//
//				if (mon.equals(month[n])) {
//					System.out.println("정답입니다.");
//					k++;
//				} else {
//					System.out.println("틀렸습니다.");
//				}
//			}
//			System.out.print("다시 한번? 1...Yes/0...No:");
//			num1 = sc.nextInt();
//		} while(num1 == 1);
	}

}
