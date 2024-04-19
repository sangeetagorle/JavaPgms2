import java.util.Scanner;
public class SumofArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
			sum=sum+arr[i];
		System.out.println("sum of array elements is "+sum);
		
	}
	}