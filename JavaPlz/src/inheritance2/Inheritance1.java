package inheritance2;

class Triangle{
	int base;
	void t1() {
		System.out.println("»ï°¢Çü ¹Øº¯ =" + base);
	}
}
class Diamond extends Triangle{
	double shine;
	void brilliant() {
		System.out.println("°­µµ "+shine+"À¸·Î ºû³ª´Ù");
	}
}

class Star extends Triangle{
	
	double distance;
	void move() {System.out.println(distance+"±¤³â ÀÌµ¿ÇÏ¸é µµÂø");}
}
public class Inheritance1 {

	public static void main(String[] args) {
		
		Diamond d = new Diamond();
		d.base = 10;
		d.shine =20;
		
		d.t1();
		d.brilliant();
		
		Star s = new Star();
		s.base = 10000;
		s.t1();
		
		s.distance = 30000;
		s.move();

	}

}
