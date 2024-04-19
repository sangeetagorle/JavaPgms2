import java.util.Scanner;
public class CopyArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[arr.length];
		
		System.out.println("enter the elements of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Original Array");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		System.out.println("Copied Array");{
			for(int i=0;i<=arr1.length-1;i++) {
				arr1[i]=arr[i];
				System.out.print(arr1[i]+" ");
			}
		}
		System.out.println();
	}
}