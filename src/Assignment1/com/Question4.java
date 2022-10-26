package Assignment1.com;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		n=input.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<n/2||i>=n/2&&j>i-n/2&&j<n-1-(i-n/2))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		input.close();

	}

}
