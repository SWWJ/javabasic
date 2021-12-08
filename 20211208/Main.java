/* 
  Generies - 입력되는 객체의 자료형을 강제한다.

 ArrayList pitches = new ArrayList();

 pitches 라는 ArrayList에 담을 수 있는 자료형은 String 뿐이라고 강제하는 것.
 ArrayList<String> pitches = new ArrayList<String>(); 
 반드시 String 을 써야 한다고 Generies를 지정. <> 안에 값 지정. 자료형을 강제한다.
 - 에러 방지, 문제를 원천 봉쇄!

*/

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

  //  ArrayList aList = new ArrayList();

  ArrayList<String> aList = new ArrayList<String>();

    aList.add("hello"); // 글자가 아니라 객체로 들어감. 강제 형 변화시킴
    aList.add("java");

    // String hello = (String)aList.get(0);
    // String java = (String)aList.get(1);
    //Casting 강제 형변환

    String hello = aList.get(0);
    String java = aList.get(1);
    // 제네릭스를 사용하여 자료형을 선언하면 그 이후로는 자료형에 대한 형변환 casting이 필요없다. 이미 자바가 aList에는 반드시 String 자료형만 추가된다는 것을 알고 있기 때문. 제네릭스를 사용하면 형변환에 대한 불필요한 코딩과 잘못된 형변환 등의 예외를 방지할 수 있다.

    System.out.println(hello);
    System.out.println(java);

  }
}

/* List 리스트
  배열과 비슷한 자료형(여러 개를 담을 수 있다), 크기가 정해지지 않고 동적으로 변한다. 배열은 그 크기가 생성시에 정해지지만 리스트는 그 크기가 정해지지 않아 원하는 만큼 자유롭게 담을 수 있다.

  (***) ArrayList 

*/

// import java.util.ArrayList;
// // java.util.ArrayList 에 있는 것을 가져와서(import) 사용하겠다
// public class Main {
//   public static void main(String[] args) {

//     ArrayList pitches = new ArrayList(); // 객체 생성 "new"

//     pitches.add("123");
//     pitches.add("234");
//     pitches.add("789");
//     pitches.add(0,"133"); // 위치를 지정. 0번째에 "133"을 집어넣는다.

//     System.out.println(pitches.get(2)); // (변수명.get(인덱스 순서))으로 꺼내 쓴다.
//     // get() 메서드를 이용하여 특정 인덱스 값을 추출

//     System.out.println(pitches.size());
//     // size()메서드를 이용하여 리스트의 개수를 확인

//     System.out.println(pitches.contains("234"));
//     //contain() 메서드를 이용하여 해당 값의 포함 여부를 확인

//     System.out.println(pitches.remove("789"));
//     // remove() 메서드를 이용하여 해당 객체 삭제하고 결과를 리턴

//     System.out.println(pitches.remove(0));
//     // remove() 메서드를 이용하여 해당 인덱스의 객체를 삭제
//     // 항목의 ("내용")을 적으면 해당 객체 삭제, (숫자)를 적으면 해당 순서의 객체 삭제

//   }
// }



/*
  배열 : array - 여러 개의 원소를 한 번에 담는 자료형
                자료의 집합이다.
                배열은 그 길이가 고정된다.
                즉, 한 번 생성하면 길이를 수정할 수 없다. - 약점

  변수의 수가 기하급수적으로 많아지면 관리, 보관이 어려워진다.
  int engScoreKim = 80; // 1개만 저장
  int[] engScore = {80,90,50,60,75}; // 배열 선언하는 방법. 하나로 변수 5개를 해결
  String[] names = {"kim", "park", "son", "lim", "min"};

  int[] 변수명 = {변수값, 변수값, ...};

*/

// class Main {
//   public static void main(String[] args) {

//     String[] weeks = new String[7];

//     weeks[0] = "월";
//     weeks[1] = "화";
//     weeks[2] = "수";
//     weeks[3] = "목";
//     weeks[4] = "금";
//     weeks[5] = "토";
//     weeks[6] = "일";

//    // 혹은 String[] weeks = {"월","화","수","목","금","토","일"};

//    // System.out.println(weeks[3]);
//    // (변수명[몇 번째]) 로 접근

