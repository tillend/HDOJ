package AC_2010;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2019 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int m = in.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int[] x = new int[n+1];
			for(int i = 0; i < n; i++){
				x[i] = in.nextInt();
			}
			x[n] = m;
			Arrays.sort(x);
			for(int i = 0; i < n; i++){
				System.out.print(x[i] +" ");
			}
			System.out.print(x[n]);
			System.out.println();
		}
	}
}
