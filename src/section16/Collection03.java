package section16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set		(실무에서는 ArrayList 많이 씀)
 * 	순서가 없는 컬렉션 프레임웍으로
 * 	중복을 허용하지 않는다.
 * 
 * (주머니 안에 데이터가 있는 느낌)
 * 
 *  LinkedHashSet : HashSet 확장한 클래스로 삽입 순서를 유지한다.
 *  TreeSet : 오름차순으로 정렬되어 있다.
 * 
 * 반복자(Iterator)
 * 	자바 컬렉션 프레임웍에서 컬렉션에 저장된 요소를 읽어오는데 사용하는 인터페이스
 * 
 */
public class Collection03 {
		
	public static void main(String[] args) {
								
		Set<String> set = new HashSet<String>();
		
		set.add("피카츄");
		set.add("라이츄");
		set.add("파이리");
		set.add("꼬부기");	// boolean java.util.Set.add(String e) 마우스 커서 댔을 때 이렇게 뜨면 반환값이 boolean이라는 걸 알자
		
		// 중복 값 허용하지 않는다. (list는 중복값 허용)
		boolean isAdd = set.add("피카츄");	// 원래 있던 값이라서 추가가 안되므로 false가 뜸
		System.out.println("is add: " + isAdd);
		
		// 데이터 사이즈 
		System.out.println("데이터 길이: " + set.size());
		
		// 전체 데이터 출력
		for(String name : set) {
			System.out.println("name: " + name);	// 데이터 출력할 때 순서가 없음.
		}
		System.out.println("==================================");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) { // hasNext() - 커서 역할, 다음 요소(데이터)가 있는지 확인하여 논리값 반환. 있으면 true. 
			String name = it.next(); // next() -> 해당 요소 반환
			System.out.println("name: " + name);
		}
		
		System.out.println("===============================");
		
		// TreeSet 객체 생성
		TreeSet<String> treeSet = new TreeSet<String>();
		
		// 데이터 추가하기
		treeSet.add("피카츄");
		treeSet.add("라이츄");
		treeSet.add("파이리");
		treeSet.add("꼬부기");
		
		for(String name : treeSet) {
			System.out.println("treeSet name: " + name);	// 오름차순으로 정렬되어 있음. ㄱ -> ㅎ
		}
		
		
	}
	
	
}
