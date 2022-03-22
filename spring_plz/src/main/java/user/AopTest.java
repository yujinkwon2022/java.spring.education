package user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopTest {

	public static void main(String[] args) {
		//1.annot.xml�� ������ �о ��ü�� ���� �� �� ���� �� ��ü�� context�� ����
    	ApplicationContext context =
    			 new GenericXmlApplicationContext("config/annot.xml");
    	//UserServiceImpl Ÿ���� ��ü�� myService ���� ����
    	UserServiceImpl service = context.getBean("myService",UserServiceImpl.class);
		System.out.println("============================================");
		System.out.println("������ service.manageUser ȣ��  ���� ");
    	//UserServiceImpl�� managerUser ȣ�� (����)
    	service.manageUser("gildong", "teamboss");
    	System.out.println("������ service.manageUser ȣ��  ����");
    	System.out.println("============================================");
    	System.out.println("============================================");
		System.out.println("������ service.manageUser ȣ��  ���� ");
    	service.manageUser("aroma", "employee");
    	System.out.println("������ service.manageUser ȣ��  ����");
    	System.out.println("============================================");
	}


}
