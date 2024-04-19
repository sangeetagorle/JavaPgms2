import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of X");
		int x=scan.nextInt();
		System.out.println("Enter the value of Y");
		int y=scan.nextInt();
		
		System.out.println("The of X before swapping is: "+x);
		System.out.println("The of Y before swapping is:"+y);
		
		int help;
		help=x;
		x=y;
		y=help;
		
		System.out.println("The value of X after Swapping: "+x);
		System.out.println("The value of Y after Swapping: "+y);
	}

}
