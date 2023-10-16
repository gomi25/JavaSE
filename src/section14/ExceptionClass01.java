package section14;
/* 
 * 예외(Exception) 
 * 	자바프로그램 구동 중에 나타나는 오류를 말한다.
 * 	문법적으로 문제 없어 보이지만 실제 운영 중에 생기는 오류이다.
 * 
 * 예외처리 방법 : try ~ catch
 *  try {
 *  	실행코드
 *  } catch(익셉션클래스 매개변수명) {
 *  	예외 발생 시 실행코드
 *  }
 * 
*/
public class ExceptionClass01 {
	
	public static void main(String[] args) {
		/*
		 * int num1 = 10; int num2 = 0;
		 * 
		 * int result = 0;
		 * 
		 * if(num2 == 0) { 
		 *    	System.out.println("어떠한 수를 0으로 나눌 수 없습니다."); 
		 * } else { 
		 * 		result = num1 / num2; 
		 * 		System.out.println("result: " + result); }
		 */
		try {			
			// try문구 안에서 발생할 수 있는 오류들을 예측을 해서
			// 미연에 방지를 하거나, 혹은 프로그램이 죽지 않도록 해줍니다.
			int num1 = 10;
			int num2 = 0;
			
			int result = 0;
			
			result= num1 / num2; 
			
		} catch(Exception e) {	// Exception 최상위 예외			// 여러 종류의 에러가 있는데 다 Exception을 상속받았기 때문에 Exception 타입인 e에 받아올 수 있다 
			e.printStackTrace();								// 에러메시지 보이게 하는 방법
			System.out.println("에러메시지: " + e.getMessage());	// 어떤 에러가 났는지 확인할 수 있는 방법
			System.out.println("관리자에게 문의하세요.");				// 에러가 났을 때 출력되는 문구
		}
		
	}
}
