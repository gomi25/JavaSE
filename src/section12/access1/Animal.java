package section12.access1;

	// 추상 클래스 Animal
public abstract class Animal {
	private String name;
	
	public Animal(String name ) {		// 생성자
		this.name = name;
	}
	
	// 추상메서드 <- 개념 아는 것 중요!
	public abstract void makeSound(); // 중괄호 없이 끝남. 선언만 하고 구현은 안 되어 있음.
	
	
	
	// 일반메서드
	public void eat() {
		System.out.println(name + "이(가) 먹고 있습니다.");
	}
	
	
}
