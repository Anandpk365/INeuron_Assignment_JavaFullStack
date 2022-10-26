package Assignment1.com;
import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n=input.nextInt();
		
		for( int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
         input.close();
	}

}
