package javaExam;

public class TriExam {
	
	public static void main(String[] args) {
		

	
	/* 삼항 연산자 (조건)
	 * 첫 번째 피연산자 조건식의 평가 경과에 따라 true면 두 번째 항, false면 세 번째 항이 결과가 된다. 
	 * 조건식의 괄호는 필수는 아니다.
	 
	 여러 번 중첩하면 가독성이 떨어지므로 꼭 필요한 경우에만 사용한다.
	 
	 (조건식) ? true : false;
	 
	 if(조건식) {
	 true;
	 } else{
	 false;
	 
	 
	 (조건식) ? "A" : (조건식2) ? "B" : (조건식3) ? "C" : "D";	 
	 
	 if(조건식) {
	 "A";
	 } else if (조건식2){
	 "B"
	 } else if (조건식3){
	 "C"
	 } else{
	 "D"
	 }
	 
	 */
// 삼항연산자를 사용해 
// 100점 미만 90점 이상이면 "A" 90미만 80점 이상이면 "B" 80미만 70점 이상이면 "C" 나머지는 "D"
		
//		int score = 90;
//		
//		System.out.println((score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "D");

//		x = x + (y < x ? 1 : 2);
		
		int x ,y, z;
		int absX, absY, absZ; // abs는 절댓값
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		// 절댓값 만들기
		absX = x >= 0 ? x : -x; // 양수면 그냥 출력, 음수면 -를 붙여 출력(양수로)
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;		
		
		signX = x > 0 ? '+' : x == 0 ? ' ' : '-';
		signY = y > 0 ? '+' : y == 0 ? ' ' : '-';
		signZ = z > 0 ? '+' : z == 0 ? ' ' : '-';
		
		System.out.printf("x = %c%d%n", signX, absX);
		System.out.printf("y = %c%d%n", signY, absY);
		System.out.printf("z = %c%d%n", signZ, absZ);
		
	}
}
