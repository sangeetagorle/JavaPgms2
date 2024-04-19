import java.util.*;
public class Matrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Matrix");
		int arr[][]=new int[scan.nextInt()][scan.nextInt()];
		int arr1[][]=new int[arr.length][arr.length];
		int sum[][]=new int[arr.length][arr.length];
		
		System.out.println("Enter the elements in 1 Matrix");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter the elements in 2 Matrix");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				arr1[i][j]=scan.nextInt();
			}
		}
		System.out.println("Matrixs contents 1 are");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrixs contents 2 are");
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("sum of elements in each row matrix");
		int i,j;
		for(i=0;i<=arr.length-1;i++) {
			for( j=0;j<=arr[i].length-1;j++) {
				sum[i][j]=arr[i][j]+arr1[i][j];
				}
		}
			for(i=0;i<=arr.length-1;i++) {
				for( j=0;j<=arr[i].length-1;j++) {
			System.out.print(sum[i][j]+" ");
	}
				System.out.println();
			}//System.out.println(sum[i][j]);
	}

}
