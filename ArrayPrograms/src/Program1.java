import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter the Elements of Array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Elements of array are");
		//Enhanced for loop
		for(int a : arr) {
			//Add five to array contents
			System.out.print((a+5)+" ");
		}

	}

}
