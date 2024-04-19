import java.util.*;
public class SeaarchApp1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		System.out.println("enter the elements of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Enter the Target element to search");
		int target=scan.nextInt();
		
		Search1 search=new Search1();
		boolean res=search.isPresent(arr,target);
		
		if(res==true) {
			System.out.println(res+ " key Found");
		}
		else {
			System.out.println(res+" key not found");
			
		}
		

	}

}
