package AC_2030;

import java.util.Scanner;

public class Main_2031 {

	static char[] c ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int r = in.nextInt();
			int a,b;
			int flag = 0;
			StringBuilder sb = new StringBuilder();
			if(n < 0){
				flag = 1;
				n = Math.abs(n);
			}
			while((n) != 0){
				b = n % r;
				sb.append(c[b]);
				n /= r;
			}
			if(flag == 1){
				System.out.println("-" + sb.reverse());
			}else{
				System.out.println(sb.reverse());
			}
			
		}

	}

}
