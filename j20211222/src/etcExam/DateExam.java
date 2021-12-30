package etcExam;

import java.util.*; // 구버전 - 8 이전
import java.time.*; // 신버전 - 8 이후
import java.time.format.DateTimeFormatter;

public class DateExam {

	public static void main(String[] args) {
/* Calendar 추상클래스이기 때문에 객체를 생성할 수 없고 메서드를 통해서만 사용한다.
 * Calendar cal = new Calendar(); // 에러
 * Calender cal = Calendar.getInstance(); -> 생성 
 */
//		Calendar today = Calendar.getInstance();
//		
//		System.out.println("올해의 연도는 : " + today.get(Calendar.YEAR));
//		System.out.println("현재의 월은 : " + today.get(Calendar.MONTH+1));
//		// MONTH는 0에서 시작한다.
//		// System.out.println("올해 중 몇 번째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
//		System.out.println("이달 중 몇 번째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
//		
//		System.out.println("이달의 몇 일 : " + today.get(Calendar.DATE));
//		System.out.println("이달의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH));
//		System.out.println("올해의 몇 일 : " + today.get(Calendar.DAY_OF_YEAR));
//		
//		System.out.println("요일 : " + today.get(Calendar.DAY_OF_WEEK));
//		// 1이 일요일
//		
//		String[] yi = {"", "일", "월", "화", "수", "목", "금", "토"};
//		
//		System.out.println(yi[today.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2000, Calendar.JANUARY, 1);
		
		long diff = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("date1부터 date2까지 " + diff + "초 지났습니다.");
		
		System.out.println("date1부터 date2까지 " + diff/60/60/24 + "일 지났습니다.");
		
		System.out.println("date1은 " + date1);
		
		////////////////////////////////신 버전/////////////////////////////////
		
		LocalDate now = LocalDate.now();
		
		System.out.println(now); // 현재 날짜(컴의 날짜)
		
		LocalDate pari = LocalDate.now(ZoneId.of("Europe/Paris"));
		System.out.println(pari);
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd");
		String formatedNow = now.format(formatter);
		
		System.out.println(formatedNow);
		
		int year = now.getYear();
		System.out.println("현재의 연도는 " + year + " 입니다.");
		
		String month = now.getMonth().toString(); 
		System.out.println("이달은 " + month + " 입니다.");
		
		int monVal = now.getMonthValue();
		System.out.println("이달은 " + monVal + "입니다.");
		
		String dOfW = now.getDayOfWeek().toString();
		System.out.println("오늘은 " + dOfW + "입니다.");
		
		int dOfv = now.getDayOfWeek().getValue();
		System.out.println("오늘은 " + dOfv + "입니다."); // 월요일이 1
		
		LocalTime nt = LocalTime.now();
		System.out.println(nt);
		
		DateTimeFormatter form = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String formatedTime = nt.format(form);
		
		System.out.println(formatedTime);
		
		int hour = nt.getHour();
		int min = nt.getMinute();
		int sec = nt.getSecond();
		
		System.out.println("현재 시각은 " + hour + "입니다.");
		System.out.println("현재 분은 " + min + "입니다.");
		System.out.println("현재 초는 " + sec + "입니다.");
		
		//////////////////////////날짜와 시간을 함께 처리/////////////////////////////
		
		LocalDateTime curr = LocalDateTime.now();
		
		System.out.println(curr);
		
		DateTimeFormatter forma = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String formated2 = curr.format(forma);
		
		System.out.println(formated2);
		
		String[] tod = {"", "월", "화", "수", "목", "금", "토", "일"};
		
		System.out.println(tod[curr.getDayOfWeek().getValue()] + "요일입니다.");
		
		System.out.println();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1부터 7 중 하나를 입력하세요. >> ");
//		int input = sc.nextInt();
//		String dt = "";
//		
//		switch(input) {
//		case 1 : dt = "일요일";
//		break;
//		case 2 : dt = "월요일";
//		break;
//		case 3 : dt = "화요일";
//		break;
//		case 4 : dt = "수요일";
//		break;
//		case 5 : dt = "목요일";
//		break;
//		case 6 : dt = "금요일";
//		break;
//		case 7 : dt = "토요일";
//		break;
//		}
		
//		System.out.println(dt);
	}

}
