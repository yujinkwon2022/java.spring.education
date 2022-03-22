package user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopTest {

	public static void main(String[] args) {
		//1.annot.xml의 설정을 읽어서 객체를 생성 한 후 리턴 할 객체를 context에 저장
    	ApplicationContext context =
    			 new GenericXmlApplicationContext("config/annot.xml");
    	//UserServiceImpl 타입의 객체명 myService 리턴 받음
    	UserServiceImpl service = context.getBean("myService",UserServiceImpl.class);
		System.out.println("============================================");
		System.out.println("팀장의 service.manageUser 호출  시작 ");
    	//UserServiceImpl의 managerUser 호출 (팀장)
    	service.manageUser("gildong", "teamboss");
    	System.out.println("팀장의 service.manageUser 호출  종료");
    	System.out.println("============================================");
    	System.out.println("============================================");
		System.out.println("평사원의 service.manageUser 호출  시작 ");
    	service.manageUser("aroma", "employee");
    	System.out.println("평사원의 service.manageUser 호출  종료");
    	System.out.println("============================================");
	}


}
