package dayfive;

public class ForLoopItertion {
 public static void main(String[] args) {
	int arr[] = {123, 24, 234,354,567};
	
	for(int i = 0; i<=arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	for(int qwb: arr) {
		System.out.println(qwb);
	}
}
}
