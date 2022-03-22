package user;

public class UserMariaDBDao implements UserDao{
	
	public void getUser(String id) {
		System.out.println("마리아 디비에서 아이디 "+ id +" 정보 조회");
	}
	
	public void getAllUser(String position) {
		System.out.println("마리아 디비에서 전 사원 정보 조회");
	}
}
