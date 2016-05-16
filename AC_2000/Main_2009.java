package AC_2000;

import java.util.Scanner;

public class Main_2009 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int m = in.nextInt();
			double sum = 0;
			double x = n;
			for(int i = 0; i < m; i++){
				sum += x;
				x = Math.sqrt(x);
			}
			System.out.printf("%.2f",sum);
			System.out.println();
		
		}

	}

}
