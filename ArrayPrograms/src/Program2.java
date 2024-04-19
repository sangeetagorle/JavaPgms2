import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n=scan.nextInt();
		int []arr=new int[n];
		
		System.out.println("Enter the elements of Array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("the positive elements of Array are");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>=1) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}

}
