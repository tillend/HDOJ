package AC_2050;

import java.util.Scanner;

public class Main_2058 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int m = in.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int a,b;
			for(int i = (int)Math.sqrt(2 * m); i > 0; i--){
				a = m / i - (i - 1) / 2;
				b = a + i - 1;
				if((a + b) * i == 2 * m){    //若满足高斯求和结果，则[a,b]为所求的子序列之一
					System.out.println("[" + a + "," + b +"]");
				}
			}
			System.out.println();
		}
	}
}
