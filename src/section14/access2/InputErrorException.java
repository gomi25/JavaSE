package section14.access2;

public class InputErrorException extends Exception {	// Exception 상속받으면 예외 만들 수 있음
		// 1. 변수 만들어주기
	private String message;
		// 2. 생성자 만들어주기 
	public InputErrorException(String message) {
		this.message = message;
	}
	
	@Override 	// 3. getMessage 오버라이딩
		public String getMessage() {
			return this.message;
		}
}
