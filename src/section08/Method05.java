package section08;

public class Method05 {
	public static void main(String[] args) {
	
		String name = getName();
		
		System.out.println("name: " + name);
		
		System.out.println("getName() : " + getName());
		
	}
	
			// 5. 리턴o, 인자x -> 메서드 실행하여 연산결과 값 반환
	public static String getName() {
		String name = "홍길동";	
		
		return name;
	}
	
}
