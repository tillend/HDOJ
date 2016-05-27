package AC_2070;

import java.util.*;
/**
 * 
 * @author LIn
 * ´ò±í·¨
 */
public class Main_2073 {
	static double[][] a = new double[200][200];

	public static void main(String[] args) {
		table();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- > 0){
			int x1 = in.nextInt();
			int y1 = in.nextInt();
			int x2 = in.nextInt();
			int y2 = in.nextInt();
			
			System.out.printf("%.3f",Math.abs(a[x1][y1] - a[x2][y2]));
			System.out.println();
		}

	}
	
	private static void table(){
	    for (int i = 1; i< 200; i++)
	    {
	        a[0][i] = a[i-1][0]+ Math.sqrt(i * i + (i-1) * (i-1));
	        for (int j = 1; j <= i; j++){
	            a[j][i-j] = a[j-1][i-j+1] + Math.sqrt(2.0);
	        }
	    }
	}

}
