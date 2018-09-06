package dayseven;

public class StringDemo {
/*
* String Litrals
* By using new keyword
* 
* /*String reverse "I am taking Java Classes"
	 * sessalC
	 * Classes Java taking am I
	 * I Am Taking Java Classes
	 * 
	 * 
	 * */


	public static void main(String[] args) {
		
		String str1 = "Welcome to Class";
		String str2 = "Welcome to Class";
		
		String str3 = new String("Welcome to class");
		String str4 = new String("Welcome to class");
		
		//== operator always compares the address where string is used
		//equal
	//	System.out.println(str1 == str2);
		//System.out.println(str3==str4);
	//	System.out.println(str3.equals(str4));
		
		str1.concat(" This is a java");
		System.out.println(str1);
		
		
		StringBuffer sb = new StringBuffer("This is ");
		  sb.append(" Java class" );
		
		System.out.println(sb);
		
		String name = "Java";
		
		 name= name.concat(" classes                  ");
		 
		 System.out.println(name);
		 System.out.println(name.length());
		 System.out.println(name.charAt(5));
		 System.out.println(name.trim());
		System.out.println(name.isEmpty());

	}

}
