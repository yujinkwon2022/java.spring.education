package myspring.di.annot;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hello {
	@Value("Spring")
	private String name;
	
	@Autowired
	@Qualifier("stringPrinter")
	private Printer printer;
	
	public void print() {
		this.printer.print(sayHello());
	}

	public String sayHello() {
		return "Hello " + name;
	}

}
