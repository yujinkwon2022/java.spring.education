package ch08;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class A {

	public static void main(String[] args) {
		GregorianCalendar date = (GregorianCalendar) Calendar.getInstance();
		System.out.println("date =" + date);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = df.format(date.getTime());
		System.out.println("strDate = " + strDate);

	}

}
