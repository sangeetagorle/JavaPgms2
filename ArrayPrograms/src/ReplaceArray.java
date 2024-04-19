import java.util.Scanner;

public class ReplaceArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n=scan.nextInt();
		int arr[]=new int[n];
		
	
		System.out.println("Enter the elements of first array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println("the Original Elements of array are ");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		Replace r=new Replace();
		int res[]=r.replace(arr);
		
		System.out.println("The Elements of array are ");
		for(int x:res) {
			System.out.print(x+" ");
		}

	}

}
