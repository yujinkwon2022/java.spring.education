package ch01;

public class ObjectTest2 {

	public static void main(String[] args) {
		Cat c = new Cat();
		Cat c2 = new Cat();
		

		
		c.name = "�׷�";
		c.breeds = "�丣�þ�";
		c.weight = 4.37;
		

		c2.name = "�ӳ���";
		c2.breeds = "�ڼ�";
		c2.weight = 10.5;
		
		System.out.println("c.name = "+ c.name);
		System.out.println("c2.name = "+ c2.name);
		System.out.println("c2.breeds = "+ c2.breeds);
		
		c.healing();
		c2.healing();

	}

}