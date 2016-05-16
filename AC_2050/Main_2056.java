package AC_2050;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2056 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextDouble()){			
			double x[] = new double[4];
			double y[] = new double[4];

			for(int i = 0; i < 4; i++){
				x[i] = in.nextDouble();
				y[i] = in.nextDouble();
			}
			if ( Math.min(x[0],x[1]) >= Math.max(x[2],x[3]) || Math.min(x[2],x[3]) >= Math.max(x[1],x[0]) ){
				System.out.println("0.00");
			}
			else if ( Math.min(y[0],y[1]) >= Math.max(y[2],y[3]) || Math.min(y[2],y[3]) >= Math.max(y[1],y[0]) ){
				System.out.println("0.00");
			}
			else{
				Arrays.sort(x);
				Arrays.sort(y);
				System.out.printf("%.2f", (x[1]-x[2])*(y[1]-y[2]));
				System.out.println();
			}
			
				
		}
	}

}
