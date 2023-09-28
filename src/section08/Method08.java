package section08;

public class Method08 {

	public static void main(String[] args) {
		int num = 10;
		valTest(num);
		System.out.println(num);
		
		System.out.println("==========================");
		
		int[] values = {1, 2, 3, 4, 5};
		
		refTest(values);
		
		
		// 향상된 for문
		for(int value : values) {		// values의 요소가 하나씩 대입돼서 출력됨
			System.out.println(value);
		}
	}

	public static void valTest(int num) {	// 기본형 변수
		num = 4;	// 여기서 값을 4로 바꿨어도 지역변수라서 출력에 영향없음. main의 num과는 다름
	}
	
	public static void refTest(int[] values) {	// 참조형 변수(주소값 들어감)
		values[1] = 10;
		
		
	}
	
}
