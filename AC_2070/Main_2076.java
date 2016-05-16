package AC_2070;

import java.util.Scanner;

public class Main_2076 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			double h = in.nextDouble();
			double m = in.nextDouble();
			double s = in.nextDouble();
			double dis = 0;
			
			if(h >= 12){
				h -= 12.0;
			}
			m = m + s/60.0;
			h = h + m/60.0;
			dis = Math.abs(h*30.0 - m*6.0);
			System.out.println((int)Math.min(dis, 360.00-dis));
		}

	}

}
