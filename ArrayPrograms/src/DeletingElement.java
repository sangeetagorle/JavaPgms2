import java.util.Scanner;

public class DeletingElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		
		System.out.println("Enter the Elements into array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("The Array contents before deleting");
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("Enter the element to delete");
		int d=scan.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(d==arr[i]) {
				for(int j=i;j<arr.length-1;j++) {
					arr[j]=arr[j+1];
				}
				break;
			}
		}
		
		System.out.println("The Array contents after deleting");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();



	}

}
