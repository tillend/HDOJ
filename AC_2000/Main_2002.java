package AC_2000;

import java.util.Scanner;

public class Main_2002 {

	static double PI = 3.1415927;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextDouble()){
			double r = in.nextDouble();
			
			double S = 4 * PI * r * r * r/ 3;
			System.out.printf("%.3f",S);
			System.out.println();
		}
		

	}

}
