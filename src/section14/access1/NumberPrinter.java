package section14.access1;

public class NumberPrinter {
	public void printNumber() throws InterruptedException  {	// 실행을 하는 곳에서 예외처리 해달라는 뜻
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);	
			
				Thread.sleep(1000);
				
			}
		}
}
