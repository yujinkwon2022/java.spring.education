package ch01;

public class ObjectTest01 {

	public static void main(String[] args) {
		Cat c = new Cat();
		
		System.out.println("c = " + c);
		
		c.name = "�׷�";
		System.out.println("�̸� = " + c.name);
		
		c.breeds = "�丣�þ�";
		c.weight = 4.37;
//		
//		Cat c2 = new Cat();
//		c2.name = "�ӳ���";
//		c2.breeds = "�ڼ�";
//		c2.weight = 10.5;
		
		System.out.println("println ���, �̸� = "+ c.name + ",ǰ�� = "+ c.breeds + ",ü�� = "+ c.weight);
		System.out.printf("printf ���, �̸� = %s, ǰ�� = %s , ü�� = %f \n", c.name, c.breeds, c.weight);
		
		System.out.printf("printf ���2, �̸� = %s, ǰ�� = %s , ü�� = %.2f\n ", c.name, c.breeds, c.weight);
		
//
//		System.out.println("c2.name = "+ c2.name);
//		System.out.println("c2.breeds = "+ c2.breeds);

	}

}
