import java.util.Scanner;
public class SumOfIndexArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n=scan.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[arr1.length];
	
		
		System.out.println("Enter the elements of first array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter the elements of second array");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		System.out.println();
		
		SumOfIndex sumIndex=new SumOfIndex();
		int arr3[]=sumIndex.findIndexSum(arr1,arr2);
	
		System.out.println("the sum of array 1 and 2 is ");
		for(int x:arr3) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}