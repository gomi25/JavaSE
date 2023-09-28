package section06;

public class ArrayHomeWork {
	
	public static void main(String[] args) {
	
/*		int[][] array = {
				{1, 2, 3, 4, 5, 6, 7},
				{8, 9, 10, 11, 12, 13, 14},
				{15, 16, 17, 18, 19, 20, 21}
			};
*/		
			
		int[][] array = new int[7][7];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				int value = i * 7 + j + 1;
				array[i][j] = value;
			}
				
		}
		
		for(int i = 0; i < 13; i++) {
			if(i < 7) {
				for(int j = 0; j < i + 1; j++) {
					if(i % 2 == 0) {
						System.out.print(array[i-j][j] + " ");
					} else {
						System.out.print(array[j][i-j] + " ");
					}
				}
			} else {
				for(int j = 0; j < 13 - i; j++) {
					if(i % 2 == 0) {
						System.out.print(array[6-j][i-6+j] + " ");
					} else {
						System.out.print(array[i-6+j][6-j] + " ");
					}
				}
				
			}
		System.out.println();
		
		
		}
	
	}
}

	
