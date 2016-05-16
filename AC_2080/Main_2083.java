package AC_2080;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2083 {

	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     while(n-- > 0){
	    	 int m = in.nextInt();
	    	 int[] a = new int[m];
	    	 for(int i = 0; i < m; i++){
	    		 a[i] = in.nextInt();
	    	 }
	    	 Arrays.sort(a);
	    	 
	    	 int k = m/2;
	    	 int sum = 0;
	    	 for(int i = 0; i < m; i++){
	    		 sum += Math.abs(a[i] - a[k]);
	    	 }
	    	 System.out.println(sum);
	     }

	}

}
