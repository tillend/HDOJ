package AC_2080;

import java.util.Scanner;

public class Main_2082 {

	static int[] num = new int[26];
	static long[] dp = new long[51];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long sum = 0;
		dp[0]=1;
		while(n-- > 0){
			for(int i = 0; i < 26; i++){
				num[i] = in.nextInt();
			}
			for(int i = 0; i < 26; i++){
				for(int j = 50; j > 0; j--){
					for(int k = 1; k <= num[i]; k++) {
						if(j-(i+1)*k >= 0){
							dp[j] += dp[j-(i+1)*k];
						}
	                }
					if(i == 25){
		            	sum += dp[j];
		            }
				}
			}
			System.out.println(sum);
			
		}

	}

}
