package exams;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// # 7-27
//		int[][] a = {{1, 2, 3},{4, 5, 6}};
//		int[][] b = {{6, 3, 4},{5, 1, 2}};
//		
//		int[][] c = new int[2][3];
//		
//		System.out.println("행렬a");
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("행렬b");
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print(b[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 3; j++) {
//				c[i][j] = a[i][j] + b[i][j];
//			}
//		}
//		
//		System.out.println("행렬c");
//		for(int i = 0; i < 2; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print(c[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// # 7-26
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("요소 수:");
//		int x = sc.nextInt();
//		
//		int[] a = new int[x];
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("x[" + i + "]:");
//			int y = sc.nextInt();
//			a[i] = y;
//		}
//		
//		System.out.print("삽입할 인덱스:");
//		int idx = sc.nextInt();
//		
//		System.out.print("삽입할 값:");
//		int num = sc.nextInt();
//		
//		int[] b = new int[x+1];
//		
//		for(int i = 0; i < a.length; i++) {
//			if(i < idx) {
//				b[i] = a[i];
//			} else if(i == idx) {
//				b[i] = num;
//				i--;
//			} else {
//				b[i + 1] = a[i];
//			}
//		}
//		
//		for(int i = 0; i < b.length; i++) {
//			System.out.println("y[" + i + "] = " + b[i]);
//		}
		
		// # 7-25
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("요소 수:");
//		int x = sc.nextInt();
//
//		int[] a = new int[x];
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("x[" + i + "]:");
//			int y = sc.nextInt();
//			a[i] = y;
//		}
//
//		System.out.print("삭제를 시작할 인덱스:");
//		int idx = sc.nextInt();
//
//		System.out.print("삭제할 요소의 개수:");
//		int num = sc.nextInt();
//
//		if (num > x) {
//			System.out.println("진행할 수 없습니다.");
//		} else {
//		int[] b = new int[x - num];
//		
//			for (int i = 0; i < b.length; i++) {
//				if (i >= idx && i <= idx + num - 1) {
//					b[i] = a[i + num];
//				} else {
//					b[i] = a[i];
//				}
//			}
//		
//	
//		
//		for(int i = 0; i < b.length; i++) {
//			System.out.println("y[" + i + "] = " + b[i]);
//		}
//	}

		// # 7-24
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("요소 수:");
//		int x = sc.nextInt();
//		
//		int[] a = new int[x];
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("x[" + i + "]:");
//			int y = sc.nextInt();
//			a[i] = y;
//		}
//		
//		System.out.print("삭제할 요소의 인덱스:");
//		int idx = sc.nextInt();
//		
//		int[] b = new int[x-1];
//		
//		for(int i = 0; i < b.length; i++) {
//			if(i != idx) {
//				b[i] = a[i];
//			} else {
//				i--;
//			}
//		}
//		
//		for(int i = 0; i < b.length; i++) {
//			System.out.println("y[" + i + "] = " + b[i]);
//		}

		// # 7-23
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("요소 수:");
//		int x = sc.nextInt();
//
//		int[] a = new int[x];
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("x[" + i + "]:");
//			int y = sc.nextInt();
//			a[i] = y;
//		}
//
//		System.out.print("탐색할 값:");
//		int z = sc.nextInt();
//
//		System.out.println("일치하는 요소의 인덱스");
//		
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] == z) {
//				System.out.println(i);
//			} 
//		}

	}

}
