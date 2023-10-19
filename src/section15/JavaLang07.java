package section15;

public class JavaLang07 {
	
	public static void main(String[] args) {
		Integer num1 = 10;
		Integer num2 = 1000;

		/*
		 * compareTo() 와 같은 메서드 사용 가능
		 * 	ex) num1.compareTo(num2)
		 * 		결과가 양수이면 num1 > num2
		 * 		결과가 음수이면 num1 < num2
		 * 		결과가 0이면 num1 == num2
		 */		
		
		if(num1.compareTo(num2) > 0) {
			System.out.println("num1이 num2보다 크다.");
		} else if(num1.compareTo(num2) == 0) {
			System.out.println("num1과 num2는 같다.");
		} else {
			System.out.println("num1이 num2보다 작다.");
		}
		
		
		String str1 = num1.toString();	// 문자열로 변환
		System.out.println(str1);
		
		System.out.println("INT MAX: " + Integer.MAX_VALUE); // int의 MAX값 출력
		System.out.println("INT MIN: " + Integer.MIN_VALUE); // int의 MIN값 출력
		
		System.out.println("문자입니까?" + Character.isLetter('A')); 		// 문자인지 true / false로 반환
		System.out.println("숫자입니까?" + Character.isDigit('5'));			// 숫자인지	"
		System.out.println("공백입니까?" + Character.isWhitespace(' '));	// 공백인지	"
		
		String pwd = "abcd1234";
		char[] charArray = pwd.toCharArray();	// 문자열을 한 글자씩 쪼개서 이를 char타입의 배열에 집어넣어주는 메소드
		// charArray[0] = a, [1] = b ... [6] = 3, [7] = 4
		
		int countLetter = 0;
		int countDigit = 0;
		
		for(char c : charArray) {			// char c = a -> char c = b -> char c = c -> char c = d
			if (Character.isLetter(c)) {
				countLetter++;				// a는 문자가 맞으므로 ++되어 1... d까지 문자가 맞으므로 ++되어 4
			}else if (Character.isDigit(c)) {	// 1은 문자가 아니므로 else if 로 내려옴
				countDigit++;					// 1은 숫자가 맞으므로 ++되어 1... 4까지 숫자가 맞으므로 ++되어 4
			}
		}
		
		if(countLetter > 0 && countDigit > 0) {
			System.out.println("사용할 수 있는 PWD!"); 
		} else {
			System.out.println("영문 숫자 조합으로 PWD 생성 가능합니다.");
		}
		
		
		
	}
	
}
