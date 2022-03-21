package ch01;

public class ObjectTest01 {

	public static void main(String[] args) {
		Cat c = new Cat();
		
		System.out.println("c = " + c);
		
		c.name = "네로";
		System.out.println("이름 = " + c.name);
		
		c.breeds = "페르시안";
		c.weight = 4.37;
//		
//		Cat c2 = new Cat();
//		c2.name = "뚠냥이";
//		c2.breeds = "코숏";
//		c2.weight = 10.5;
		
		System.out.println("println 사용, 이름 = "+ c.name + ",품종 = "+ c.breeds + ",체중 = "+ c.weight);
		System.out.printf("printf 사용, 이름 = %s, 품종 = %s , 체중 = %f \n", c.name, c.breeds, c.weight);
		
		System.out.printf("printf 사용2, 이름 = %s, 품종 = %s , 체중 = %.2f\n ", c.name, c.breeds, c.weight);
		
//
//		System.out.println("c2.name = "+ c2.name);
//		System.out.println("c2.breeds = "+ c2.breeds);

	}

}
