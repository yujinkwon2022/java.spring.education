package ch01;

public class ObjectTest2 {

	public static void main(String[] args) {
		Cat c = new Cat();
		Cat c2 = new Cat();
		

		
		c.name = "네로";
		c.breeds = "페르시안";
		c.weight = 4.37;
		

		c2.name = "뚠냥이";
		c2.breeds = "코숏";
		c2.weight = 10.5;
		
		System.out.println("c.name = "+ c.name);
		System.out.println("c2.name = "+ c2.name);
		System.out.println("c2.breeds = "+ c2.breeds);
		
		c.healing();
		c2.healing();

	}

}