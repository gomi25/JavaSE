package section16;
			// 꺽새괄호 사용. 아직 타입 안 정해짐. generic은 유동적. 
			// class Generic의 main 메서드에서 객체 생성 시 <String> 으로해서
			// 	  private String data, public String getData 이런 식으로 됨
			// ※ 타입 변수 자리에 사용할 실제 타입을 명시할 때 기본 타입을 바로 사용할 수는 없어서
			//	  이때는 Integer와 같이 래퍼(wrapper) 클래스를 사용해야만 합니다.
public class MyClass<T> {	

	private T data;
	// 마우스 우클릭 -> source -> getters and setters -> 체크 -> 확인
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
