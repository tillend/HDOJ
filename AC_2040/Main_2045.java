package AC_2040;

import java.util.Scanner;

public class Main_2045 {

	static long[] x = new long[55];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		cal(x);
		while(in.hasNextInt()){
			int n = in.nextInt();
			System.out.println(x[n-1]);
		}
	}
	
	private static void cal(long[] x){
		x[0] = 3;
		x[1] = 6;
		x[2] = 6;
		for(int i = 3; i < 50; i++){
			x[i] = x[i-1] + x[i-2] *2;
		}
	}

}
