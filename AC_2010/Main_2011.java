package AC_2010;

import java.util.Scanner;

public class Main_2011 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		while(m-- > 0){
			int n = in.nextInt();
			double sum = 0;
			for(int i = 1; i <= n; i++){
				if(i%2 == 0){
					sum += -1.0/i;
				}else{
					sum += 1.0/i;
				}
			}
			System.out.printf("%.2f",sum);
			System.out.println();
		}
	}

}
