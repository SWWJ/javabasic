
// class Main {
//   public static void main(String[] args) {
      
//       // if(5 > 4) {
//       //   System.out.println(50);
//       // } else {
//       //   System.out.println(40);
//       // }

//       // if를 사용하지 않고 조건문 사용 -> 삼항연산자
//       System.out.println((5 > 4) ? 50 : 40);
//       //(조건문) ? true일 때 출력값 : false일 때 출력값
//   }
// }


/* 반복문 - for */
// 1부터 100까지의 수 중 홀수들의 누적합계를 continue를 사용해 구하세요.

// for each

// class Main {
//   public static void main(String[] args) {

//     String[] number = {"one", "two", "three"};
//     // for(int i = 0 ; i < number.length ; i++) {
//       for(String num: number) {
//         System.out.println(num);
//       }

//       // System.out.println(number[i]);
//     // }
//   }
// }


// class Main {
//   public static void main(String[] args) {

//     int sum = 0;

//     for(int i = 1 ; i <= 100 ; i++) {
//             sum += i; // 누적

//       if(i % 2 == 0) {
//         continue;
//       }
//       if(i == 50) {
//       sum += i; // 누적
//       }
//     }
//     System.out.println(sum);
//   }
// }

// class Main {
//  public static void main(String[] args) {

//    int total = 0;

// for(int i = 1 ; i <= 100; i++) {
//   // start 초기문 ; stop 조건문 ; step 증가 세 가지 인수가 사용
//      System.out.println("i = "+ i +" total = "+ total);
//      total = total + i;
//    }
//    System.out.println(total);
//  }
// }

/* 반복문 - do ~ while
    do~while은 조건이 참일 동안 계속 반복하여 실행한다.
    - 무조건 한 번은 반드시 실행된다.
*/

/*
import java.util.Scanner;
Scanner "객체명" = new Scanner(System.in);
다른 객체명 = 객체명.nextInt();
*/

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int value = 0;
//         int sum = 0;
//         do { 
//           value = scan.nextInt();
//           sum += value;
//         } while (value < 100);
//           System.out.println("sum :" +sum);
        
//     }
// }

// import java.util.Scanner; // scanner import
// class Main {
//  public static void main(String[] args) {

//    int i = 0;
//    Scanner scan = new Scanner(System.in); // 객체 생성

//    do {
//       i = scan.nextInt(); // 객체 실제 입력
//       System.out.println("입력받은 값:" + i);

//    } while(i != 0);
//    System.out.println("종료");
//  }
// }

/* 반복문 - while
    while은 조건이 참일 동안 계속 반복하여 실행한다.
*/

//  public class Main{
//     public static void main(String[] args) {
//         int i = 1;
//         while(i<11) {
//         if(i%2 == 0) {
//         System.out.println(i);
//         }
//         i++;
//       }
//     }
// }

// class Main {
//  public static void main(String[] args) {
//    int total = 0;
//    int i = 1;
   

//    while (i <=100) {
//      total = total + i;
//     //  System.out.println("i ="+ i +" total ="+ total);
//      i++;
//    }
//    System.out.println(total);
//  }
// }

// class Main {
//   public static void main(String[] args) {

//     int i = 0;

//     while (i < 10) {
//       i++;
//       System.out.println(i);
//       if(i == 10) {
//         break;
//       }
//     }
//   }
// }
// continue 조건에 맞지 않는 경우 실행하지 않고 다시 반복문의 처음으로 돌아간다

// public class Main { 
//   public static void main(String[] args) {

//     int i = 0;
    
//     while (i < 10) {
//       i++;
//       if (i % 2 == 0){
//         // System.out.println("continue로 인쇄하지 않는 수" +i);
//         continue;
//       }
//       System.out.println(i);
//     }
//   }
// }

// 반복문을 실행하다가 break를 만나면 구문을 빠져나간다.
// public class Main { 
//   public static void main(String[] args) {

//     int coffee = 10;
//     int money = 300;
    
//     while(money > 0) {
//       System.out.println("커피를 드립니다"); // + 사용
//       coffee --;
//       System.out.println("남은 커피는" + coffee + " 입니다");
      
//       if (coffee == 0) {
//         System.out.println("커피가 다 떨어졌습니다. 판매를 종료합니다.");
//         break;
//       }

//     }
//   }
// }

// public class Main { 
//   public static void main(String[] args) {

//     int i = 0;
    
//     while(i<10) {
//       i++; // i += 1; i = i + 1;
//       System.out.println("나무를 "+ i +" 번 찍었습니다"); // + 사용
//       if (i == 10) {
//         System.out.println("나무 넘어간다~");
//       }

//     }
//   }
// }

// public class Main { 
//   public static void main(String[] args) {

//     int i = 0; // 초기화
    
//     while(i<10) { // 값을 만족한 이후 값을 체크하고 나서 탈출
//       System.out.println(i+" hi~"); // i 값
//       i++;
//     }
//   }
// }


/* switch-case 구문 - if문과 비슷하지만 조금 더 절차를 단순화시키는 조건 판단문이다. true 값이 나오는 곳까지 점프한다.*/

