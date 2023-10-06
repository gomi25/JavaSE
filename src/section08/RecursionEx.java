package section08;
//재귀함수 예제?
public class RecursionEx {
	
	//일반 반복 메서드
	public static void printNumber(int n) {
		while(n > 0) {
			System.out.println(n);
			n--;
		}
	}

	// 재귀 메서드
	/*
	 * recursionPrintNumber(10) -> 10
	 * 	recursionPrintNumber(9)  -> 9
	 * 	 recursionPrintNumber(8)  -> 8 
	 * 		(7~2)...recursionPrintNumber(1)	-> 1
	 * 이 순서대로 쭈욱 쌓이다가 마지막부터 종료됨
	 */
	public static void recursionPrintNumber(int n) {
		if(n > 0) {
			System.out.println(n);
			recursionPrintNumber(--n); // (n-1)도 가능
		}
		
	}
	
	public static void main(String[] args) {
		// 매개변수 10 -> 10 ~ 1 까지 출력하기
//		printNumber(10);
		recursionPrintNumber(10);
	}
	
	
	
	
}
