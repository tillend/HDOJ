package AC_2080;

import java.util.Scanner;

public class Main_2082 {

	static int[] num = new int[27];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- > 0){
			long sum = 0;
			long[] dp = new long[51];
			dp[0] = 1;
			for(int i = 1; i <= 26; i++){
				num[i] = in.nextInt();
			}
			for(int i = 1; i <= 26; i++){
				for(int j = 50; j >= 1; j--){
					for(int k = 1; k <= num[i]; k++) {
						if(j- i*k >= 0){
							dp[j] += dp[j-i*k];
						}
	                }
					if(i == 26){
		            	sum += dp[j];
		            }
				}
			}
			System.out.println(sum);
			
		}

	}

}
