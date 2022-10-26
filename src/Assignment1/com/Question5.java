package Assignment1.com;
import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n=input.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i==n-1||i>0&&i<n/2&&j<=n/2-i||i>=n/2&&j<=i-n/2)
					System.out.print("*");
				else
					System.out.print(" ");

				
			}
			System.out.println();
		}
		input.close();

	}

}
