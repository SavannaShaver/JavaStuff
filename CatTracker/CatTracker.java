
public class CatTracker {

	public static void main(String[] args) {
	 
	Cat cat01; //null
	cat01 = new Cat();
	
	Cat cat02 = new Cat("Mr.Flufferkins",10.0,4);
	System.out.println(cat01.getName()); 
	
	cat01.setName("Triscuit");
	System.out.println(cat01.getName());
	System.out.println(cat02.getName());
	
	System.out.println(cat01);
	System.out.println(cat02);
	
	System.out.println(cat01.equals(cat02));
	Cat cat03 = new Cat("Mr.Flufferkins",10.0,4);
	System.out.println(cat02.equals(cat03));
	System.out.println(cat02 == cat03);
	
	Cat cat04 = cat02;// doesnt create a new cate 
	cat04.setName("Taco");
	System.out.println(cat02.getName());

	}

}
