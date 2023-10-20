package section15;

import java.util.Calendar;
import java.util.Scanner;

public class JavaUtil05 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요.");
		int year = scan.nextInt();
		
		System.out.println("월을 입력하세요.");
		int month = scan.nextInt();
		
		cal.set(year, month -1, 1);	// set() 이란 메서드가 있음. (년, 월, 일) get 할 때는 +1 set 할 떄는 -1(왜냐면 컴퓨터는 0을 1로 알고 있으니까)
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");	// 요일 사이에 탭처리
		
		// 달의 마지막 날짜를 구함
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		
		// 지정한 달의 시작하는 요일을 구함  ※ 1(일요일) ~ 7(토요일)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// System.out.println("week: " + week); 	결과-> week: 1
		
		// 달력 시작 날의 주말처리
		for(int i = 1; i < week; i++) {
			System.out.println("\t");
		}
		
		for(int i = 1; i <= lastOfDate; i++) {
			System.out.printf("%d\t", i);
			
			if(week % 7 == 0) {
				System.out.println();	// 7단위로 println
			}
			week++;
		}
		
		scan.close();
		
	}
}
