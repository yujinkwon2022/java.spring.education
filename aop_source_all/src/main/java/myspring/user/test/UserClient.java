package myspring.user.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.user.service.UserService;
import myspring.user.vo.UserVO;

public class UserClient {
	public static void main(String args[]) {
		//1.beans.xml의 설정을 읽어서 객체를 생성 한 후 리턴 할 객체를 context에 저장
    	ApplicationContext context =
    			 new GenericXmlApplicationContext("config/beans.xml");
    	//인터페이스 UserService를 상속 받아서 구현한 객체 UserServiceImpl 리턴 받음
    	UserService service = context.getBean(UserService.class);
    	//UserServiceImpl의 getUser메서드 호출
		UserVO user = service.getUser("gildong");
		System.out.println(user);
		//UserVO 의 getUserId()메서드 호출
		System.out.println("user.getUserId() = " + user.getUserId());
	}
}
