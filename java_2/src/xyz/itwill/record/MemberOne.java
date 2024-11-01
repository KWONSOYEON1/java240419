package xyz.itwill.record;

//회원정보(아이디, 이름, 이메일)를 저장하기 위한 클래스 - 값을 저장할 목적의 클래스
public class MemberOne {
	private String id;
	private String name;
	private String email;
	
	public MemberOne() {
		// TODO Auto-generated constructor stub
	}

	public MemberOne(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "아이디 = "+id+", 이름 = "+name+", 이메일 = "+email;
	}
}