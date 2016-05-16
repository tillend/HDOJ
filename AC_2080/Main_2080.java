package AC_2080;

import java.util.Scanner;

public class Main_2080 {

	final static double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			
			double a,b,c;
			a = Math.sqrt(x1*x1 + y1*y1);
			b = Math.sqrt(x2*x2 + y2*y2);
			c = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
			double res = 180 / PI * Math.acos((c*c - b*b -a*a) / (-2*a*b));
			System.out.printf("%.2f",res);
			System.out.println();
		}

	}

}
