package section13.access1;

public class MyUtil {
	
	public String str1 = "일반멤버 변수";
	public static String str2 = "정적멤버 변수";
	
	
	public class HelloPrinter { // 내부클래스(static X)
		public void printHello() {
			System.out.println("인스턴스 내부클래스 HelloPrinter 입니다.");
			System.out.println(str1);	//1. 가능  -> HelloPrinter 안에서 str1에 접근하는게 MyUtil 생성되어야 접근 가능한 부분..?
			System.out.println(str2);	//2. 가능  -> static 은 다 접근 가능
		}
	}
	
	public static class Calculater { // 내부클래스(static O)
		public void calc(int a, int b) {
			System.out.println("전달받은 두 정수의 합: " + (a + b));
			//System.out.println(str1);	//3. 불가능
			System.out.println(str2);	//4. 가능  -> static 은 다 접근 가능
		}
	}
	
	
}
