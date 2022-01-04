package project2;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner 객체 sc를 생성
		System.out.print("요소 수:");
		int num = sc.nextInt(); // Scanner 객체로 요소 수를 입력받음
		int count = 0;
		int arNum = 0;
		int[] x = new int[num]; // 입력받은 요소 수로 배열 x를 생성함
		for(int j = 0; j < x.length; j++) {
			System.out.print("x[" + j + "]:");
			int arrNum = sc.nextInt(); // 배열 x의 j번째 값을 키보드를 통해 입력받음
			x[j] = arrNum;
		}
		System.out.print("탐색할 값:");
		int find = sc.nextInt(); // 탐색할 값을 변수 find에 저장
		for(int j = 0; j < x.length; j++) {
			if(find == x[j]) {
				count++; // 배열의 수를 맞추기 위해 탐색할 값이 몇 개인지 확인
			}
		}
		int[] y = new int[count]; // 탐색한 값의 수 만큼의 배열을 생성
		for(int j = 0; j < x.length; j++) {
			if(find == x[j]) {
				y[j - arNum] = j; // 배열 y의 j번째에서 찾지 않는 값의 인덱스는 빼고 적용
			} else {
				arNum++; // 맞지 않는 인덱스의 개수를 줄이기 위한 카운트
			}
		}
		
		System.out.println("일치하는 요소의 인덱스");
		for(int j = 0; j < y.length; j++) {
				System.out.println(y[j]); // 일치하는 요소의 인덱스를 출력함.
		}
	}
}
