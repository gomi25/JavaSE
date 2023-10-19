package section15;

import java.util.Random;

public class javaUtil02 {

	public static void main(String[] args) {
		
		int[] iArray = new int[45];					// iArray 배열의 정수 개수 45개
		for(int i = 0; i < iArray.length; i++) {	// i가 0일 때 i는 44가 될 때까지 증가하면서 for문 반복
			iArray[i] = i+1;						// 인텍스 0부터 1 ~ 인덱스 44까지 45 값 부여 
		}
		
		Random ran = new Random();					// 랜덤난수 객체 생성
		
		// 1~45 섞어주는 반복문
		for(int i = 0; i < iArray.length; i++) {	// i가 0일 때 i는 44가 될 때까지 증가하면서 for문 반복
			int cIndex = ran.nextInt(45);			// 0부터 44까지 난수값 반환 (어떤 값이 올지 모름)
			/*	ex. 변수 cIndex = 3
			 * 			i = 1
						iArray[1] <- 인덱스1의 값은 2 
						imp = 2   <- 2를 tmp에
						iArray[3] = 2				※ 값이 사라지지 않게 하기 위해 변수 이용해 위치 바꿔준고
			*/
			int tmp = iArray[i];					// ★
			iArray[i] = iArray[cIndex];				// ★
			iArray[cIndex] = tmp;					// ★
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(iArray[i] + "/");
		}
		
	}
}
