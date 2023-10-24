package section18;
/*
 * synchronized 키워드
 * 	멀티 스레드에서 동기화 시켜주는 예약어
 * 
 * 
 * 
 */
import section18.access2.Brother;
import section18.access2.Sister;
import section18.access2.Wallet;

public class Thread04 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작!");
		
		Wallet wallet = new Wallet();	// 만원
		
		Sister sister = new Sister(wallet);		// 같은 wallet(만원)에서  
		Brother brother = new Brother(wallet);	//	브라더 시스터가 돈을 뺴옴
		
		sister.start();
		brother.start();

		// 한쪽 연산이 안 끝났는데 다른 쪽에서 연산되지 않은 값에서 연산을 하게 되면서 안 맞을 수 있음
		// 값을 공유하는게 있으면 동기화 해줘야 문제 안 생김
		
		System.out.println("메인스레드 종료!");
	}
}
