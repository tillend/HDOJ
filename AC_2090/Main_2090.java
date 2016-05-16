package AC_2090;

import java.util.Scanner;

public class Main_2090 {

	static String[] str = new String[50000]; 
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sum = 0;
		int i = 0;
		while(in.hasNext()){
			str[i++] = in.next();
			double a = in.nextDouble();
			double b = in.nextDouble();

			sum += a * b;
		}
		System.out.printf("%.1f",sum);
		System.out.println();

	}

}
