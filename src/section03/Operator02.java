package section03;
/*
 * 2. 증감연산자
 * 	++ : 1씩 증가시킨다.
 *	-- : 1씩 감소시킨다.
 * 
 */
public class Operator02 {
	public static void main(String[] args) {
		int num = 0;
		num = num + 1;
		System.out.println(num);	// 1
		num++;
		System.out.println(num);	// 2
		
		// 전위 증감연산자 - 명령어가 실행 전 1 증가 (+1 후에 println이 실행)
		System.out.println(++num);	// 3
		// 후위 증감연산자 - 명령어가 실행 후 1 증가 (println이 실행 후에 +1)
		System.out.println(num++);	// 3
		System.out.println(num);	// 4
		System.out.println(--num);	// 3
		System.out.println(num--);	// 3
		System.out.println(num);	// 2
		
	}
}
