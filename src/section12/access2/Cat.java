package section12.access2;

// package 우클릭 - new - interface
// 추상메서드 집합체

public interface Cat {
		  // static final 키워드 생략해도 정적 상수임
	public static final int PAW = 4;	// 인터페이스에서 변수는 static 상수이다.
	
	
	// interface에서는 abstract 키워드 생략 가능. 생략해도 추상메서드!
	public abstract void eat();

	public abstract void sleep();
	
	public abstract void hunt();
	
}
