package javaExam;

import java.util.Scanner;
public class StarExam {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("단수는? > "); int star = sc.nextInt();
		
		// 왼쪽 아래가 직각인 삼각형
//		for (int i = 1; i <= star; i++) { // 줄 1부터 시작, 
//			for (int j = 1; j <= i; j++) { // 별 1부터 시작, 별 j개는 star보다 작거나 같은 i보다 작거나 같다
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 왼쪽 위가 직각인 삼각형
//		for (int i = 1; i <= star; i++) {
//			for (int j = star; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 오른쪽 위가 직각인 삼각형
//		for (int i = 1; i <= star; i++) {
//			for (int k = 2; k <= i; k++) {
//				System.out.print(" ");
//			} for (int j = star; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 오른쪽 아래가 직각인 삼각형
//		for (int i = 1; i <= star; i++) {
//			for (int k = star - 1; k >= i; k--) {
//				System.out.print(" ");
//			} for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			} 
//			System.out.println();
//		}

	}

}
