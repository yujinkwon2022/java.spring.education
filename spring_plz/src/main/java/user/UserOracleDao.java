package user;

import org.springframework.stereotype.Component;

@Component ("myDao")
public class UserOracleDao implements UserDao{
	
	public void getUser(String id) {
		System.out.println("오라클에서 아이디 " + id +"인 사원 정보 조회");
	}
	
	public void getAllUser(String position) {
		System.out.println("오라클에서 전사원 정보 조회");
	}

}
