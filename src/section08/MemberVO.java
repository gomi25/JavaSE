package section08;
/*
 * VO (Value Object), DTO (Data Transfer Object)
 * 	값 오브젝트로써 목적의 맞는 변수의 집합.
 * 	Database 또는 네트워크 통신 값 운반용으로 사용.
 * 
 * 캡슐화(정보은닉) - 객체의 속성과 행위를 하나로 묶고 외부로부터 내부를 감싸 숨겨 은닉한다.
 * 
 * this
 * 	자기자신을 참조하는 연산자
 * 
 */

public class MemberVO {
	// public 다른데서 호출 가능한데 private 여기 클래스에서만 쓸 수 있음 (public, private = 접근제한자)
	private String id;
	private String password;
	private String name;
	private String mobile;
	private String email;

	public static void printHello() {
		System.out.println("Hello, MemberVO");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}