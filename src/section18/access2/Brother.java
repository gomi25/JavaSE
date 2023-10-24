package section18.access2;

public class Brother extends Thread { // 스테드 상속
	
	public Wallet wallet;
	public int money;
	
	public Brother(Wallet wallet) {
		this.wallet = wallet;
	}
	
	// run() 오버라이드
	@Override
	public void run() {
		while(true) {
			int returnMoney = wallet.getMoney();
			if(returnMoney == 0) {
				break;
			}
			money += returnMoney;
			
			System.out.println("Brother 총 재산: " + money); 
		}
	}
	
}
