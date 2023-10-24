package section18;

import section18.access1.CounterThread;

public class Thread03 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작!");
		
		CounterThread ct = new CounterThread();
		ct.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i*100);	// 헷갈리지 않게 100 곱해서 출력시켜보자
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			
		}
		
		System.out.println("메인스레드 종료!");
	}
}
