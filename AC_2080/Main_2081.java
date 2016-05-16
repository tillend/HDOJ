package AC_2080;

import java.util.Scanner;

public class Main_2081 {

	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     while(n-- > 0){
	    	 String s = in.next();
	    	 char[] c = s.toCharArray();
	    	 System.out.print("6");
	    	 for(int i = 6; i < 11; i++){
	    		 System.out.print(c[i]);
	    	 }
	    	 System.out.println();
	     
	     }
	}

}
