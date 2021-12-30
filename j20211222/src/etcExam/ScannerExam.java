package etcExam;

import java.util.*;

public class ScannerExam {

	public static void main(String[] args) {
/* Scanner는 문자 데이터를 입력받는 목적으로 JDK 1.5부터 추가되었다. 다양한 형태의 입력을 받아 처리할 수 있다.
 * 정규표현식과 함께 쓸 수 있다.
 * 
 * 1. hello         123
 * hello
 * 123
 * 
 * 
 * 2. hello    123       456
 * 
 * hello
 * 123
 * 456
 * 
 * q를 입력하면 종료
 * 
 */
		Scanner sc = new Scanner(System.in);
		String[] argArr = null;
		int i = 1;
		
		while(true) {
			System.out.print(i + ". ");
			String input = sc.nextLine();
			
			argArr = input.split(" +"); // 입력 받은 내용을 공백으로 자름, +는 반복 -> 몇 번 반복하든 상관 없음
			
			if(input.equals("q")) {
				break;
			} else {
				for(String a: argArr) {
					System.out.println(a.toLowerCase());
				}
			}
			i++;
		}
	}

}
