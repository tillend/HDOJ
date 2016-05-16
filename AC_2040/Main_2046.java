package AC_2040;

import java.util.Scanner;

public class Main_2046 {

	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     while(in.hasNextInt()){
		     int t = in.nextInt();
		     long[] x = new long[51];
		     x[0] = 1;
		     x[1] = 2;
		     x[2] = 3;
		     for(int i = 3; i <= 50; i++){
		    	 x[i] = x[i - 2] + x[i -1];
		     }
		     System.out.println(x[t - 1]);
	     }
	}

}
