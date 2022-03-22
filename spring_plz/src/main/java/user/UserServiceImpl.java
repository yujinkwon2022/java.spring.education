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
		//��� ���� ��ȸ
		dao.getUser(id);
		//�� ��� ���� ��ȸ
		dao.getAllUser(position);
	}
}
