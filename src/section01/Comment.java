package section01;
/*
 *
 *
 *
 *
 *
 */
public class Comment {
	public static void main(String[] args) {
		// 한줄 주석
		System.out.println("Hello, Java!");
		
		int r = 10;
		area(r);
	}
	
	/**
	 * 원의 넓이를 구하는 메서드
	 * 
	 * @param r - 반지름
	 */
	public static void area(int r) {
		// 원의 넓이
		double area = Math.PI * Math.pow(r, 2);
		System.out.println("원의 넓이: " + area);
		
	}
}
