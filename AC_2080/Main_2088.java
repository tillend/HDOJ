package AC_2080;

import java.util.Scanner;

public class Main_2088 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;
	    while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
	    	if(count != 0){
	    		System.out.println();
	    	}
	    	
	    	int[] a = new int[n];
	    	int sum = 0, move = 0;
	    	
	    	for(int i = 0; i < n; i++){
	    		a[i] = in.nextInt();
	    		sum += a[i];
	    	}
	    	sum /= n;
	    	for(int i = 0; i < n; i++){
	    		if(a[i] > sum){
	    			move += (a[i] - sum);
	    		}
	    	}
	    	
	    	count++;
	    	System.out.println(move);
	    }

	}

}
