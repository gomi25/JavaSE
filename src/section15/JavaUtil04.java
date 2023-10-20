package section15;

import java.util.Calendar;

/*
 * Calendar 클래스
 * 	날짜와 시간 정보를 다루는 클래스
 * 	날짜 시간 계산으로 자주 사용된다.
 *  Date 객체와 호환 가능
 * 
 */
public class JavaUtil04 {
	public static void main(String[] args) {
		
		// 객체 생성 시 "getInstance() 메서드" 통해서만 할 수 있다. 왜냐하면 protected Calendar라서 
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;	// Calendar 클래스에서 월(month)은 값이 0부터 시작하기 때문에 +1 해줘야 함
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("오늘 날짜는 " + year + "년 " + month + "월 " + day + "일 입니다.");
		
	}
}