//    // 반복문 (for, while, (do~while)) - 둘이 바꿔 사용할 수 있다.
//                                      // for는 반복 횟수 지정할 때 주로 사용.
//                                      // while는 정확히 얼마나 반복할 지 모를 때 주로 사용.

//       for (int i = 0; i < weeks.length; i++) {
//       // weeks의 수가 명확함. 0 에서 7미만이 될 때까지 i를 1씩 증가시킴.
//         System.out.println(weeks[i]);
//       }

//        // System.out.println(weeks[7]); 0부터 시작
//         // ArrayIndexOutOfBoundsException - Error, 오류 등등 = "예외"(Exception) 라고 표현
//         // 인덱스가 없는 위치를 지정했을 때의 오류
//   }
// }


// char 문자 (한 글자) -> String 사용
 
//  class Main{
//   public static void main(String[] args) {
//     char a = 'a';  // 한 글자 표현할 때는 '' 사용
//     char b = 122;  //ascII 97 = a. 코드값으로 자동 환원

//     System.out.println(a);
//     System.out.println(b);
//   }
// }

/*
  Bool (불 Boolean) - true 1(0이 아닌 모든 것), false 0. if 등과 주로 쓰임. 

*/

// class Main {
//   public static void main(String[] args) {

//     int base = 100;
//     int height = 185;
//     boolean isTall = height > base; // isTall 이 true가 된 것

//     if (isTall) { // true 면 "키가 큽니다"를 출력. false면 출력x. 조건문
//       System.out.println("키가 큽니다");
//     }

//   }
// }











/*
  String 문자열, 글자들 - 기본자료형이 아니다.
        "Hello World"
        "a"
        "12345" -> 큰 따옴표가 붙으면 숫자도 글자로 인식

  String a = new String("Hello");    -> 정식 입력 방식
  // 원래는 위와 같은 표현을 사용하여 객체를 생성한 후 사용하는 게 원칙이나
  생성자를 통해 String을 호출해서 받아쓰는 것

  String a = "Hello World";   -> 입력 가능
  // String은 자바에서 특별 취급을 하여 간단하게 사용할 수 있다.

*/

// 문자열에서 많이 사용되는 메서드. 

// equals (***)  두 개의 문자열이 동일한지 비교하여 결과 리턴

// class Main {
//   public static void main(String[] args) {
//       String a = "hello";
//       String b = "Java";
//       String c = "hello";

//       System.out.println(a.equals(b));  // (값.equals(비교값))
//       System.out.println(a.equals(c));
//   }
// }

// indexOf 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴

// class Main {
//   public static void main(String[] args) {
//     String a = "hello World"; 
    
//     System.out.println(a.indexOf("World"));  // 6

//   }
// }

// " "(띄어쓰기) 도 글자. 0부터 숫자 시작. 이하보다는 미만 표현을 많이 쓴다. 


// replaceAll  문자열 중 특정 문자열을 다른 문자열로 치환

// class Main {
//   public static void main(String[] args) {
//     String a = "hello World";

//     System.out.println(a.replaceAll("World", "Java"));
//   }
// }

// substring  문자열 중 특정 부분을 뽑아낼 경우 사용함.
// class Main {
//   public static void main(String[] args) {
//     String a = "Hello World";
//     System.out.println(a.substring(0,4));
//     // 끝 위치는 포함하지 않는다. 즉 ~ 미만. 즉, 3까지 잘라냄.
//   }
// }

// toUpperCase  모든 문자열을 대문자로 변환
// toLowerCase  모든 문자열을 소문자로 변환
// class Main {
//   public static void main(String[] args) {
//     String a = "Hello World";
//     System.out.println(a.toUpperCase());
//   }
// }

