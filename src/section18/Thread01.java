package section18;
/*
 * 스레드(Thread)
 * 	스레드는 프로그램 내에서 실행되는 프로그램 제어 흐름(실행단위)을 말한다.
 * 	하나의 프로세스 내부에서 독립적ㄷ으로 실행되는 하나의 작업단위
 *  병렬 프로그래밍
 *  비동기 프로그래밍
 * 
 * 스레드 실행방법
 *  1. Thread 클래스 상속
 *  2. run() 메서드 오버라이딩 구현
 *  3. 1번에서 상속받은 클래스 객체 생성
 *  4. start() 메서드로 실행
 * 
 */
public class Thread01 {
	
	public static void main(String[] args) {	//하나의 스레드. 메인스레드
		System.out.println("메인 스레드 시작!");
		
		new MyThread().start(); // run이 아니라 star메서드를 통해서 실행시켜야 병렬로 실행됨
								// run으로 하면 병렬이 아니라 코드 순서대로 실행 됨
		
		System.out.println("메인 스레드 종료!");
		
	}
	
	
}
