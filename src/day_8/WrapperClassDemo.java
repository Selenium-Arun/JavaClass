package day_8;


public class WrapperClassDemo {

	public static void main(String[] args) {
		
    String val = "100";
    
    int price = 12;
    
    
    System.out.println(price);
    
    System.out.println(val);
    
    System.out.println(val+price);
    
    int i = Integer.parseInt(val);
    
    System.out.println(i+price);
    
    String s = String.valueOf(i);
    
    System.out.println(s.length());

	}

}
