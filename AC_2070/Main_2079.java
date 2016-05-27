package AC_2070;

import java.util.Scanner;
/**
 *  
 * @author LIn
 * 动态规划解完全背包问题
 */
public class Main_2079 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			int n = in.nextInt();
			int k = in.nextInt();
			
			int[] p = new int[n+1];
			int i,j,c;
			p[0] = 1;
			for(i = 1; i <= k; i++){
				int a = in.nextInt();
				int b = in.nextInt();
				for(j = n; j >= a; j--){
					for(c = 1; c <= b; c++){
						if(j - c*a >= 0){
							p[j] += p[j - c*a];
						}
					}
				}
			}
			System.out.println(p[n]);
		}

	}

}
