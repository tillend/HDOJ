package AC_2070;

import java.util.Scanner;

public class Main_2071 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			int n = in.nextInt();
			double max = 0;
			for(int i = 0; i < n; i++){
				double a = in.nextDouble();
				if(a > max){
					max = a;
				}
			}
			System.out.printf("%.2f",max);
			System.out.println();
		}

	}

}
