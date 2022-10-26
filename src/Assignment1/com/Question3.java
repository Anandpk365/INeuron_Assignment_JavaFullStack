package Assignment1.com;
import java.util.*;

public class Question3 {
	
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||j==0||j==n-1||j<n/2-i||j>=n/2-1+i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}
		input.close();
	}

}
