// import java.util.HashMap;

// class Main {
//   public static void main(String[] args) {

//     HashMap<String, String> map = new HashMap<String, String>();
//     // Generies를 통해 String으로 강제 입력

//     map.put("안녕하세요", "hi");
//     map.put("잘가", "bye");
//     map.put("우리", "we");
//     // 객체명.put("key명", "value값") 으로 넣는다.

//     System.out.println(map.get("잘가"));
//     // key를 부르면 그 내용인 value 값이 나온다.
//     // 참고 : LinkedHashMap TreeMap 등이 있다.
//   }
// }

// class Main {
//   public static void main(String[] args) {

//     int paper = 500;
//     int ink = 300;
//     boolean write = paper > ink;

//     if(write) {
//       System.out.println("잉크가 부족합니다");
//     }


//   }
//   }

// class Main {
//   public static void main(String[] args) {

//     int apple = 100;
//     int pear = 2000;

//     if(apple <= 99 || pear < 3000) {
//      System.out.println("사과");
//     } else {
//       System.out.println("배");
//     }
//   }
// }
// import java.util.ArrayList;

// class Main {
//   public static void main(String[] args) {

//     ArrayList<String> ciase = new ArrayList<String>();

//     ciase.add("pen");
//     ciase.add("sign");
//     ciase.add("highlight");
//     ciase.add("pencil");

//     if(ciase.contains("eraser")) {
//       System.out.println("지우개가 있네");
//     } else if (ciase.contains("magic"))  {
//       System.out.println("매직이 있네");
//     } else {
//       System.out.println("다른 건 있나?");
//     }
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     int x = 5;
//     int y = 6;

//     if(x%2 == 0) {
//       System.out.println("x는 2의 배수이다");
//     } else if (y%2==0) {
//       System.out.println("y는 2의 배수이다");
//     }
//   }
// }

// public class Main {
//     public int IfTest(int value) {
        
//         int ret = 0;  
//         if( value % 3 == 0 ) {
//             ret = 3;
//         } else if(value % 4 == 0) {
//           ret = 4;
//         }
//         return ret;
//     }

//     public static void main(String[] args) {
//         Main exam = new Main();
//         System.out.println(exam.IfTest(6));
//         System.out.println(exam.IfTest(8));
//     }
// }

// switch
// class Main {
//   public static void main(String[] args) {

//     int month = 8; // 지정값
//     String monthString = "";
// //자료형 선택 객체명    = "값";
//     switch (month) { // month 에서 "8"을 찾음 switch (객체명) { case 입력 }
//       case 1: monthString = "jan";
//               break;
//       case 2: monthString = "feb";
//               break;
//       case 3: monthString = "mar";
//               break;
//       case 4: monthString = "apr";
//               break;
//       case 5: monthString = "may";
//               break;
//       case 6: monthString = "jun";
//               break;
//       case 7: monthString = "jul";
//               break;
//       case 8: monthString = "aug"; // case "8"을 찾음.
//               break; // 찾은 순간 이 구문에서 벗어남. 
//       case 9: monthString = "sep";
//               break;
//       case 10: monthString = "oct";
//               break;
//       case 11: monthString = "nov";
//               break;
//       case 12: monthString = "dec";
//               break;
//     }
//     System.out.println(monthString);
//   }
// }

// public class Main {
//   public static void main(String[] args) {

//     int t_shirt = 10;
//     int money = 5000;

//     while(money > 0) {
//       System.out.println("티셔츠 팔아요");
//       t_shirt --;
//      if (t_shirt == 0) {
//       System.out.println("티셔츠 없슈");
//        break; //break는 loop 안에 위치.
//     }
//     }
    
//   }
// }

public class Main { 
  public static void main(String[] args) {
int tt = 0;
    int i = 0;
    
    while (i < 10) {
      i++;
      tt += i;
      System.out.println(tt);
    }
  }
}

// for(int i = 1 ; i <= 100; i++)
// start stop step

// System.out.println((5 > 4) ? 50 : 40);
// 삼항 연산자

/* import java.util.Scanner;
Scanner "객체명" = new Scanner(System.in);
다른 객체명 = 객체명.nextInt(); */