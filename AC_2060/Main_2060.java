package AC_2060;

import java.util.Scanner;

public class Main_2060 {
    static int[] s = {7,6,5,4,3,2};
	
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     while(n-- > 0){
	    	 int left = in.nextInt();
	    	 int p = in.nextInt();
	    	 int o = in.nextInt();
	    	 int score = 0;
	    	 if(left < 7){   //剩下的只有color ball
	    		 for(int i = 0; i < left; i++){
	    			 score += s[i];
	    		 }
	    	 }else{
	    		 score = (left - 6) * 8 + 27;
	    	 }
	    	 
	    	 if(p + score < o){
	    		 System.out.println("No"); 
	    	 }else{
	    		 System.out.println("Yes"); 
	    	 }
	    	 
	     }

	}

}
