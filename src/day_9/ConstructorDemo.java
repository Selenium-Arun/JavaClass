package day_9;

public class ConstructorDemo {
 public String std_name ;
 public String batchtime;
  public String coursename;
  
  ConstructorDemo(){
	
	  System.out.println("Inside constructorDemo");
	  batchtime = "9AM";
	  coursename = "Java";
	  System.out.println(batchtime + coursename);
	  
  }
  
  
	
    ConstructorDemo(String std_name, String batchtime, String coursename) {
        
    	
	    this.std_name = std_name;
		this.batchtime = batchtime;
		this.coursename = coursename;
		
		System.out.println(this.std_name + this.batchtime + this.coursename);
}



public static void main(String[] args) {
    ConstructorDemo obj1 = new ConstructorDemo();
  
	
}

}
