package AC_2020;

import java.util.Scanner;

public class Main_2022 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
        	int m = in.nextInt();
        	int n = in.nextInt();
        	int i,j;
        	int x,max = 0;
        	int xpos = 0,ypos = 0;
        	
        	for(i = 1; i <= m; i++){
        		for(j = 1; j <= n; j++){
        			x = in.nextInt();
        			if(Math.abs(x) > Math.abs(max)){
        				max = x;
        				xpos = i;
        				ypos = j;
        			}
        		}
        	}
        	System.out.println(xpos + " " + ypos + " " + max);
        }

	}

}
