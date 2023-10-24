package section18;

public class MyThread extends Thread {	// 스레드 클래스로 만드려면 스레드 상속 받아야 함!
	
	// run + ctrl + space
	@Override
	public void run() {	// 얘가 스레드의 메인메서드 역할할거임.
		System.out.println("MyThread 시작!");
		
		try {
			Thread.sleep(2000); // 2초
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
		System.out.println("MyThread 종료!");
	}
}
