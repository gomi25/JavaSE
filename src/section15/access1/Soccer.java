package section15.access1;
	
public class Soccer implements Cloneable {	// Cloneable 상속받으면 clone 메서드 상속 가능
	
	public String name;			// 팀이름	
	public String location; 	// 지역
	public String since;		// 창단연도
	public String league;		// 리그	
	
	public Soccer(String name, String location, String since, String league)
	{
		this.name = name;
		this.location = location;
		this.since = since;
		this.league = league;
	}

		
	@Override	// toString 오버라이딩 - objcet 상속을 받는데 String도 toString이 오버라이딩 해서 문자열값이 출력됨
		public String toString() {
			return name+"@"+league;
	}
	
	@Override	// clone 오버라이딩. 접근제한자가 protected로 되어있어서 다른 패키지에 호출이 안됨
		protected Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	
	// protected로 되어 있어서 대신 호출해줄 수 있는 메서드를 만듬
	// callClone 메서드를 통해 clone을 접근할 수 있도록. public이라서 다른 패키지도 접근 가능
		public Object callClone() throws CloneNotSupportedException {
			return clone();
		}
}
