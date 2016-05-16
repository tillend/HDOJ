package AC_2080;

import java.util.Scanner;

public class Main_2086 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		while(in.hasNextInt()){
			int n = in.nextInt();
			double a = in.nextDouble();
			double b = in.nextDouble();
			
			double a1 = 0;
			for(int i = n; i > 0; i--){
				a1 -= 2 * i * in.nextDouble();
			}
			a1 = (a1 + n * a + b) / (n + 1);
			System.out.printf("%.2f",a1);
			System.out.println();
		}

	}

}
