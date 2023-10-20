package section16;
/*
 * 컬렉션(Collection)
 * 	자바에서 컬렉션은 여러 객체를 모아서 저장하고 관리하는 자료구조를 말한다.
 * 
 * Stack 클래스   ---> 생각보다 많이 안 씀
 * 	선입후출(FILO) : 먼저 들어온 값이 마지막에 나간다.
 * 
 */
import java.util.Stack;

public class Collection01 {
	
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		// Stack 객체에 자료 저장하기
		stack.push("피카츄");	// push 로 저장함. 가장 아래에 쌓여있음
		stack.push("라이츄");
		stack.push("파이리");
		stack.push("꼬부기");
		stack.push("버터풀");
		stack.push("야도란");
		stack.push("또가스");

		// 현재 저장하고 있는 데이터 개수
		System.out.println("데이터 개수: " + stack.size());		// size()메서드로 개수 반환 가능
		
		// 데이터를 하나씩 가져오기
		System.out.println("1번: " + stack.pop());		// 제일 마지막에 들어온게 제일 먼저 나옴
		System.out.println("2번: " + stack.pop());			
		System.out.println("3번: " + stack.pop());		// 반환 후에 데이터가 삭제됨
		
		// 가장 위에 있는 데이터 확인 (pop으로 안 뽑아보는 이유는 삭제되기 때문에 확인만 하고 싶으면 이 방법으로)
		System.out.println("가장 위에 있는 데이터: " + stack.peek());		// peek()메서드 사용하면 됨
	
		//while(!stack.empty());  // 비어있으면 true 이기 때문에(있으면 false) !붙여서 비어있지 않을 때 반복문 실행토록
		// 위에랑 아래랑 똑같은 거
		while(stack.empty() == false) {	// false == false -> true
			String name = stack.pop();
			System.out.println("pop 데이터: " + name);
		}
	}
}
