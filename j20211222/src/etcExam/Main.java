package etcExam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// # 7-22
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("요소 수:");
//		int a = sc.nextInt();
//		int b;
//		
//		int[] x = new int[a];
//		int[] y = new int[a];
//		
//		for(int i = 0; i < x.length; i++) {
//			System.out.print("x[" + i + "]:");
//			b = sc.nextInt();
//			x[i] = b;
//		}
//		
//		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
//		
//		for(int i = 0; i < y.length; i++) {
//			y[i] = x[i];
//			System.out.println("y[" + i + "] = " + y[i]);
//		}
		
		// # 7-21
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("배열 a의 요소 수:");
//		int x = sc.nextInt();
//		int d;
//		int e;
//
//		int[] a = new int[x];
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.print("a[" + i + "]:");
//			d = sc.nextInt();
//			a[i] = d;
//		}
//
//		System.out.print("배열 b의 요소 수:");
//		int y = sc.nextInt();
//
//		int[] b = new int[y];
//
//		for (int i = 0; i < b.length; i++) {
//			System.out.print("b[" + i + "]:");
//			e = sc.nextInt();
//			b[i] = e;
//		}
//		
//		int min;
//		
//		min = x;
//		
//		if(min > y) {
//			min = y;
//		}
//
//		int[] c = new int[x];
//
//		System.out.println("배열 a와 b를 전체 요소를 교환했습니다.");
//
//		for (int i = 0; i < min; i++) {
//			c[i] = a[i];
//			a[i] = b[i];
//			b[i] = c[i];
//		}
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("a[" + i + "] = " + a[i]);
//		}
//
//		for (int i = 0; i < b.length; i++) {
//			System.out.println("b[" + i + "] = " + b[i]);
//		}

		// # 7-20
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("요소 수:");
//		int x = sc.nextInt();
//		int y = 0;
//		
//		int[] a = new int[x];
//		
//		for(int i = 0; i < a.length; i++) {
//			System.out.print("a[" + i + "]:");
//			y = sc.nextInt();
//			a[i] = y;
//		}
//		
//		System.out.print("삽입할 요소의 인덱스:");
//		int idx = sc.nextInt();
//		
//		System.out.print("삽입할 값:");
//		int num = sc.nextInt();
//		
//		a[idx] = num;
//		
//		for(int i = 0; i < a.length; i++) {
//			System.out.println("a[" + i + "] = " + a[i]);
//		}

		// # 7-19
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("요소 수 : ");
//		int x = sc.nextInt();
//		
//		int[] a = new int[x];
//		int b;
//		int index;
//		
//		for(int i = 0; i < a.length; i++) {
//			System.out.print("a[" + i + "] = ");
//			b = sc.nextInt();
//			a[i] = b;
//		}
//		
//		System.out.print("삭제를 시작할 인덱스:");
//		int i = sc.nextInt();
//		
//		System.out.print("삭제할 요소의 수:");
//		int j = sc.nextInt();
//		
//		int count = 0;
//		
//		index = i;
//		
//		if(x > i + j) {
//		do {
//			a[i] = a[i + j];
//			i++;
//			count++;
//		} while(count + j < x);
//		} // ArrayIndexOutOfBoundsException
//		
//		for(int k = 0; k < a.length; k++) {
//			System.out.println("a[" + k + "] = " + a[k]);
//		}
		// # 7-18
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("요소 수 : ");
//		int x = sc.nextInt();
//		
//		int[] a = new int[x];
//		int b;
//		int index;
//		
//		for(int i = 0; i < a.length; i++) {
//			System.out.print("a[" + i + "] = ");
//			b = sc.nextInt();
//			a[i] = b;
//		}
//		
//		System.out.print("삭제할 요소의 인덱스:");
//		index = sc.nextInt();
//		
//		int i = index;
//		
//		do {
//			a[i] = a[i + 1];
//			i++;
//		} while(i < a.length - 1);
//		
//		for(int j = 0; j < a.length; j++) {
//			System.out.println("a[" + j + "] = " + a[j]);
//		}
	}

}
