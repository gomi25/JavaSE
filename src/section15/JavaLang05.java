package section15;

import java.util.Arrays;

public class JavaLang05 {

	public static void main(String[] args) {
		// ★★★문자열 다 중요~!★★★
		
		// 1. 문자열 길이 length
		String str1 = "ABCDEFGHIJK";	// 11
		System.out.println("length: " + str1.length());
		
		// 2. 문자열이 지정한 문자로 시작하는지 판단
		String str2 = "apple";		//     ↓ a로 문자열이 시작하는지 물어보는 것
		boolean startWith = str2.startsWith("a");
		System.out.println("startsWith: " + startWith);
		
		// 3. 문자열 마지막에 지정한 문자가 있는지 판단
		String str3 = "text";		//	   ↓ t로 문자열이 마지막인지 물어보는 것
		boolean endsWith = str3.endsWith("t");
		System.out.println("endsWith: " +endsWith);
		
		// 4. ★문자 인덱스번호 반환
		String str4 = "abcdef";
		int indexOf = str4.indexOf("d");
		System.out.println("indexOf: " + indexOf);
		
		// 5. 문자열에 지정한 문자가 마지막 몇번째 있는지 int로 반환
		String str5 = "AndroidApp";
		int lastIndexof = str5.lastIndexOf("A");
		System.out.println("lastIndexOf: " + lastIndexof);
		
		// 6. 문자열 치환
		String str6 = "A*B*C*D";	// ↓ "*"을 "-"로 바꿔줌
		String replace = str6.replace("*", "-");
		System.out.println("replace: " + replace);
		
		// 7. 정규식을 이용해서 문자열 편집하기
		String str7 = "Hello, 123 World! 456 Java 789";
		String replaceAll = str7.replaceAll("\\d", "");
		System.out.println("replaceAll: " + replaceAll);
		
		// 8. ★ 문자열 나누기. 배열로 반환
		String str8 = "A:B:C:D:E:F:G:abcdefg";
		String[] splitArr = str8.split(":");
		for(String split : splitArr) {
			System.out.println(split);	
		}					//Arrays는 import 필요!
		System.out.println(Arrays.toString(splitArr));
		
		// 9. 문자열 절삭
		String str9 = "abcDEF";
		String substring = str9.substring(0, 2); // 0번부터 2글자만 반환
		System.out.println("substring: " + substring);
		
		// 10. 소문자로 변환
		String str10 = "abcDEF";
		String toLowerCase = str10.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase);
		
		// 11. 대문자로 변환	※ 원래 값을 바꾸는게 아님
		String str11 = "abcDEF";
		String toUpperCase = str11.toUpperCase();
		System.out.println("toUpperCase: " + toUpperCase);
		
		// 12. 앞뒤의 공백을 제거(중간 공백은 안됨)
		String str12 = "	java java java	";
		String trim = str12.trim();
		System.out.println("trim: " + trim);
		
		// 13. 중간 공백을 제거
		String str13 = "	java java java	";
		String replace2 = str13.replace(" ", "");
		System.out.println("replace2: " + replace2);
		
		// 14. ★문자 비교	-> 크기에 따라 : 같으면 0, 작으면 -1, 크면 1
		String str14 = "A";
		String strr14 = "B";
		int compareTo = str14.compareTo(strr14);
		System.out.println("compareTo: " + compareTo);
		
		// 15. 문자 포함 여부
		String str15 = "abcd";
		String strr15 = "cd";
		boolean contains = str15.contains(strr15);
		System.out.println("contains: " + contains);
		
	}
}
