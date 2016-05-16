package AC_2080;

import java.util.Scanner;

public class Main_2084 {

	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     while(n-- > 0){
	    	 int m = in.nextInt();
	    	 int[][] a = new int[m][m];
	    	 int i,j;
	    	 for(i = 0; i < m; i++){
	    		 for(j = 0; j <= i; j++){
	    			 a[i][j] = in.nextInt();
	    		 }
	    	 }
	    	 
	    	 for(i = m-2; i >= 0; i--){
	    		 for(j = 0; j <= i; j++){
	    			 a[i][j] += Math.max(a[i+1][j],a[i+1][j+1]);
	    		 }
	    	 }	 
	    	 System.out.println(a[0][0]);
	     }	     
	}
}
