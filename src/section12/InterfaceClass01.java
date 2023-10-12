package section12;

import section12.access2.Cat;
import section12.access2.HouseCat;
import section12.access2.PersianCat;
import section12.access2.Playable;

/*
 * 인터페이스(interface)
 * 	추상 메서드의 집합으로 클래스에서 다중상속과 느슨한 결합을 지원하며, // 느슨한 결합이란... 클래스에 대한 의존성이 낮아진다...
 * 	클래스의 동작을 정의하고 확장하는데 사용됨.
 * 
 *  객체지향프로그래밍 할 때 기능부터 정의.. 
 *  게임에서 기능이 있다고 하면 ex. 먹기, 잠자기, 사냥하기 등
 *  게임 캐릭터가 여러개 있다고 하면 ex. 고양이: 페르시안, 먼치킨 등
 *  각 고양이마다 기능이 조금씩 다르게 구현될 때.. 이럴 때 인터페이스 해야..?
 *
 */
public class InterfaceClass01 {
	
	public static void main(String[] args) {
		
		// Cat.PAW = 3; 에러뜸. 왜냐믄 상수라서 변경 불가.
		
		System.out.println(Cat.PAW);
		
		Cat cat1 = new PersianCat();	// new HouseCat으로 바꾸면
		eat(cat1);						// "경계하면서 먹어요" 가 나옴
		
		HouseCat hCat = (HouseCat) cat1;
		hCat.play();
		
		Playable pCat = hCat;
		pCat.play();
		// pCat.eat(); -> 안됨. Playable에서 선언되어 있는 메서드만 사용 가능
		
		// 객체 cat1 = hCat = pCat 동일하고 타입만 다름
		// 다형성....어......?
	}
	
	public static void eat(Cat cat) {
		cat.eat();
	}
	
	
}
