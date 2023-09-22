package section06;
/*
 * 배열 (Array)
 * 	같은 자료형의 변수를 지정하여 여러 데이터를 저장할 수 있는 공간을 의미한다.
 * 
 * 
 * null
 * 	참조타입 변수에서 어떤 객체를 참조하지 않음을 나타낸다.
 * 	즉, 비어있는 상태를 나타낸다.
 *  
 */
public class Array01 {
	public static void main(String[] args) {
		// 정수 10개를 담을 수 있는 배열 객체 생성
		int[] nums = new int[10];	// int 타입의 10개를 저장할 수 있는 객체구나~
		
		int[] nums2 = null;
		
		// 실수 10개를 담을 수 있는 배열 객체 생성
		double[] dNums = new double[10];
		
		// 문자열 10개를 담을 수 있는 배열 객체 생성
		String[] str = new String[10];
		
		System.out.println(nums);
		System.out.println(dNums);
		System.out.println(str);
		
		
	}

}
