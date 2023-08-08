
class MemberService {

	boolean login(String id, String passward) {

		if (id.equals("hong") && passward.equals("12345")) {

			return true;
		}
		return false;
	}

	void logout(String id) {

		if (id.equals("hong"))
			System.out.println("로그아웃 되었습니다.");
		else
			System.out.println("아이디를 확인하세요.");

	}

}	
	public class MemberServiceExample {
	

	public static void main(String[] args) {

		Member user1 = new Member("홍길동", "hong");
		MemberService mem = new MemberService();
		boolean res = mem.login("king", "12345");
		if (res) {
			System.out.println("로그인 성공");
			mem.logout("hong");
		} else {
			System.out.println("아이디 또는 비밀번호가 올바르지 않습니다.");
		}

	}

}

class Member {
	String name;
	String id;
	String passward;
	int age;

	public Member() {

	}

	// 인자 생성자
	public Member(String name, String id) {

		this.name = name;
		this.id = id;

	}

}
