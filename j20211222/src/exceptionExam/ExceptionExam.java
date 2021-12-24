package exceptionExam;

public class ExceptionExam {

	public static void main(String[] args){
		// method1()과 main 메서드 양 쪽의 catch 블럭이 모두 실행되었다.
		// method1()에서 예외 처리를 하고도 throw문을 통해 다시 예외를 발생
		// 이 새로 생성된 예외를 main으로 던져서 throws가 한 번 더 처리된다.
		
		try {
			method1(); // method1 로 
		} catch (Exception e) {
			System.out.println("Main에서 예외 처리");
		}
	}
	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1에서 예외 처리"); // 예외 처리 완료
			throw e;  // 예외 발생 -> 호출 결과 method1();로 이동
		}
	}
		
//		try {
//			throw new Exception();
//		} catch (Exception e) {
//			System.out.println("에러");
//		} finally {
//			System.out.println("항상 실행");
//		}		
		
//		try {
//		method1(); // 같은 클래스 내에서 static이면 객체 생성 없이 바로 호출 가능
//		} catch (Exception e) {
//			System.out.println("main에서 예외를 처리");
//		}
//	}
//		static void method1() throws Exception {
//				throw new Exception();
//			}
//		}


	/*	
		Exception in thread "main" java.lang.Exception
		at j20211222/exceptionExam.ExceptionExam.method2(ExceptionExam.java:14)
		at j20211222/exceptionExam.ExceptionExam.method1(ExceptionExam.java:10)
		at j20211222/exceptionExam.ExceptionExam.main(ExceptionExam.java:6)

		1. 예외가 발생했을 때 3개의 메서드가 실행되었고
		2. 예외가 발생한 곳은 method2 이며
		3. main 메서드가 method1(), method1()이 method2()를 호출했다는 것을 알 수 있다.
	*/
		
////		throw new Exception();
//		System.out.println("예외 발생");
//		throw new RuntimeException(); // 실행 중 발생 - 동작은 해야

//		try {
////			Exception e = new Exception("예외 강제 발생");
////			throw e;
//			throw new Exception("예외 강제 발생"); // 위 아래 같은 것
//		} catch (Exception e) {
//			System.out.println("에러 메세지: " + e.getMessage());
//		}
//		
//		System.out.println("프로그램 종료");
		
//		System.out.println(1);
//		System.out.println(2);
//		
//		try {
//			System.out.println(3);
//			System.out.println(0/0); // 에러 발생 지점
//			System.out.println(4);   
//		} catch (ArithmeticException a) {
//			// a.printStackTrace();
//			System.out.println("에러메세지 :" + a.getMessage());
//		}
//		System.out.println(6);
		
//		System.out.println(1);
//		System.out.println(2);
//		
//		try {
//			System.out.println(3);
//			System.out.println(0/0); // 에러 발생 지점
//			System.out.println(4);   
////		} catch (ArithmeticException a) { // 더 세부적인 것으로 처리됨
////			if(a instanceof ArithmeticException)
////				System.out.println("true");
////				System.out.println("ArithmeticException");
//		} catch (Exception e) {
//			System.out.println("Exception");
//		}
//		System.out.println(6);
		
//		System.out.println(1);
//		System.out.println(2);
//		
//		try {
//			System.out.println(3);
//			System.out.println(0/0); // 예외 발생. 즉시 catch로 이동
//			System.out.println(4);   // 실행되지 않는다.
//		} catch (Exception e) {
//			System.out.println(5);
//		}
//		System.out.println(6);
		
//		System.out.println(1);
//		System.out.println(2);
//		
//		try {
//			System.out.println(3);
//			System.out.println(4);
//		} catch (Exception e) {
//			System.out.println(5); // 5는 출력되지 않는다. 예외가 없다.
//		}
//		System.out.println(6);
		
//		int num = 100;
//		int result = 0;
//		
//		for(int i = 0; i < 10; i++) {
//			try {
//			result = num / i;
//			System.out.println(result);
//			} catch (ArithmeticException e) {
//				System.out.println("0으로는 나눌 수 없습니다.");
//			} 
//		}
		
