package section12.access1;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("멍멍!"); // 오버라이딩 후 구현
	}

}
