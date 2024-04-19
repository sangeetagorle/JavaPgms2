import java.util.Scanner;
public class SearchApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the contents of Array");
		for(int i=0;i<=arr.length-1;i++){
			arr[i]=scan.nextInt();
		}
			
		System.out.println("Enter the key element to Search in Array");
		int key=scan.nextInt();
		
		Search search=new Search();
		int res=search.linearSearch(arr,key);
		
		if(res>0) {
			System.out.println("Key found at index"+res);
		}
		else {
			System.out.println("Element not Found");
		}
		
			}
	
}