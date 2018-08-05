package packagetwo;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString();
		reverseStringbyWord();
	}
	
	
	public static void reverseString() {
		String str = "You need to learn Java";
		char [] ch = str.toCharArray();
		String rev = "";
		
		for (int i = ch.length-1; i>=0;i--) {
			rev = rev+ch[i];
		}
		System.out.println(rev);
	}
	
 public static void reverseStringbyWord() {
	 String str = "You need to learn Java";
	 String [] revstr = str.split(" ");
	 for(int i=revstr.length-1;i>=0;i--) {
	System.out.print(revstr[i]+" ");
	 }
 }

}
