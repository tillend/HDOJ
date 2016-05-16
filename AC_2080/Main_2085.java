package AC_2080;

import java.util.Scanner;

public class Main_2085 {
	
	static long[] h = new long[34];
	static long[] l = new long[34];

	public static void main(String[] args) {
		 init();
	     Scanner in = new Scanner(System.in);
	     while(in.hasNextInt()){
	    	 int n = in.nextInt();
	    	 if(n == -1){
	    		 break;
	    	 }
	    	 System.out.println(h[n] + ", " + l[n]);
	     }

	}
	
	public static void init(){
		h[0] = 1;
		l[0] = 0;
		for(int i = 1; i < 34; i++){
			h[i] = 3 * h[i-1] + 2 * l[i-1];
			l[i] = h[i-1] + l[i-1];
		}
	}

}
