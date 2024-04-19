import java.util.*;
public class BinarySearchApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter a key to find in array");
		int key=scan.nextInt();
		
		BinarySearch bs=new BinarySearch();
		int res=bs.binarySearch(arr,key);
		
		if(res==1) {
			System.out.println("key Found at index ");
		}
		else {
			System.out.println("Key not found");
		}
	}

}
