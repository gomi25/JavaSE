package section15;

import section15.access1.Soccer;

/*
 * java.lang 패키지
 * 	자바에서 기본 제공해주는 패키지
 * 	import 없이 사용이 가능하다.
 * 	ex) Exception 클래스
 * 	
 * Object 클래스 
 * 	자바에서 모든 클래스의 최상위 부모 클래스
 * 	명시하지 않아도 모든 클래스는 Object를 상속 받는다.
 * 
 * 	equals() 메서드 : 두 객체가 동일한 객체면 true, 동일하지 않으면 false를 반환한다
 * 	hashcode() 메서드 : 객체의 메모리 번지를 이용, 해시코드를 만들어 리턴
 * 	toString() 메서드 : 객체의 문자 정보를 리턴, 즉 객체를 문자열로 표현
 * 	clone() 메서드 : 객체 복사 (단 Cloneable 인터페이스 상속받은 객체만 사용하능)
 * 
 */
public class JavaLang01 {
	public static void main(String[] args) {
		
		Soccer soccer1 = new Soccer("리버풀", "리버풀", "1892", "프리미어리그");
		Soccer soccer2 = new Soccer("리버풀", "리버풀", "1892", "프리미어리그");
		// Soccer soccer1 = soccer2;
		
		System.out.println(soccer1);			// 기본형일 경우 값을 그대로 출력하지만 참조형변수 같은 경우는 toString 값을 출력함
		System.out.println(soccer1.toString()); // toString()는 주소값을 16진수로 바꿔서 반환하는 메서드
		System.out.println(soccer2);			// 객체가 다르므로 주소도 달라서 @7c30a502 이 아닌 @49e4cb85 로 출력됨
		System.out.println(soccer2.toString());
		
		if(soccer1.equals(soccer2)) {	// 참조값이 같은지 비교해줌
			System.out.println("soccer1 과 soccer2는 같다.");	
		} else {
			System.out.println("soccer1 과 soccer2는 다르다.");
		}
		
		System.out.println(System.identityHashCode(soccer1));	// 이 값을 16진수로 바꾸는게 toString()
		System.out.println(System.identityHashCode(soccer2));	
		
		System.out.println(soccer1.hashCode());	// 위에 값이랑 같음
		System.out.println(soccer2.hashCode());
		
	}
}






