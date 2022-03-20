package myspring.di.annot.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import myspring.di.annot.Hello;
import myspring.di.annot.Printer;


public class HelloBeanSpringTest {
    public static void main(String [] args) {
    	//1.annot.xml�� ������ �о ��ü�� ���� �� �� ���� �� ��ü�� context�� ����
    	ApplicationContext context =
    			 new GenericXmlApplicationContext("config/annot.xml");
		//2. getBean() ȣ�� (beans.xml�� hello �� ������ ��ü ����)
		Hello hello = (Hello)context.getBean("hello");
		//3. Hello �� sayHello() ȣ��.
		System.out.println("hello.sayHello() = "+ hello.sayHello());
		//3. Hello�� printer() ȣ��
		hello.print();
		
		//StringPrinter  getBean() (beans.xml�� consolePrinter �� ������ ��ü ����)
		Printer printer = context.getBean("consolePrinter",Printer.class);
		System.out.println("printer = " + printer);		
	}
}
