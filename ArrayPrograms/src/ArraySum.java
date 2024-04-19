import java.util.*;
public class ArraySum{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array ");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("the elements of array are");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}
