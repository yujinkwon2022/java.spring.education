package myspring.di.xml.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;

public class HelloBeanTest {
    public static void main(String [] args) {
    	//1.beans.xml의 설정을 읽어서 객체를 생성 한 후 리턴 할 객체를 context에 저장
    	ApplicationContext context =
    			 new GenericXmlApplicationContext("config/beans.xml");
		//2. getBean() 호출 (beans.xml에 hello 로 설정된 객체 리턴)
		Hello hello = (Hello)context.getBean("hello");
		//3. Hello 의 sayHello() 호출.
		System.out.println("hello.sayHello() = "+ hello.sayHello());
		//3. Hello의 printer() 호출
		hello.print();
		
		//StringPrinter  getBean() (beans.xml에 printer 로 설정된 객체 리턴)
		Printer printer = context.getBean("printer",Printer.class);
		System.out.println("printer = " + printer);
	}
	
	

}
