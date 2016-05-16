package AC_2070;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2078 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			int n = in.nextInt();
			int m = in.nextInt();
			int[] a = new int[n];
			int i,j = 0,k = m-1;
			int pre = 100;    //上一个难度值
			double max = 0;
			
			for(i = 0; i < n; i++){
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			for(i = 0; i < m; i++){
				if(i % 2 == 0){
					max = Math.max(max, Math.pow((pre - a[j]),2));
					pre = a[j++];
				}else{
					max = Math.max(max, Math.pow((pre - a[k]),2));
					pre = a[k--];
				}
			}
			System.out.println((int)max);
			
		}

	}

}
