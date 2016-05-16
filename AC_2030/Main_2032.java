package AC_2030;

import java.util.Scanner;

public class Main_2032 {

	static int[][] x = new int[30][30];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		tricangle(x);
		while(in.hasNextInt()){
			int n = in.nextInt();
			print(x,n);
		}

	}

	private static void print(int[][] x2, int n) {
		for(int i = 0; i < n; i++){
			for(int j = 0; j < i; j++){
				System.out.printf("%d ",x[i][j]);
			}
			System.out.println(x[i][i]);
		}
		System.out.println();
	}

	private static void tricangle(int[][] x) {
		for(int i = 0; i < 30; i++){
			x[i][0] = 1;
			x[i][i] = 1;
		}
		for(int i = 2; i < 30; i++){
			for(int j = 1; j < i; j++){
				x[i][j] = x[i-1][j] + x[i-1][j-1];
			}
		}
		
	}

}
