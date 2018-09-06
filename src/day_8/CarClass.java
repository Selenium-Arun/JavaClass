package day_8;

public class CarClass {
	
	int  wheels;
	int modelno;
	String carname;
	
	public static void main(String[] args) {
		
		CarClass car = new CarClass();
		CarClass car1 = new CarClass();
		CarClass car2 = new CarClass();
		
		
		
		
		
	car.modelno = 2018;
	car.carname="Tesla";
	
	car1.modelno = 2017;
	car1.carname="tata";
	
	
	System.out.println(car.modelno);
	System.out.println(car.carname);
	car.acceleration();
	System.out.println(car1.modelno);
	System.out.println(car1.carname);
	car1.acceleration();
		
		
	
	}

	
	

	public String acceleration() {
		//System.out.println("Car can reah upto 100KM /hr in 6 sec");
		return "Acceleration";
	}
	
	
	public void braking() {
		
		System.out.println("car will stop in 2 mts in emegency");
	}
	
	
	
	
}
