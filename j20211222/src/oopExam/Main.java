package oopExam;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// # 6-14
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//		
//		System.out.print("요소 수 : ");
//		int num = sc.nextInt();
//		
//		int[] a = new int[num];
//		int[] b = new int[num];
//		
//		for(int i = 0; i < a.length; i++) {
//			System.out.print("a[" + i + "] = ");
//			int num1 = sc.nextInt();
//			a[i] = num1;
//		}
//		
//		System.out.println("a의 모든 요소들을 역순으로 복사했습니다.");
//		
//		for(int i = 0; i < a.length; i++) {
//				b[i] = a[a.length - (i + 1)];
//			System.out.println("b[" + i + "] = " + b[i]);
//		}

		// # 6-13   어떻게 배열로 받은 것을 랜덤하게 입력할 수 있는지?
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//		
//		System.out.print("요소 수 : ");
//		int num = sc.nextInt();
//		
//		int[] a = new int[num];
//		int[] tmp = new int[num];
//		
//		for(int i = 0; i < a.length; i++) {
//			int r = rand.nextInt(99) + 1;
//			a[i] = r;
//			System.out.println("a[" + i + "] = " + r);
//		}
//		
//		System.out.println("요소를 섞었습니다.");
//		
//		for(int i = 0; i < a.length; i++) {
//			int j = rand.nextInt(num - 1);
//			tmp[j] = rand.nextInt(a[i]);
//			
//			System.out.println("a[" + i + "] = " + tmp[i]);
//		}
		
		// # 6-12
		
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//
//		System.out.print("요소 수 : ");
//		int num = sc.nextInt();
//		
//		int[] a = new int[num];
//
//		for (int i = 0; i < a.length; i++) {
//			int r = rand.nextInt(10) + 1;
//			a[i] = r;
//			for (int j = 0; j < a.length; j++) {
//				if(a[i] == a[j]) {
//					r = rand.nextInt(10) + 1;
//					a[i] = r;
//				} else break;
//		}
//			System.out.println("a[" + i + "] = " + r);
//		}
		
		// # 6-11
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//
//		System.out.print("요소 수 : ");
//		int num = sc.nextInt();
//		
//		int[] a = new int[num];
//
//		int i = 0;
//
//		while (i < a.length) {
//			int r = rand.nextInt(10) + 1;
//
//			if (i == 0) {
//				r = rand.nextInt(10) + 1;
//			} else if (i == a.length - 1) {
//				r = rand.nextInt(10) - 1;
//			} else if (a[i] == a[i + 1] || a[i] == a[i + 1]) {
//				r = rand.nextInt(10) + 1;
//			}
//			a[i] = r;
//			System.out.println("a[" + i + "] = " + r);
//			i++;
//		}

		// # 6-8
//		Scanner sc = new Scanner(System.in);
//		
//		int num;
//		
//		System.out.print("요소 수 : "); 
//		num = sc.nextInt();
//		
//		int[] a = new int[num];
//		
//		int i = 0;
//		
//		while(i < a.length) {
//			System.out.print("a[" + i + "] = ");
//			int num1 = sc.nextInt();
//			a[i] = num1;
//			i++;
//		}
//		System.out.println("찾을 숫자 : ");
//		int num2 = sc.nextInt();
//		
//		for(int n = 0; n < a.length; n++) {
//			if (num2 == a[n]) {
//				System.out.println("그 값은 a[" + n + "]에 있습니다.");
//				break;
//			} 
//			if (n == a.length - 1) {
//				System.out.println("찾으시는 값이 없습니다.");
//			}
//		}

	}

}
