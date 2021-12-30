package exceptionExam;

import java.util.Random;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// # 7-17
//		Scanner sc = new Scanner(System.in);
//
//		int fn = 0;
//		int ln = 0;
//		String ax = "";
//
//		System.out.print("요소 수:");
//		int x = sc.nextInt();
//
//		int[] a = new int[x];
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("x[" + i + "]:");
//			int j = sc.nextInt();
//			a[i] = j;
//		}
//
//		System.out.print("찾는 값:");
//		int find = sc.nextInt();
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] == find) {
//				fn = i;
//				break;
//			}
//		}
//
//		for (int i = a.length - 1; i >= 0; i--) {
//			if (a[i] == find) {
//				ln = i;
//				break;
//			}
//		}
//
//		if (fn != ln) {
//			System.out.println("해당 값의 요소가 여러 개 존재합니다.");
//			System.out.println("가장 앞에 위치한 값은 x[" + fn + "]에 있습니다.");
//			System.out.println("가장 뒤에 위치한 값은 x[" + ln + "]에 있습니다.");
//		} else if (fn == ln) {
//			System.out.println("해당 값의 요소가 한 개 존재합니다.");
//			System.out.println("값은 x[" + fn + "]에 있습니다.");
//		} else {
//			System.out.println("찾으시는 값이 없습니다.");
//		}
//
//		System.out.println();

		// # 7-16

//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("사람 수는:");
//		int a = sc.nextInt();
//
//		int min = 0;
//		int min1 = 0;
//
//		int[] h = new int[a];
//		int[] w = new int[a];
//
//		System.out.println(a + "명의 신장과 체중을 입력하자.");
//
//		for (int i = 0; i < a; i++) {
//			System.out.print((i + 1) + "번의 신장:");
//			int h1 = sc.nextInt();
//			h[i] = h1;
//
//			System.out.print((i + 1) + "번의 체중:");
//			int w1 = sc.nextInt();
//			w[i] = w1;
//		}
//
//		for (int i = 0; i < a; i++) {
//			min = w[i];
//			if (i + 1 == a) {
//				break;
//			} else if (min > w[i + 1]) {
//				min = w[i + 1];
//			}
//		}
//
//		for (int i = 0; i < a; i++) {
//			min1 = h[i];
//			if (i + 1 == a) {
//				break;
//			} else if (min1 > h[i + 1]) {
//				min1 = h[i + 1];
//			}
//			min1 = h[i];
//		}
//
//		System.out.println("가장 키가 작은 사람의 신장:" + min + "cm");
//
//		System.out.println("가장 마른 사람의 신장:" + min + "kg");

		// # 7-15
//				Scanner sc = new Scanner(System.in);
//				int sum = 0;
//				
//				System.out.print("요소 수:");
//				int i = sc.nextInt();
//				
//				int[] a = new int[i];
//				
//				for(int j = 0; j < a.length; j++) {
//					System.out.print("a[" + j + "]:");
//					int ar = sc.nextInt();
//					a[j] = ar;
//					sum += a[j];
//				}
//				
//				System.out.println("모든 요소의 합은 " + sum + "입니다.");
		// # 7-10
//				Scanner sc = new Scanner(System.in);
//				Random rand = new Random();
//				
//				String[] j = {"+", "-"};
//				
//				System.out.println("암산 훈련!!");
//				int yn = 1;
//				int result = 0;
//				
//				do {
//				int f = rand.nextInt(999-100) + 100;
//				String k = j[rand.nextInt(2)];
//				int s = rand.nextInt(999-100) + 100;
//				String l = j[rand.nextInt(2)];
//				int t = rand.nextInt(999-100) + 100;
//				
//				if(k.equals("+") && l.equals("+")) {
//					result = f + s + t;
//				} else if(k.equals("+") && l.equals("-")) {
//					result = f + s - t;
//				} else if(k.equals("-") && l.equals("+")) {
//					result = f - s + t;
//				} else if(k.equals("-") && l.equals("-")) {
//					result = f - s - t;
//				}
//				System.out.print(f + k + s + l + t + "=");
//				
//				int res = sc.nextInt();
//				if(res == result) {
//					System.out.print("다시 한 번?<Yes..1/No..0>:");
//					yn = sc.nextInt();
//				} else {
//					System.out.println("틀렸습니다!");
//				}
//				
//				} while(yn != 0);

		// # 7-9
//		Scanner sc = new Scanner(System.in);
//		int yn = 1;
//		int a;
//
//		do {
//			System.out.print("양의 정숫값:");
//			a = sc.nextInt();
//			while(a <= 0) {
//				System.out.print("양의 정숫값:");
//				a = sc.nextInt();
//			}
//			System.out.print("반대로 읽으면 ");
//			while (a > 0) {
//				System.out.print(a % 10);
//				a /= 10;
//			}
//			System.out.print("입니다.");
//			System.out.print(" 다시 한 번?<Yes..1/No..0>:");
//			yn = sc.nextInt();
//
//		} while (yn == 1);

	}

}
