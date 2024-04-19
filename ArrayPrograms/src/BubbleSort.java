import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter a elements of Array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("The Elements of array are");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		Sort sort=new Sort();
		sort.bubbleSort(arr);
		
		System.out.println("Array after sorting");
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}

}
