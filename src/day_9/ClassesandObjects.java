package day_9;


public class ClassesandObjects extends ConstructorDemo  {
	
	ClassesandObjects(){
		super("Gayathri ", "6AM ", "Selenium");
	}
	
	public static void main(String[] args) {
	//ClassesandObjects obj = new ClassesandObjects();
		
		ClassesandObjects obj = new ClassesandObjects();
		
		
     
	}
	
	public static void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
		
	}
	
	public static void add(int a, int b, int c) {
	
		int d = a+b+c;
		System.out.println(d);
	}
}




class Test {

	public  void sub(int a, int b) {
		int c = a-b;
		System.out.println(c);
	}
}