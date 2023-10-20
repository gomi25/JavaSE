package section16;
/*
 * 제네릭(Generic)
 * 	코드의 재사용성과 타입 안정성을 클래스나 메서드를 일반적인 타입 대신 실제 타입으로 지정할 수 있게 한다.
 *  1. 잘못된 타입의 값이 들어오는 것을 방지할 수 있다.
 *  2. 강제 형변환(cast) 없이 사용가능하다.
 * 
 */
public class Generic {
	public static void main(String[] args) {
		// 여기서 타입을 String으로 지정함
	MyClass<String> mc1 = new MyClass<String>();
	mc1.setData("Hello, Generic!");
	
	String data = mc1.getData();
	System.out.println("data: " + data);
	
	MyClass mc2 = new MyClass<>();	// 타입 지정을 안 할 수도 있음
	mc2.setData("Nice to meet you!");
	
	String data2 = (String) mc2.getData(); // 그러다 get에서 타입 지정 안되어 있어서 에러뜸
	System.out.println("data2: " + data2); // 강제 형변환 안 해주면 object타입으로 됨..

	}
}
