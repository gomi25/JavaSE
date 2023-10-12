package section12.access3;
							// 인터페이스끼리 상속 시 extends를 사용. 다중상속가능. 오버라이딩 필요X(구현안되니까)
public interface BluethoothMIC extends Microphone, Speaker {

	public abstract void connect();
	
}
