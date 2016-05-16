package AC_2040;

import java.util.Scanner;

public class Main_2049 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b = in.nextInt();
		long[] a = new long[21];
		a[0] = 0;
		a[1] = 0;
		a[2] = 1;
		a[3] = 2;
		for(int i=4;i<21;i++)
			a[i]=(i-1)*(a[i-1]+a[i-2]);
		
		while(b-- > 0){
			int n = in.nextInt();
			int m = in.nextInt();
			
			long sum = C(n, n - m) * a[m];
			System.out.println(sum);
		}

	}
	
	public static int C(int n,int m){
		int p = 1, q = 1;
		
		if(m == 0)
			return 1;
		
		for(int i = 1; i <= m; i++){
			q *= i;
		}
		
		while(m-- > 0){
			p *= n;
			n--;
		}
		return (p / q);
	}
	

}
