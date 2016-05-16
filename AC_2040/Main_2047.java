package AC_2040;

import java.util.Scanner;

public class Main_2047 {

	public static long[] x = new long[40];
	
	public static void main(String[] args) {
		calc(x);
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			System.out.println(x[n]);
		}

	}

	private static void calc(long[] x) {
		x[1] = 3;
		x[2] = 8;
		for(int i = 3; i < 40; i++){
			x[i] = 2 * (x[i-1] + x[i-2]);
		}
		
	}

}
