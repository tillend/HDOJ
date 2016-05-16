package AC_2010;

import java.util.Scanner;

public class Main_2015 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int m = in.nextInt();
			int i = 2;
			int x = m;
			int j,sum = 0;
			while(x-- > 1){
				i += (i + 2);
			}
			i /= m;
			for(j = 0; j < n /m ; j++){
				if(j != (n/m - 1)){
					System.out.print((i + 2*m*j) + " ");
				}else{
					System.out.print((i + 2*m*j));
				}
			}
			if(n % m != 0){
				for(int k = n; k >(n - n % m); k--){
					sum += 2 * k;
				}
				System.out.print(" " + sum / (n - j * m));
			}
			System.out.println();
		}

	}

}
