package AC_2040;

import java.util.Scanner;

public class Main_2044 {
	static long[] x = new long[51];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- != 0){
			int a = in.nextInt();
			int b = in.nextInt();
			
			x[1] = 1;
			x[2] = 2;
			for(int i = 3; i < 51; i++){
				x[i] = x[i-1] + x[i-2];
			}
			System.out.println(x[b-a]);
		}

	}

}
