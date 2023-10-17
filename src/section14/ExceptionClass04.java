package section14;
/*
 * Exception 종류
 * 	1. Checked Exception -> ex)Thread.sleep();
 * 		메서드 호출 시 예외처리 하지 않을 경우 컴파일 에러 발생한다.
 * 		ex) Thread.sleep()
 *  2. UnChecked Exception
 * 		메서드 호출 시 예외처리 하지 않아도 컴파일 에러 발생하지 않는다.
 * 
 */
public class ExceptionClass04 {
	
	public static void main(String[] args) {
	
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			
			try {	//Thread라는 클래스가 있음
				Thread.sleep(1000);	// sleep은 1초 대기하는 메서드.(1초1000밀리세컨즈) try~catch문을 사용해야만 함! 안 그럼 컴파일 에러 발생!
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
