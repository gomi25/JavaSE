package section02;
/* 
 *		< 단축키 > 
 * 		Ctrl + s : 저장 단축키
 * 		Ctrl + Shift + s : 전체 저장 단축키
 * 
 * 
 * 3. 정수형 (크기가 다른 타입들이 있음)			
 *  byte	(1byte) : -128 ~ +127 (중간에 0 포함해서 127인거임) 
 *  short	(2byte) : -32,768 ~ +32,767 (")
 *  int		(4byte) : -2,147,483,648 ~ +2,147,483,647 (") (21억 내외로 있다~정도는 알아놓자, 왜냐.. 값이 넘어가면 - or +로 돌아감)
 *  long	(8byte) : -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807
 * 
 * 
 */
public class Variable03 {
	
	public static void main(String[] args) {
		byte num1 = 20;
		// byte 저장할 수 있는 숫자범위 (-128~127) 초과로 이클립스에서 빨간색 밑줄 생김
		// byte num5 = 128;
		short num2 = 30;
		int num3 = 40;
		long num4 = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		// byte over flow 해보자
		num1 += 120; // num1 = num1 + 120; (num1은 20이고 거기에 120 더해서 140임)
		System.out.println(num1);
		// 140-127=13, -128+13=-116 값이 나옴
		
		// 숫자 리터럴 값이 int범위 초과하는 경우 L을 붙여 long형임을 컴파일러에게 알려줘야 한다. (소문자 대문자 모두 가능)
		long num6 = 2147483648L;
		
		// 2진수 값 대입 0b로 시작
		byte num7 = 0b0100;
		System.out.println(num7);	// 출력은 10진수로 출력
		// 8진수 값 대입 0으로 시작
		short num8 = 010;
		System.out.println(num8);
		// 16진수 값 대입 0x로 시작
		int num9 = 0xFF;
		System.out.println(num9);
		
	}

}
