package section15;
/*
 * 래퍼클래스(Wrapper Class)
 * 	기본 자료형을 객체로 감싸서 사용할 수 있도록 해주는 클래스
 * 	기본 자료형 래퍼클래스 8가지
 * 		- Boolean, Byte, Character, Short, Integer, Long, Float, Double
 * 		- 기본형처럼 쓸 수 있는 참조형 클래스
 */
public class JavaLang06 {

	public static void main(String[] args) {
		
		// 문자열 "12345"를 정수형 int로 변환
		String strNum = "12345";
						
		int num = Integer.parseInt(strNum);	// 문자열을 int 타입의 값으로 변환하는 메서드
		System.out.println("num: " + (num+1));
		
		Integer num2 = 10;	// 직접 대입도 가능 = 오토박싱 (기본형을 래퍼클래스 타입으로 바꿔주는 것)
		int num3 = Integer.valueOf(10);	// 오토언박싱 (자동으로 기본형으로 바꿔주는 것)
		// 밑줄로 그인 건 경우가 자바에서 권장하지 않기 때문..오토박싱, 오토언박싱 쓰길 바라는 것. 생성자를 통한 선언은 JDK 1.9부터 사용하지 않는 것을 권장
		Integer num4 = new Integer(10); // new 써서 하면 주소값이 달라짐
		Integer num5 = Integer.valueOf(10);
		
		System.out.println(System.identityHashCode(num2));
		System.out.println(System.identityHashCode(num3));
		System.out.println(System.identityHashCode(num4));	// 얘만 값이 다름
		System.out.println(System.identityHashCode(num5));
		
		
		// 실수형 타입 선언
		Double doubleNum = Double.valueOf(3.141592);
		Double doubleNum2 = Double.parseDouble("3.141592");	// 문자열을 Double 타입의 값으로 변환하는 메서드
		
		
		// 문자형 타입 선언
		Character ch = Character.valueOf('A');
	}
}
