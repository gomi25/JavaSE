package section15;
/*
 * Date 클래스
 * 	시간과 날짜 정보를 다루는 클래스
 * 
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class javaUtil03 {
	public static void main(String[] args) throws ParseException {
	
	Date date = new Date();	// Date + Ctrl+space 
	System.out.println(date);
	
	// 날짜 포맷 변경하기
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String strDate = sdf.format(date);
	
	System.out.println("strDate " + strDate);
	
	// 문자열 날짜 시간을 Date 객체로 전환
	String yesterday = "2023-10-18 19:41:00";
	Date yDate = sdf.parse(yesterday);
	
	System.out.println("yDate" + yDate);
	}
}
