package section15;
/*
 * 문자열을 동적으로 다루기 위한 클래스
 * 	StringBuffer - Thread Safe
 *  StringBuilder - Thread Safe X
 * 
 * 
 * 
 */
public class JavaLang04 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("def");	// 원래 입력값에서 뒤에 붙음 
		sb.insert(1, "가나다");	// 인덱스 1번 위치에 삽입
		sb.delete(2, 3);	// 2번째 인덱스부터 3번째 인덱스 앞까지 삭제
		sb.reverse();		// 문자열 뒤집힘
		
		System.out.println(sb);	// 출력값이 바뀜
		System.out.println(System.identityHashCode(sb)); // 해시코드 값은 그대로임
		
		StringBuilder sb2 = new StringBuilder();	
		sb2.append("Hello,");
		System.out.println(sb2);	
		System.out.println(System.identityHashCode(sb2));
		sb2.append("Java!");
		System.out.println(sb2);
		System.out.println(System.identityHashCode(sb2));
		
	}

}
