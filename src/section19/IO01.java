package section19;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * I/O (Input/Output)
 * 	데이터를 읽고 쓰는 작업을 의미한다.
 * 	자바에서는 java.io 패키지를 통해 I/O 프로그래밍을 할 수 있다.
 * 
 * File Class
 * 	경로 정보를 받아 파일 또는 디렉토리 정보를 객체화 한다.
 * 
 * 
 */
public class IO01 {
	
	public static void main(String[] args) {
						// escape 문자로 \\ -> \
		File f = new File("C:\\");	// 해당 경로에 있는 File 객체 f 생성
		
		String[] list = f.list();	// f 디렉토리 내에 있는 모든 파일 및 디렉토리 목록을 String 배열인 list에 가져옴
		
		
		Calendar c = Calendar.getInstance();	// Calendar 클래스의 인스턴스 c를 생성
												// 여기서 c는 날짜와 시간을 다루는데 사용
		for(String temp : list) {			// list 배열의 각 요소에 대해 반복
			// temp명의 디렉토리 또는 파일을 객체화
			File f2 = new File(f, temp);	// f에 있는 각 해당 파일 정보(속성)에 대한 File 객체 f2를 생성
			
			// 1970년 1월 1일부터 현재 수정한 날짜를 밀리세컨드로 반환 (Timestamp)
			long lastMod = f2.lastModified();	// f2의 마지막 수정일자
			
			// 파일 또는 디렉토리 마지막 수정날짜 Calendar 객체로 변환
			c.setTimeInMillis(lastMod);	// c객체의 시간을 lastMod 값으로 설정
			
			// 마지막 수정날짜 포맷변환 (우리가 알아볼 수 있는 정보로 바꿈)
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String day1 = sdf.format(c.getTime());	// c객체의 시간을 sdf포맷에 따라 문자열로 변환
			
			// isDirectory() - 디렉토리이면 true 반환, 파일이면 false
			if(f2.isDirectory()) {	
				System.out.print(f2.getName()+"(디렉토리) - ");	// 이름 출력
				System.out.println(day1);	// 마지막 수정 일자 출력
			}
		}
		
		for(String temp : list) {
			// temp명의 디렉토리 또는 파일을 객체화
			File f2 = new File(f, temp);
			
			// 1970년 1월 1일부터 현재 수정한 날짜를 밀리세컨드로 반환 (Timestamp)
			long lastMod = f2.lastModified();
			
			// 파일 또는 디렉토리 마지막 수정날짜 Calendar 객체로 변환
			c.setTimeInMillis(lastMod);
			
			// 마지막 수정날짜 포맷변환
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String day1 = sdf.format(c.getTime());
			
			// isFile() - 디렉토리이면 false 반환, 파일이면 true
			if(f2.isFile()) {
				long fileSizeByte = f2.length();
				double fileSizeMB = (double)fileSizeByte / (1024*1024);
				System.out.printf("%s(%.2fMB) - %s\n", f2.getName(), fileSizeMB, day1);
			}
		}
		
		
	}
	
}
