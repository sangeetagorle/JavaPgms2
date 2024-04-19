import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int[][] arr=new int[m][n];
		//int[][] arr2=new int[m][n];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		/*System.out.println("Enter the elements of array2");
		for(int i=0;i<=arr2.length-1;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				arr2[i][j]=scan.nextInt();
			}
		}*/
		System.out.println("the elements of array1 are");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		/*System.out.println("the elements of array2 are");
		for(int i=0;i<=arr2.length-1;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}*/
		System.out.println("The addition of upper triangle array are");
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				if(i==j||i-j==1||i-j==2) {
					System.out.println(sum+arr[i][j]);
				}
			}
			
		System.out.println();
		
		}
	}

}
