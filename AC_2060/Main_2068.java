package AC_2060;

import java.util.Scanner;

public class Main_2068 {
	static int[] a = new int[14];

	public static void main(String[] args) {
		wrongsort();
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
			
			long sum = 1;
			for(int i = 2; i <= n/2; i++){
				sum += C(n,i) * a[i];
			}
			
			System.out.println(sum);
		}

	}

	//×éºÏÊý
	private static double C(int n, int m) {
		double s = 1;
		for(int i = 0; i < m; i++){
			s = s * (n - i) / (i + 1);
		}
		return s;
	}

	//´íÅÅ
	private static void wrongsort() {
		a[0] = 0;
		a[1] = 0;
		a[2] = 1;
		for(int i = 3; i < 14; i++){
			a[i] = (i - 1) * (a[i-1] + a[i-2]);
		}
		
	}

}
