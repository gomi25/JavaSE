package section12.access2;
	// 추상클래스는 다중상속 가능! 일반클래스는 다중상속x(상속의 상속의 상속은 가능함)
public class HouseCat implements Cat, Playable {

	@Override
	public void eat() {
		System.out.println("경계하면서 먹어요.");
	}

	@Override
	public void sleep() {
		System.out.println("밤에 잠을 안 자요.");
	}

	@Override
	public void hunt() {
		System.out.println("쥐를 사냥해요, 집사에게 선물해요!");
	}

	
	
	@Override	// 여기는 Playable 오버라이딩 부분
	public void play() {
		System.out.println("쥐를 가지고 놀아요~");
	}
	

}
