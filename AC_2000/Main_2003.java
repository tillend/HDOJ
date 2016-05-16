package AC_2000;

import java.util.Scanner;

public class Main_2003 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextDouble()){
			double n = in.nextDouble();
			System.out.printf("%.2f",Math.abs(n));
			System.out.println();
		}

	}

}
