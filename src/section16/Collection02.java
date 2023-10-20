package section16;

/*
 * List - 아주아주 많이 사용함. 
 * 	컬렉션 프레임웍 중 하나 인터페이스로 순서가 있는 데이터 모음을 다루는 객체
 * 	선형 배열 객체
 * 	가변 배열 객체
 * 	인덱스 값이 있다.
 * 
 * List - ArrayList, Vector, LinkedList
 * 
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection02 {
		// List는 인터페이스!
	public static void main(String[] args) {
							// ArrayList는 선형리스트. list를 상속받음
		List<String> list = new ArrayList<String>();
		//타입List
		//ArrayList로 적어도 되는데 다형성으로 List로 적어도 괜찮음
		
		// 데이터 저장하기 
		// add()메서드로 저장 가능	인덱스번호
		list.add("피카츄");		// 0
		list.add("라이츄");		// 1
		list.add("파이리");		// 2
		list.add("꼬부기");		// 3
		list.add("버터풀");		// 4 
		list.add("야도란");		// 5
		list.add("피존투");		// 6 
		list.add("또가스");		// 7
		
		// 저장된 데이터 특정 인덱스 값으로 얻어오기 (삭제되지 않음)
		String pokemon = list.get(6);	// get()메서드로 불러올 수 있음
		System.out.println("list 6 인덱스 값: " + pokemon);
		
		// 저장된 데이터 특정 인덱스 값으로 삭제
		list.remove(1);	// 8개 데이터 중에 1개 삭제
		System.out.println("저장된 데이터 개수: " + list.size());	 // 결과값 7개
		
		System.out.println(list.get(1)); // 1번 인덱스가 삭제되면서 뒤에 데이터들이 하나씩 앞으로 당겨져서 파이리가 출력
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list: " + list.get(i));
		}
		
		System.out.println("================================");
		// 특정 인덱스 데이터 삽입
		list.add(4, "잠만보"); // 5번째(0부터 시작이라) 인덱스에 잠만보를 넣고 싶어
		
		// 향상된 for문
		for(String name : list) {
			System.out.println("name: " + name);
		}
		
		System.out.println("================================");
		// LikedList 삽입&삭제 성능이 좋다!
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("메타몽");
		linkedList.add("이브이");

		for(String mon : linkedList) {
			System.out.println("mon: " + mon);
		}
		
		System.out.println("================================");
		// ArrayList와 동일한 기능 + Thread Safe
		List<String> vec = new Vector<String>();
		vec.add("슈퍼맨");
		vec.add("배트맨");
		
		for(String hero : vec) {
			System.out.println("hero: " + hero);
		}
		
	}
	
}
