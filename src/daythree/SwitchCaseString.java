package daythree;

public class SwitchCaseString {

	public static void main(String[] args) {
		
		String  nameofStudent = "gaYatHri";
		
		switch(nameofStudent.toLowerCase()) {
		
		case "amit":
			System.out.println("Class will be on Weekend");
			break;
		case "payal":
			
			System.out.println("Classroom Training");
			break;
			
		case "gayathri":
			System.out.println("Morning session");
			break;
		default:
			System.out.println("Default will be a classroom session");
			break;
		}

	}

}
