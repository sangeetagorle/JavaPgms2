import java.util.*;
public class HeightArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of teams");
		int n=scan.nextInt();
		float [][]arr=new float[n][];
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the number of players in each team"+i);
			int m=scan.nextInt();
			arr[i]=new  float[m];
		}
		
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the height of players "+j+" in team "+i );
				arr[i][j]=scan.nextFloat();
					
			}
		}
		System.out.println("The heights of Players are");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