// import java.util.Calendar;
// public class Main {
//     public static void main(String[] args) {
//         // month에는 현재 월이 들어있습니다.
//         int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
//         String season = "";

//         if(month <= 2 || month == 12) {
//           System.out.println("지금은 "+ month +" 월이고 겨울입니다");
//         } else if(month <= 5) {
//           System.out.println("지금은 "+ month +" 월이고 봄입니다");
//         } else if(month <= 8) {
//           System.out.println("지금은 "+ month +" 월이고 여름입니다");
//         }  else if(month <= 11) {
//           System.out.println("지금은 "+ month +" 월이고 가을입니다");
//         }
//     }
// }

// import java.util.Calendar;
// public class Main {
//     public static void main(String[] args) {
//         // month에는 현재 월이 들어있습니다.
//         int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
//         String season = "";
//         // switch 문을 이용해 season이 봄/여름/가을/겨울 중 
//         // 하나의 값을 가지도록 만들어보세요.
//         // switch (month) {
//         // case 12: case 1: case 2:
//         // season = "겨울";
//         // break;
//         // case 3: case 4: case 5:
//         // season = "봄";
//         // break;
//         // case 6: case 7: case 8:
//         // season = "여름";
//         // break;
//         // case 9: case 10: case 11:
//         // season = "가을";
//         // break;
//         // }

//             switch (month) { // month 에서 "8"을 찾음
//       case 12: season = "겨울";
//       case 1: season = "겨울";
//       case 2: season = "겨울";
//               break;
//       case 3: season = "봄";
//       case 4: season = "봄";
//       case 5: season = "봄";
//               break;
//       case 6: season = "여름";
//       case 7: season = "여름";
//       case 8: season = "여름"; // case "8"을 찾음.
//               break; // 찾은 순간 이 구문에서 벗어남. 
//       case 9: season = "가을";
//       case 10: season = "가을";
//       case 11: season = "가을";
//               break;
//     }

//         // 이 위에서 switch 문을 완료해야 합니다.
//         System.out.println("지금은 "+ month +"월이고, "+ season +"입니다.");
//     }
// }


// class Main {
//   public static void main(String[] args) {

//     int month = 8; // 지정값
//     String monthString = "";

//     switch (month) { // month 에서 "8"을 찾음
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

// import java.util.ArrayList;

// class Main {
//   public static void main(String[] args) {
    
//     ArrayList<String> month = new ArrayList();

//     month.add("jan");
//     month.add("feb");
//     month.add("mar");
//     month.add("apr");
//     month.add("may");
//     month.add("jun");
//     month.add("jul");
//     month.add("aug");
//     month.add("sep");
//     month.add("oct");
//     month.add("nov");
//     month.add("dec");

//     boolean month = 1;

//     if(1) {
//       System.out.println("jan");
//     }
//   }
// }

// class Main {
//   public static void main(String[] args) {

//     int jan = 1;
//     int feb = 2;
//     int mar = 3;
//     int apr = 4;
//     int may = 5;
//     int jun = 6;
//     int jul = 7;
//     int aug = 8;
//     int sep = 9;
//     int oct = 10;
//     int nov = 11;
//     int dec = 12;

//     if(jan == 1) {
//       System.out.println("jan");
//     }
//   }
// }




/* if


*/

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
//     // 아래는 실행을 위한 코드입니다. 수정하지 마세요.
//     public static void main(String[] args) {
//         Main exam = new Main();
//         System.out.println(exam.IfTest(6));
//         System.out.println(exam.IfTest(8));
//         System.out.println(exam.IfTest(12));
//         // 먼저 나오는 것에만 반응.
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int value = 6;
        
//         if(value % 3 == 0) {
//             System.out.println(value+"는(은) 3의 배수입니다.");        
//         }
//     }
// }

// class Main {
//   public static void main(String[] args) {
//     int x = 50;
//     int y = 60;

//     if(x == y) {
//       System.out.println("x는 y와 같습니다");
//     } else if(x > y) {
//       System.out.println("x는 y보다 큽니다");
//     } else { // 위에서 걸리지 않았기 때문에 "x는 y와 다릅니다" 가 출력
//       System.out.println("x는 y와 다릅니다");
//     }
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     int x = 50;
//     int y = 60;

//     if(x == y) {
//       System.out.println("x는 y와 같습니다");
//     } else if(x > y) {
//       System.out.println("x는 y보다 큽니다");
//     } else if(x < y) {
//       System.out.println("x는 y보다 작습니다");
//     }
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     int x = 50;
//     int y = 60;

//     if(x > y) {
//       System.out.println("x는 y보다 큽니다");
//       System.out.println("test 1");
//     }

//     if(x > y) 
//       System.out.println("x는 y보다 큽니다");
//       System.out.println("test 2");
//     // 블록이 없을 경우에는 if 문 바로 아래에 있는 한 행만 영향을 받습니다. {} 로 묶지 않아 첫 번째 행을 제외한 값을 출력함.
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     int x = 50;
//     int y = 60;

