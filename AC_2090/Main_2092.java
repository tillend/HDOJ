package AC_2090;

import java.util.Scanner;

public class Main_2092 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int m = in.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			//(x+y)^2 - 4xy = (x-y)^2
			double k = (n + Math.sqrt(n*n - 4*m)) / 2;  //计算出x的值
			if(k == (int)k){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

		}
	}

}
