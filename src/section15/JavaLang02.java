package section15;
/*
 * 1. 얕은 복사(Shallow Copy)
 * 	- 참조형 변수에 주소값만 복사
 *  - 동일한 객체를 참조한다.
 *  
 * 2. 깊은 복사(Deep Copy)
 * 	- 객체의 멤버 변수 값과 객체가 참조하는 객체까지 모두 복사하는 방식
 * 	- 새로운(다른) 객체를 참조한다.
 * 
 */
import section15.access1.Soccer;

public class JavaLang02 {
											// 예외처리해야 함
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Soccer soccer1 = new Soccer("토트넘 훗스퍼", "런던", "1882년", "프리미어리그");
		
		Soccer soccer2 = soccer1;	// 얕은 복사
		
						// 형변환 - 반환값이 Object라서 부모에서 자식 객체로 형변환할 때는 강제 형변환해야
						//        Object는 모든 것의 부모라서 형변화만 하면 사용 가능
		Soccer soccer3 = (Soccer) soccer1.callClone();	// 깊은 복사
		
		if(soccer1.equals(soccer2)) {
			System.out.println("soccer1과 soccer2는 같다.");
		} else {
			System.out.println("soccer1과 soccer2는 다르다.");
		}
						
		if(soccer1.equals(soccer3)) {
			System.out.println("soccer1과 soccer3는 같다.");
		} else {
			System.out.println("soccer1과 soccer3는 다르다."); // 다르다고 출력됨. 
		}
		
		
		System.out.println(soccer1);
		System.out.println(soccer3);
	}
	

}
