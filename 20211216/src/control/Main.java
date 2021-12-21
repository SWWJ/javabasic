package control;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		  // # 6-6
//		Scanner sc = new Scanner(System.in);
//		System.out.print("요소 수:"); int num = sc.nextInt();
//		
//		int[] a = new int[num];
//		
//		for(int i = 0; i < a.length; i++) {
//			System.out.print("a[" + i + "] = ");
//			a[i] = sc.nextInt();
//		}
//		System.out.print("a = {");
//		
//		for(int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//			
//			if(i < a.length - 1) {
//				System.out.print(",");
//			}
//		}
//		
//		System.out.print("}");
		
		
		  // # 6-3
//		  double[] a = new double[5];
//		  
//		  a[0] = 1.1;
//		  a[1] = 2.2;
//		  a[2] = 3.3;
//		  a[3] = 4.4;
//		  a[4] = 5.5;
//		  
//		  for(int i = 0; i < a.length; i++) {
//			  System.out.println("a[" + i + "] = " + a[i]);
//		  }
		  
		  // # 6-2
//		  int[] a = new int[5];
//		  
//		  for(int i = 0; i < a.length; i++) {
//			  System.out.println("a[" + i + "] = " + (a.length - i));
//		  }
		  
		  // # 6-1
//		  double[] a = new double[5];
//		  
//		  for(int i = 0; i < a.length; i++) {
//			  System.out.println("a[" + i + "] = " + a[i]);
//		  }
		  
		  // # 4-30
//		    Scanner sc = new Scanner(System.in);
//		    Random rand = new Random();

//		    int r = rand.nextInt(100);
//		    
//		    System.out.println("숫자 맞추기 게임 시작!\n0부터 99사이의 숫자를 맞추세요.");
//		    
//		    int i = 6;
//		    int n = 0;
//		    
//		    while(true) {
//		    	System.out.print("남은 횟수" + i + "회, 어떤 숫자일까?:");
//		    	int num = sc.nextInt();
//		    	if(num == r) {
//		    		n++;
//		    		System.out.println(n + "회만에 맞추었습니다.");
//		    		break;
//		    	} else if(num > r) {
//		    		System.out.println("더 작은 숫자입니다.");
//		    	} else {
//		    		System.out.println("더 큰 숫자입니다.");
//		    	}
//		    	i--;
//		    	if(i == 0) {
//		    		System.out.println("모든 시도를 실패했습니다.");
//		    		break;
//		    	}
//		    }
		    
		  }

}
