import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the contents of Array");
		for(int i=0;i<=arr.length-1;i++){
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the key to search in array");
		int key=scan.nextInt();
		
		for(int i=0;i<=arr.length-1;i++) {
			if(key==arr[i]) {
				System.out.println("key found at"+i);
				return;
			}
			
		}System.out.println("not found");

	}

}
