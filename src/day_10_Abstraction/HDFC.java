package day_10_Abstraction;

public class HDFC extends RBI{
/*
Abstraction can be achieved by Abstract class and interface
Abstract Class 0-100 %
Interface 100%
Abstract class can have abstract and concrete method both.
if a class has a abstract method it must be a abstract class. 
If a class extends an abstract class, it is mandatory for child class to implement all
the abstract method of parent class but it is not necessary to implement the concrete 
method
If an Abstract class extends another abstract class, it is not mandatory to implement 
the unimplemented method of parent class.

*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	int ROI() {
		return 9;
	}
	
	
	@Override
	public String checktracker(int checknum) {
		
		return "location";
	}

	@Override
	void openaccountbyTAb() {
	
		
	}

}
