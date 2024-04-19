import java.util.*;
public class SearchingSortingApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("the Elements of array before sorting are:");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("1 : BUBBLE SORT");
		System.out.println("2 : SELECTION SORT");
		System.out.println("3 : INSERTION SORT");
		System.out.println("Enter Your choice");
		
		SearchingSorting searchingsorting=new SearchingSorting();
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:searchingsorting.bubbleSort(arr);
		       break;
		case 2:searchingsorting.selectionSort(arr);
	           break;
		case 3:searchingsorting.insertionSort(arr);
	           break;
	    default:searchingsorting.bubbleSort(arr);
	       
		}
		System.out.println("the Elements of array after sorting are:");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("Enter a key to search");
		int key=scan.nextInt();
		
		int res=searchingsorting.linearSearch(arr,key);
		if(res>0) {
			System.out.println("key Found ");
		}
		else {
			System.out.println("key not found");
		}
		int res1=searchingsorting.binarySearch(arr,key);
		if(res1>0) {
			System.out.println("key Found ");
		}
		else {
			System.out.println("key not found");
		}
	
		

	}

}
