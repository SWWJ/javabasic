package oopExam;

//import java.util.Calendar;
//import java.util.Date;
//import java.util.ArrayList;

import java.util.*;
import java.text.*;

// import java.*; X *은 특정 패키지 내의 모든 클래스드을 의미.

import java.util.Date;
import java.text.SimpleDateFormat;

public class PackageExam {

	public static void main(String[] args) {
		
		Date today = new Date(); // Date라는 클래스로 개체 생성
		
		// MM은 대문자? minute의 대문자와 구별하기 위해 MM 사용
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		// 오늘의 날짜 출력
		System.out.println("오늘의 날짜는 " + date.format(today));
		System.out.println("현재의 시간은 " + time.format(today));

/* 패키지 package
패키지는 클래스들의 모음이다. 또한 패키지에는 클래스와 인터페이스를 포함할 수 있고
연관이 있는 클래스들을 모아서 그룹으로 묶어 놓아 효율적으로 관리할 수 있다.

같은 이름의 클래스라도 패키지명이 다르면 서로 다른 패키지 내에서 존재할 수 있다.
 
클래스가 물리적으로 하나의 클래스파일.class인 것과 같이 패키지는 물리적으로 하나의 디렉토리이다.
- 모든 클래스는 반드시 패키지 안에 존재해야 한다.
- 패키지는 . 점을 구분자로 하여 계층 구조를 구성한다.
- 패키지 선언은 반드시 클래스의 제일 첫 줄에서 선언한다. (주석을 제외)
- 패키지 선언을 안하면 자동으로 '이름없는 패키지'에 속한다. (이름없는 패키지라는 패키지)
- 패키지 선언을 하지 않은 클래스들은 모두 같은 패키지에 속하게 되는 것이다.
- 패키지는 대소문자를 모두 허용하지만 관용적으로 클래스명과의 구분을 위해 소문자로 사용한다.

package 패키지명;

import
다른 패키지에 있는 클래스를 사용하려면 패키지명이 포함된 클래스 이름을 사용해야 한다.
매번 패키지명까지 붙여서 사용하기는 너무 불편하다.
클래스의 처음 부분에서 import 문으로 사용하고자 하는 클래스의 패키지를 미리 명시해 주면
패키지 명을 쓰지 않고 바로 사용할 수 있다.
이클립스에서는 ctrl + shift + o를 통해 쉽게 import 구문을 완성한다. (ctrl - space)
 
*/

	}

}