/*
변수 : 어떤 값을 보관하는 용도

int a;  a라는 변수명에 integer(정수)를 보관할 것이다.
String b;  b라는 변수명에 String(문자열)을 보관할 것이다.

변수명 선언 규칙
1. 변수명은 숫자로는 시작할 수 없다. 숫자를 사용할 수는 있다. a100(O) 100a(X)
2. _ under score, $ 는 사용 가능하지만 @ ! ... 는 사용 불가
3. 예약어는 변수명으로 사용할 수 없다. int, class ... (X)

권장사항. 한글은 사용하지 않는다. 가급적 소문자로 만든다. 

잘못된 변수명 선언 예
int 2nd;  //  숫자로 시작 불가
String b#;  //  특수문자 사용 불가
int main;  //  예약어 사용 불가


자료형 (type)

int a; // 변수명 a 는 int 자료형 변수이므로 a 라는 변수에는 정수만 담을 수 있다. (1, 20 ...)
String b; // 변수명 b는 String 자료형 변수이므로 b 라는 변수에는 문자열만 담을 수 있다. (글자들) "cat", "Hello" ...

class - 자바는 클래스 단위로 프로그램을 구성한다.
        클래스명은 명사로 만든다.
        여러 개의 단어로 만들 경우 각 단어의 첫 문자는 대문자로 만든다.
        ex) class Raster {}
            class ImageSprite {} // 띄어쓰기 하지 않고 대문자로.

메서드 - 하나의 클래스 안에는 메서드가 여러 개 존재할 수 있다. 메서드명은 주로 동사로 만든다.
        여러 개의 단어로 만들 경우 처음 시작하는 문자는 소문자로 시작하고 두 번째 단어부터는 대문자를 사용한다.
        ex) run{}
            runFast{}
            getBackground{}

  권장사항 : 변수명은 짧지만 의미가 있게 만든다.
            (변수명을 통해 사용 의도를 알 수 있다)

숫자 자료형 (number, integer) 
정수(1, 10, 50 ...), 실수(3.32 ...)

정수
int(대부분, 0이 9~10개까지) (***)         int age = 20;

long(매우 큰 숫자에 사용, 뒤에 L 붙임)  long countStar = 53534534534534543545L;

실수 3.14, 7.8 ...
float, double(주로 씀(***))

float pi = 3.14F;
(매우 큰 실수에 사용, 뒤에 F 붙임)

double morePi = 3.121592;
*/

// class Main {
//  public static void main(String[] args) {

//   int i = 0;

//   // System.out.println(++i); = 1  하나를 증가하고 출력 : 선증가
//   System.out.println(i++); // = 0  출력을 하고 하나 증가 : 후증가. i++ 을 많이 쓰게 된다.
//   System.out.println(i);   // = 1
// // - 도 마찬가지

// //    int i = 0; // 선언하자마자 입력
// //    int j = 10;
// // // 컴퓨터는 뒤에서 앞을 정의

// // i++; // i += 1; // i = i + 1;  1 증가

// // j--; //  j -= 1; // j = j - 1;  1 감소

// //    System.out.println(i);
// //    System.out.println(j);


// //   int a = 10;
// //   int b = 5;

// //   System.out.println(a+b);
// //   System.out.println(a-b);
// //   System.out.println(a*b);
// //   System.out.println(a/b);
// // // 나머지 연산자. 나머지를 구하는 것 (홀수, 짝수, 배수)
// //   System.out.println(a%b);
// //   System.out.println(7%2); // 홀수 1
// //   System.out.println(6%2); // 짝수 0
// //   System.out.println(6%3); // 배수 나눈 수의 배수 0

//  }
  
// }

/*
// 클래스 블록 : 소스 코드의 가장 바깥쪽 블록. {} 로 시작과  끝
// class 명은 파일명과 반드시 동일해야 한다.
class Main {

// 메서드 블록 (기능을 정의, {} 로 시작과 끝)
// main 메서드가 프로그램 전체의 시작점이다.
public static void main(String[] args) { 
  // public 접근제어자 public : 모두 접근 가능
  // static 객체를 생성하지 않고도 사용 가능
  // void 리턴 값이 없음을 의미한다.
  // [] 배열을 의미 String 문자열 args 변수들
  System.out.println("Hello World!");
  // println 은 찍고나서 줄을 바꿔준다. print는 옆으로 나열. 명령문은 반드시 ; 로 끝난다. 
  // ""는 글자
}
}
*/

// 주석 comment : 코드에 대한 설명을 적는다. (기본적) JAVA는 class 안에서 시작. 
//                컴퓨터는 주석을 읽지 않는다.
//                코드의 실행을 잠시 멈추고 문제점을 파악하는 용도로도 사용


// 클래스 선언 (라인 주석)
// class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello world!");   // Hello world를 출력한다.
//   }
// }

/* (블럭 주석)
작성자 :
작성일 :
여러 줄 주석 작성
*/

