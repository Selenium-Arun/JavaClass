package demoJavaClass;

/*Two types of datapes  primitive and non primitive
 * primitive types are 
 * byte
 * short
 * int
 * long
 * float
 * double = 12;
 * Char ='A'
 * boolean = true or false 
 * 
 */
public class Session_Two {
   String my_var = "Java Test";
 public static void main(String[] args) {
	 //Syntax for instanciating the class or create object of the class
	 //Classname referecename = new clasname
	Session_Two obj = new Session_Two();
	 Session_Two obj1 = new Session_Two();
	 Session_Two obj2 = new Session_Two();
	 
	 
	 System.out.println("========================================");
	 System.out.println(obj.my_var);
	 System.out.println(obj1.my_var);
	 System.out.println(obj2.my_var);
	
	 obj2.my_var ="New Test";

	 System.out.println("========================================");
	 System.out.println(obj.my_var);
	 System.out.println(obj1.my_var);
	 System.out.println(obj2.my_var);
	 
	//primitive datatypes
	 
	 byte a = 127;
	 long b  = 1234343423424l;
	 float x = 10.05f;
	 double y  = 213623425356566756.77588d;
	 
	 float c = 10f/6f;
	 double d = 10d/6d;
	 
	/* System.out.println(c);
	 System.out.println(d);*/
	 
	 double i = 10d;
	 
	int ab = (int)i;
	  	 
	 System.out.println(i);
	 System.out.println(ab);
	
	 
	 
}
 
 public static void test1() {
	String my_var = "Test1";
	System.out.println(my_var);
 }
 
}
