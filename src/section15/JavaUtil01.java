package section15;

import java.util.Random;

/*
 * 자바 유틸 패키지(java.util) -> import 필요
 * 	자바에서 유용한 유틸클래스, 인터페이스 포함하는 패키지
 * 	lang 패키지 다음으로 많이 사용함
 *   ex) Random 클래스 : 난수를 생성해주는 클래스
 * 
 * 
 */
public class JavaUtil01 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// 0~99 사이 정수 중 난수 반환
		int ranNum = ran.nextInt(100);
		System.out.println("random: " + ranNum);
		
		//nextDouble : 0 이상 1미만 double 난수 반환 (ex. 0.1, 0.7)
		if (ran.nextDouble() < 0.5) {	// 50% 확률
			System.out.println("강화에 성공하였습니다.");
		} else {
			System.out.println("강화에 실패하였습니다.");
		}
		
		
	}
	
}
