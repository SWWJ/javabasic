package oopExam;

public class recursiveExam {

	public static void main(String[] args) {
/* 재귀 호출 - recursive call
메서드 내부에서 자기 자신 메서드를 다시 호출
무한히 자기 자신을 호출하기 때문에 무한 반복에 빠지게 된다. 따라서 조건문을 통한 탈출이
필수적으로 따라다닌다. 

void method(int n) {
	if (n == 0) {
		return;
	}
	System.out.println(n);
	method(--n);
} -> for문으로 구현 가능

반복문은 같은 문잘을 반복해서 수행하지만 재귀 호출은 반복문보다 몇 가지 과정
예를 들면 매개변수 복사 종료 후 복귀할 주소 저장 등 내부적으로 추가로 필요한 과정들이 많아
일반적으로 반복문보다 재귀호출이 수행시간이 더 오래 걸린다.

왜 반복문 대신 재귀를 사용? 큰 이유는 재귀의 논리적 간결함

재귀 호출은 비효율적이므로 재귀 사용에 드는 비용보다 간결함이 주는 이득이 월등히 충분히 큰 경우에만
사용할 것을 권장한다.

5! = 5*4*3*2*1
3! = 3*2*1
*/
		

		System.out.println(recursiveExam.facfor(5));
		System.out.println(recursiveExam.facrecur(5));
		
		// x^1 부터 x^n의 합을 구하는 재귀 메서드를 만드세요
//		System.out.println(recursiveExam.powRecur(2, 5)); // x, n
		
	int x = 2;
	int n = 5;
	int result = 0;
	
	for(int i = 1; i < n; i++) { // 
		result = result + power(x, i); // 총합
	}
	
	System.out.println(result);
	}
	
	static int power(int x, int i) {
		if (i == 1) return x;
		
		return x * power(x, i - 1); //
	}
	
	static int facfor(int n) {	
		
		int facto = 1;
		
		for(int i = 1; i <= n; i++) {
			facto *= i;
			System.out.println("facto : " + facto + "\ti : " + i);
		}
		return facto;
	}

	static int facrecur(int n) {
		int result = 0;
		
		if(n == 1) {
			result = 1;
		} else {
			result = n * facrecur(n-1); // 핵심
			// n = 5 ? 5 * 4 * 3 * 2 * 1
		}
		
		return result;
	}
	
}
