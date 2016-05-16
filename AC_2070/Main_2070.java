package AC_2070;

import java.util.Scanner;

public class Main_2070 {
	static long[] f = new long[51];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fibbonacci();
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == -1){
				break;
			}
			System.out.println(f[n]);
		}

	}
	
	private static void Fibbonacci(){
		f[0] = 0;
		f[1] = 1;
		for(int i = 2; i < 51; i++){
			f[i] = f[i-1] + f[i-2];
		}
	}

}