/* 예외 처리 (Exception Handling)
 * 프로그램이 실행 중 어떤 원인에 의해 오작동하거나 비정상적인 종료가 되는 경우가 있다.
 * 이러한 결과를 초래하는 원인을 에러 또는 오류라고 한다.-> 예외 처리
 * 
 * 		컴파일에러 : 컴파일 시 발생하는 에러 - 프로그램 진입 불가
 * 				   오타나 잘못된 구문, 잘못된 자료형 등 기본적으로 검사를 수행하여 오류를 확인
 * 
 * 		런타임에러 : 실행 중에 발생하는 에러 - 프로그램 진입 후 동작 중에 발생
 * 				   컴파일 시 에러가 발생하지 않았다고 하더라도 프로그램이 동작 중에 에러가 발생할 수 있다.
 * 				   프로그램 실행 중 동착을 멈춘 상태로 오랜시간 지속된다.
 * 
 * 		(논리적에러 : 실행은 되는데 의도와 다르게 동작하는 것)
 * 
 * 		자바에서 발생할 수 있는 오류를  Exception과 Error 클래스로 정의하고 있다. -> 이것도 클래스
 * 		에러 error     : 프로그램 코드에 의해 수습될 수 없는 심각한 오류
 * 		예외 exception : 프로그램 코드에 의해 수습될 수 있는 다소 미약한 오류
 * 
 * try - catch ( - finally) 구문
 * 에러는 어쩔 수 없지만(수습 불가) 예외는 프로그래머가 그에 대한 처리를 미리 해 주어야 한다.
 * 
 * 예외처리 : 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성하는 것을 말하며
 * 		      예외 처리의 목적의 예외의 발생으로 인한 프로그램의 비정상적인 종료를 막고 정상적인
 * 		      실행 상태를 유지할 수 있도록 하는 것이다.
 * 
 * try {
 *           // 예외가 발생할 가능성이 있는 문장을 넣는다.
 * } catch (Exception e -> 객체 생성하듯이) {
 *           // 예외 발생 시 예외 처리 구문
 * } finally {
 * 		 	 // 예외 발생 유무와는 상관 없이 항상 실행, 생략 가능
 * 
 * 1. 발생한 예외와 일치하는 catch 블록이 있는지 확인한다. (catch 여러 개 존재 가능)
 * 2. 일치하는 catch 블록을 찾게 되면 그 블록의 문장을 수행하고 빠져나간다.
 * 
 * *. 예외가 발생하지 않는 경우는 catch를 거치지 않고 빠져나간다. 
 * 
 * 예외 강제 발생시키기 throw
 * 
 * 메서드에 예외 선언 : 예외를 메서드에 선언하여 처리한다.
 * 
 * 예외 처리 방법 :
 * method1() 예외처리  - 예외가 발생한 해당 위치에서 바로 예외처리,
 * 					   호출한 main은 method1()에서 에러가 발생했는지조차 알 수가 없게 된다.
 *  
 * main() 예외처리 - 예외 발생 메서드를 호출한 자리에서 예외를 받아 처리
 * 				    예외를 돌려받게 되면 예외를 인지할 수 있게 된다.
 * 
 * finally 블럭 - 예외의 발생 여부와 상관없이 어떤 경우에도 실행되는 코드들을 포함시킨다.
 * 				선택적으로 사용 여부를 결정할 수 있다. 필수는 아니다.
 * 
 * 예외 되던지기 (Exception re-throwing)
 * 
 * 한 메서드에 발생 가능한 예외가 여러 개가 있을 경우 몇 개는 메서드 내에서 자체적으로 처리하고 
 * 나머지는 호출부로 던져서 처리하여 양쪽에서 나눠서 처리한다.
 * 심지어는 하나의 예외도 양쪽에서 처리할 수 있다. 예외를 처리하고 나서 그 예외를 다시 호출한 곳으로 던져 양쪽에서 모두 처리하는 방법이다. -> 예외 되던지기
 * 
 * 예외가 예외를 발생시킨다. (chained exception)
 * 
 * 예외 A가 예외 B를 발생시킨다면 A를 B의 '원인 예외(cause exception)' 이라고 한다.
 * 
 * try {
 * 		startInstall(); // 예외 발생
 * 		copyFiles();
 * } catch (SpaceException e) {
 * 		installException ie = new installException("설치 중 예외 발생"); // 예외 생성
 * 		ie.initCause(e)  // installException의 원인 예외를 지정
 * 		throw ie;
 * } catch (MemoryException me) {
 * ...
 * }
 * 
 */

	

}
