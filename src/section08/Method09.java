package section08;

public class Method09 {
	
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		memberVO.setId("025");
		memberVO.setName("피카츄");
		memberVO.setPassword("피카피카");
		
		String id = memberVO.getId();
		String name = memberVO.getName();
		String pwd = memberVO.getPassword();
		
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Pwd : " + pwd);
		
	}

	
	
	
}
