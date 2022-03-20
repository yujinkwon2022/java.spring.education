package myspring.di.xml.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;

public class HelloBeanTest {
    public static void main(String [] args) {
    	//1.beans.xml�� ������ �о ��ü�� ���� �� �� ���� �� ��ü�� context�� ����
    	ApplicationContext context =
    			 new GenericXmlApplicationContext("config/beans.xml");
		//2. getBean() ȣ�� (beans.xml�� hello �� ������ ��ü ����)
		Hello hello = (Hello)context.getBean("hello");
		//3. Hello �� sayHello() ȣ��.
		System.out.println("hello.sayHello() = "+ hello.sayHello());
		//3. Hello�� printer() ȣ��
		hello.print();
		
		//StringPrinter  getBean() (beans.xml�� printer �� ������ ��ü ����)
		Printer printer = context.getBean("printer",Printer.class);
		System.out.println("printer = " + printer);
	}
	
	

}
