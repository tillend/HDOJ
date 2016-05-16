package AC_2070;

import java.util.Scanner;

public class Main_2074 {

	static char[][] cr = new char[80][80];
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(in.hasNext()){
        	if(sum != 0){
        		System.out.println();
        	}
        	char a,b;
        	int n = in.nextInt();
        	String s1 = in.next();
        	a = s1.charAt(0);
        	String s2 = in.next();
        	b = s2.charAt(0);
        	int i,j;
        	
        	if(n == 1){
        		System.out.println(a);
        	}
    		else
    		{  			
    			for(i = 0; i <= n/2; i++)
    				for(j = n/2-i; j <= n/2+i; j++){
    					cr[n/2-i][j] = cr[n/2+i][j] = cr[j][n/2+i] = cr[j][n/2-i]= (i%2 == 0)?a:b;
    				}	
    			cr[n-1][0] = cr[n-1][n-1]= cr[0][n-1]= cr[0][0]= ' ';
    			for(i=0; i < n; i++){
    				for(j = 0; j < n; j++){
    					System.out.print(cr[i][j]);
    				}
    				System.out.println();
    			}
    			
    		}
        	sum++;
        }

	}

}
