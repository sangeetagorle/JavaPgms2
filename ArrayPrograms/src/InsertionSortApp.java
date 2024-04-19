import java.util.Scanner;

public class InsertionSortApp {

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
		
		InsertionSort sort=new InsertionSort();
		sort.insertionSort(arr);
		
		System.out.println("array Elements after sorting are: ");
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}

}
