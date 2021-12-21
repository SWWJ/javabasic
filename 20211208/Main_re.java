 class Main_re {
  
//   public static void main(String[] args) {
//     System.out.println("Hello World");
//     // 주석 작성은 이렇게
//     /* 여러줄 작성할 때는
//     이렇게 하는 
//     겁니다. */

// 문자열(String)는 언제나 "" 안에 입력
 
//    // -> 출력 : Hello World
//   }
// }

// class Main_re {
//   public static void main(String[] args) {

//     int a = 1;
//     int b = 2;
//     double c = 1.24;
//     double d = 4.35;
//     String e = "이건 문자열입니다";
//     String f = "Dog";

//     System.out.println(a+b);
//     System.out.println(a%b);
//     System.out.println(a-b);
//     System.out.println(c+d);
//     System.out.println(e);
//     System.out.println(f.toUpperCase());
//     System.out.println(f.toLowerCase());
//   }
// }

// class Main_re {
//   public static void main(String[] args) {
//     String a = "Hello World";
//     String b = "hello";
//     String c = "hello";

//     // System.out.println(a.substring(0,5));
//     // System.out.println(a.replaceAll("Hello","Bye"));
//     // System.out.println(a.indexOf("Hello"));
//     // System.out.println(b.equals(c));
    
//   }
// }

// class Main_re {
//   public static void main(String[] args) {

//     int apart = 30;
//     int villa = 5;
//     boolean isTall = apart > villa;

//     if(isTall) {
//       System.out.println("더 크네요");
//     }
//   }
// }

// class Main_re {
//    public static void main(String[] args) {
//      char a = '8';
//      char b = 'b';

//      System.out.print(a);
//      System.out.print(b);
//    }
//  }

// class Main_re {
//    public static void main(String[] args) {

//      int[] num = {100,200,300,400,500,600};
//      String[] city = {"seoul","busan","goyang","daegu","daejeon","gwangju"};

//      System.out.println(city[4]);
//      System.out.println(num[2]);
  
//      for (int i = 0; i < city.length; i++) {
//          System.out.println(city[i]);
//  }
//    }
//  }

// import java.util.ArrayList;
// public class Main {
//   public static void main(String[] args){

//     ArrayList th3 = new ArrayList();

//     th3.add(0,"999");
//     th3.add(1,"4732");
//     th3.add(2,"563");

//     System.out.println(th3.get(2));
//     System.out.println(th3.size());
//     System.out.println(th3.contains("4732"));
//     System.out.println(th3.remove("999"));
//     System.out.println(th3.remove(1));
//   }
// }

import java.util.ArrayList;


public class Main_re {
  public static void main(String[] args) {

    ArrayList<String> bList = new ArrayList<String>();

    bList.add("goodBye");
    bList.add("Hello");

    String goodBye = bList.get(0);
    String Hello = bList.get(1);

    System.out.println(goodBye);
    System.out.println(Hello);
  }
}