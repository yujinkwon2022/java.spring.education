package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myService")
public class UserServiceImpl {
	@Autowired
	@Qualifier("myDao")
	UserDao dao;
	
	public void manageUser(String id, String position) {
		//사원 정보 조회
		dao.getUser(id);
		//전 사원 정보 조회
		dao.getAllUser(position);
	}
}
