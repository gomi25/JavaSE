package section10.access2;

import section10.access1.Car; 

public class SportsCar extends Car {
	private boolean isOpen;
	
	@Override	// 부모 메서드 재정의
	public void printInfo() {
		System.out.println("model: " + model);
		System.out.println("color: " + color);	// protected 상속 관계에서 접근 가능
		// System.out.println("year: " + year);	// default 다른 패키지 접근 불가!
		// System.out.println("brand: " + brand);  // private 다른 클래스 접근 불가!
		System.out.println("isOpen: " + isOpen);
	}
}
