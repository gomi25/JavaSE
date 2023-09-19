package section05;
/*
*
**
***
****
*****
******
*******
반복문 조건문 연습
 주말숙제 2중for문 코드 분석하기 
 
2번
   *
  **
 ***
****
3번
   *
  ***
 *****
******* 
  
4번
					
   *   		
  ***				
 *****				
*******				
 *****		
  ***		
   *		
 
5번 구구단
	 2 x 1 = 2 	3 x 1 = 3	4 x 1 = 4
 */
public class LoopHomeWork {
	public static void main(String[] args) {
		// 1번 - 나
		for(int i = 1; i < 8; i++) {
			for(int j = 1; j < i+1; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		// 2번
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
				System.out.println();
		}	
		
		// 3번
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		// 4번
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		for(int i = 0; i < 3; i++) {
	        for(int j = 0; j < i+1; j++) {
	            System.out.print(" ");
	        }
	        for(int j = 0; j < 5-(2*i); j++) {
	            System.out.print("*");
	        }
	            System.out.println();
		}	
			
		// 5번 - (단순 구구단 값)
		for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
		// 5번 - (구구단 식 및 값)
		
		for(int k = 0 ; k < 3; k++) {		// 3번씩 반복하게 함
		System.out.println("k = " + k);
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 3; j++) {
				int dan = j + 2 + (k * 3);
				int num = i + 1;
			
//				if(dan < 10) {
//					System.out.print(dan+"x"+num+"="+dan * num+"\t");
//				}
 				if(dan > 9) break; 
				System.out.print(dan+"x"+num+"="+dan * num+"\t");
			}
			System.out.println();  // 개행
		}
		System.out.println();	// 개행
		}	
		
	}
}



