package AC_2040;

import java.util.Scanner;

public class Main_2048 {

	static long[] x = new long[21];
	
	public static void main(String[] args) {
		wrongsort(x);
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		while(c-- > 0){
			int n = in.nextInt();
			long a = 1;
			for(int i = 1; i <= n; i++){
				a *= i;
			}
			System.out.printf("%.2f%%",x[n] * 100.0 / a);
			System.out.println();
		}

	}
	
	private static void wrongsort(long[] x){
		x[1] = 0;
		x[2] = 1;
		for(int i = 3; i <= 20; i++){
			x[i] = (i-1) * (x[i-1] + x[i-2]);
		}
		
	}

}