//     if(x == y) { // 같니? 는 = =, 같지 않니는 ! =
//       System.out.println("x는 y와 같습니다");
//     } else {
//       System.out.println("x는 y와 다릅니다");
//     }
//   }
// }

// import java.util.ArrayList;

// class Main {
//   public static void main(String[] args) {

//     ArrayList<String> pocket = new ArrayList<String>();

//     pocket.add("paper");
//     pocket.add("handphone");
//     pocket.add("money");

//     if (pocket.contains("card")) {
//       System.out.println("택시탄다");
//     } else if { (pocket.contains("money")) {
//         System.out.println("택시탄다");
//         // card가 있니? 없으면 else if 아래의 money가 있니? 라 묻고 또 없으면 else 아래의 값을 출력. true 값이 걸리는 순간 끝!
//     } else {
//         System.out.println("걸어간다");
//     }
//     }

    // 경우의 수가 여러 개일 때 if 안에 if 형태로 구성하게 되면 가독성이 떨어진다. 사용하지 말자..
    // if (pocket.contains("card")) { 
    //   System.out.println("택시탄다");
    // }
    // else { 
    //   if (pocket.contains("money")) {
    //     System.out.println("택시탄다");
    //   } else {
    //   System.out.println("걸어간다");
    //   }
      // else 안에 if 와 또 else를 쓸 수 있다!! if 가 false 값이면 else에서 if를 다시 한 번 체크하고, 또 없으면 else로 간다.
//     }

//   }
// }

// import java.util.ArrayList;

// class Main {
//   public static void main(String[] args) {

//     ArrayList<String> pocket = new ArrayList<String>();

//     pocket.add("paper");
//     pocket.add("handphone");
//     pocket.add("money");

//     if (pocket.contains("card")) { 
//       System.out.println("택시탄다");
//     }
//     else { // 아니면
//       System.out.println("걸어간다");
//     }

//     // && and 둘 다 만족해야만 true
//   }
// }

// class Main {
//   public static void main(String[] args) {

//     int money = 10000;
//     boolean card = true;

//     if (money >= 5000 && card) { 
//       System.out.println("택시탄다");
//     }
//     else {
//       System.out.println("걸어간다");
//     }

//     // && and 둘 다 만족해야만 true
//   }
// }

// class Main {
//   public static void main(String[] args) {

//     int money = 10000;
//     boolean card = true;

//     if (money >= 5000 || card) { 
//       System.out.println("택시탄다");
//     }
//     else {
//       System.out.println("걸어간다");
//     }

//     // || 은 or의 뜻. 둘 중 하나만 만족해도 true
//     // | 는 기본 or의 뜻. 
//     // | 와 || 은 과정이 달라진다. 앞에가 true면 앞에 거만 봐도 무조건 결과가 'true'. 실행속도가 반으로 준다. || 는 앞의 값이 true면 뒤에 것을 따지지 않는다. | 면 앞과 뒤의 값 모두 체크.
//   }
// }

// class Main {
//   public static void main(String[] args) {

//     int money = 13000;

//     if (money >= 5000) {
//       System.out.println("택시탄다");
//       // if (조건 : true / false. 계산값, 간접적으로 true/false) {
//       //  명령어. flase면 실행 하지 않음
//       // } 여기서 멈춤.
//       // >= 같거나 크다 등등.
//     }
//     else {
//       System.out.println("걸어간다");
//     }
//   }
// }

// class Main {
//   public static void main(String[] args) {

//     boolean money = true;

//     if (money) {
//       System.out.println("택시탄다");
//     }
//     else {
//       System.out.println("걸어간다");
//     }

//   }
// }


/*
Map 맵 - 자료형 (ptython의 dictionary와 같은 자료구조), JS에서는 
         json
         데이터를 키값과 벨류 값의 쌍으로 저장하는 구조 (키값, 벨류값)으로 저장. 순서(인덱스)가 없이 키값으로만 벨류값을 얻는다.

         key        value
         name       홍길동
         age        16
*/

// import java.util.HashMap;
// 가져옴!
// class Main {
//   public static void main(String[] args) {

//     HashMap<String, String> map = new HashMap<String, String>();
//     // 키값과 벨류값을 모두 String으로만 하겠다.

//     map.put("people","사람");
//     map.put("baseball","야구");
//     map.put("kick","차다");
//     // 값을 넣을 때는 put

//     System.out.println(map.get("people"));
//     // 키값을 get("키값")으로 불러오면 벨류값을 가져온다.
//     System.out.println(map.containsKey("baseball"));
//     // map에 "baseball"이라는 Key가 존재하는지? containsKey() 사용

//     // 크기, map의 개수를 확인 size() 사용
//     System.out.println(map.size());

//     // map의 항목을 삭제 remove()
//     System.out.println(map.remove("people"));
//     System.out.println(map.size());

//     // map의 가장 큰 특징은 순서에 의존하지 않고 key값으로 value 값을 가져오는 데 있다.
//     // 그러나 순서(인덱스)로 데이터를 가져올 필요가 있으면 LinkedHashMap TreeMap 등을 사용한다. (순서를 가진 map도 있다)
//   }
// }