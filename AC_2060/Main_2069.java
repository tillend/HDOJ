package AC_2060;

import java.util.Scanner;
/**
 * 
 * @author LIn
 * 完全背包问题
 */
public class Main_2069 {
	static int[] a = {50,25,10,5,1};
	static int[][] dp = new int[251][101];

	public static void main(String[] args) {
		dp();
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int sum = 0;
			int n = in.nextInt();
			for(int i = 0; i <= 100; i++){
				sum += dp[n][i];
			}
			System.out.println(sum);
		}

	}

	private static void dp() {
		int i,j,k;
		dp[0][0] = 1;
		for(i = 0; i < 5; i++){
			for(j = 0; j <= 250; j++){
				for(k = 0; k < 100; k++){
					if(j - a[i] >= 0){
						dp[j][k+1] += dp[j - a[i]][k];
					}
				}
			}
		}
		
	}

}
