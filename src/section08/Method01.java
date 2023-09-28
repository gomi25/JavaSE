package section08;
/*
 * 메서드(Method)
 * 	- 객체지향 프로그래밍에서 하나의 특별한 목적의 작업을 수행하기 위해 설계된 코드의 집합.
 * 	- 객체의 기능!
 * 
 * 메서드 구조
 * 	(접근제한자) (static) 반환타입 메서드이름(매개변수타입 매개변수명) {
 *		메서드 코드 
 *	
 *		(return 반환값;) 
 * 	}
 * 
 */
public class Method01 {
	public static void main(String[] args) {
		hello();	// main 메서드 안에서 hello 메서드를 호출해줘야 실행됨
	}

			  // 1. 리턴x, 인자x -> 호출 시 실행하고 끝나는 메서드
	public static void hello() {
		System.out.println("Hello, World!");
	}
}
