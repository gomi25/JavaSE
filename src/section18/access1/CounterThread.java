package section18.access1;

public class CounterThread extends Thread {
	
	// run 메서드 오버라이딩
	@Override
	public void run() {
		 System.out.println("CounterThread 시작!");
		
		 for(int i = 1; i<=10; i++) {
			 System.out.print(Thread.currentThread().getName()+"-");
			 System.out.println(i);
			 
			 try {
				Thread.sleep(1000); // 1초 일시정지 (1000이 1초)
			 } catch (Exception e) {
				 
			 }
		 }
		 
		 System.out.println("CounterThread 종료!");
	}
	
}
