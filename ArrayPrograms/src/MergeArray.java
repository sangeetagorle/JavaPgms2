

import java.util.Scanner;
public class MergeArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");

		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter the elements of first array");
		for(int i=0;i<=arr1.length-1;i++) {
			arr1[i]=scan.nextInt();
		}
		
		System.out.println("Enter the length of Array");
		int arr2[]=new int[scan.nextInt()];
		
		System.out.println("Enter the elements of second array");
		for(int i=0;i<=arr2.length-1;i++) {
			arr2[i]=scan.nextInt();
		}
		
		System.out.println("Elements of Array 1 are ");
		for(int x:arr1) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Elements of Array 2 are ");
		for(int x:arr2) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		Merge merge=new Merge();
		int res[]=merge.mergeArray(arr1,arr2);
		
		System.out.println("Merged Array ");
		for(int x:res) {
			System.out.print(x+" ");
		}
		
	System.out.println();
	}

}
