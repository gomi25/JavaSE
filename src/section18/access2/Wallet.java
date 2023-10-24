package section18.access2;

public class Wallet {
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000;
	}
	
	public synchronized int getMoney() { // synchronized 키워드 사용으로 멀티스레드에서 한쪽 사용 끝나기 전까지 다른 쪽에서 사용 안되게 함.
		if(totalMoney == 0) {
			return 0;
		}
		
		totalMoney -= 1;
		return 1;
	}
}
