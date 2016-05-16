package AC_2010;

import java.util.Scanner;

public class Main_2016 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int m = in.nextInt();
			if(m == 0){
				break;
			}
			int[] x = new int[m];
			int min = 999999;
			int p = 0,temp;
			for(int i = 0; i < m; i++){
				x[i] = in.nextInt();
				if(x[i] < min){
					min = x[i];
					p = i;
				}
			}
			temp = x[0];
			x[0] = x[p];
			x[p] = temp;
			for(int i = 0; i < m-1; i++){
			    System.out.print(x[i] + " ");
			}
			System.out.println(x[m - 1]);

		}

	}

}
