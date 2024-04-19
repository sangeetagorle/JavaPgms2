import java.util.*;
public class Program3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of Array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the contents of Array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
			
			System.out.println("The Array contents before Swapping");
			for(int s:arr) {
				System.out.print(s+" ");
		}
			System.out.println();
			
			
		System.out.println("enter the index of array to Swap");
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println("The Array contents After Swapping");
		int help;
		help=arr[x];
		arr[x]=arr[y];
		arr[y]=help;
		for(int s:arr) {
			System.out.print(s+" ");
		}
	}
	}


