import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the contents of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		PrintArray.printArray(arr);

	}

}
