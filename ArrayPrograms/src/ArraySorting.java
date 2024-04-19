import java.util.Scanner;

public class ArraySorting {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the elements of Array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("The Elements of Array are: ");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int temp=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}		
				}
		}
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
			
