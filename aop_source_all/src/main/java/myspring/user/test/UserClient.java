package myspring.user.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.user.service.UserService;
import myspring.user.vo.UserVO;

public class UserClient {
	public static void main(String args[]) {
		//1.beans.xml�� ������ �о ��ü�� ���� �� �� ���� �� ��ü�� context�� ����
    	ApplicationContext context =
    			 new GenericXmlApplicationContext("config/beans.xml");
    	//�������̽� UserService�� ��� �޾Ƽ� ������ ��ü UserServiceImpl ���� ����
    	UserService service = context.getBean(UserService.class);
    	//UserServiceImpl�� getUser�޼��� ȣ��
		UserVO user = service.getUser("gildong");
		System.out.println(user);
		//UserVO �� getUserId()�޼��� ȣ��
		System.out.println("user.getUserId() = " + user.getUserId());
	}
}
