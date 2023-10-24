package section18.access2;

public class Sister extends Thread {
	
	public Wallet wallet;
	public int money;
	
	public Sister(Wallet wallet) {	// 매개변수로 지갑객체를 받음. 만원이 생김
		this.wallet = wallet;
	}
	
	// run() 오버라이드
	@Override
	public void run() {
		while(true) {
			int returnMoney = wallet.getMoney();	//	토탈머니(만원)에서 -1씩 해주고 1을 돌려줌
			if(returnMoney == 0) {	// 토탈머니(만원)에서 0이 될 때
				break;
			}
			money += returnMoney;	// 빼올 떄마다 내 주머니에 넣는거
			
			System.out.println("Sister 총 재산: " + money); 
		}
	}
	
}
