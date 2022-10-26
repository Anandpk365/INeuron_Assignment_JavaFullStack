package Assignment1.com;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i=0;i<n;i++) {
			
			//Alphabate 'I'
			for(int j=0;j<n/2;j++) {
				System.out.print("*");
			}
			System.out.print("  ");
			
			//Alphabate 'N'
			
			for(int j=0;j<n;j++) {
				if(j==0 || j==i || j==n-1)
					System.out.print("*");
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//Alphabate 'E'
			for(int j=0;j<n;j++) {
				if(i==0||j==0||i==n-1||i==n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			//Alphabate 'U'
			for(int j=0;j<n;j++) {
				if(j==0&&i<n-1||i==n-1&&j>=1&&j<n-2||j==n-1&&i<n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.print("  ");
			
			//Alphabate 'R'
			for(int j=0;j<n;j++) {
				if(j==0||i==0&&j<n-1||j>=n/2&&j==i||i==n/2&&j<n-1||j==n-1&&i>0&&i<n/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			//Alphabate 'O'
			for(int j=0;j<n;j++) {
				if(j==0&&i>0&&i<n-1||j==n-1&&i>0&&i<n-1||i==0&&j>0&&j<n-1||i==n-1&&j>0&&j<n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			
			//Alphabate 'N'
			for(int j=0;j<n;j++) {
				if(j==0||j==i||j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("  ");
			System.out.println();
		}
		
		input.close();

	}

}
