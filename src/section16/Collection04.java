package section16;

/*
 * Map
 * 	Map 인터페이스는 키-값 쌍으로 데이터를 저장하는 자료구조이다.
 * 	키는 중복을 허용하지 않는다. 순서 보장하지 않는다.
 * 	값은 중복을 허용한다.
 * 
 * 
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection04 {
	
	public static void main(String[] args) {
		// 		제네릭 2개
		//	 k(key)  v(value)	
		Map<String, Integer> map = new HashMap<String, Integer>();
			
		// 데이터 저장하기
		map.put("Alice", 95);
		map.put("Bob", 82);
		map.put("David", 90);
		map.put("Son", 100);
		
		// map 값 가져오기
		int score = map.get("Alice");
		System.out.println("Alice score: " + score);
		
		// 특정 키의 존재 여부 확인
		if(map.containsKey("Son")) {
			System.out.println("Son score: " + map.get("Son"));
		}
		
		// 전체 key값 가져오기
		Set<String> keys = map.keySet();	// key값을 Set으로 가져올 수 있음
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int score2 = map.get(key);
			
			System.out.println("name: " + key);
			System.out.println("score: " + score2);
		}
		
		System.out.println("====================================");
		
		map.put("Son", 90); 	// 값을 90으로 수정
		map.remove("David");	// 값 삭제
		
		// entrySet() - Map에 키-값 쌍을 포함하는 Map.Entry를 요소로 가지고 있는 Set을 반환하는 메서드
		//			  - 항복을 편리하게 순회하거나 수정할 때 사용된다.
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.println("name: " + entry.getKey());
			System.out.println("score: " + entry.getValue());
		}
	}
}
