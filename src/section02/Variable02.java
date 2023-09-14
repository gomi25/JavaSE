package section02;
/*
 * 2. 문자형(char)				- 홀따옴표(') 쓰고 문자 하나만 넣을 수 있음
 *  문자 한글자 저장 가능한 변수
 *  2byte
 *  세계 각 나라의 문자를 숫자(0~65535)로 매핑해둔 국제 표준 규약이다.
 *  각 문자는 1~2byte의 크기를 가지고 있다.
 *  
 *  			
 * 선언방법
 *  char 변수명;
 *  
 */
public class Variable02 {
	public static void main(String[] args) {
		// char 형 변수 선언 및 대입하기
		char ch1 = 'A';
		System.out.println("char 형 변수에 저장된 문자: " + ch1);
		
		char ch2, ch3;
		ch2 = '金';
		ch3 = '뷁';
		System.out.println("ch2 저장된 문자: " + ch2);
		System.out.println("ch3 저장된 문자: " + ch3);
	}
}
