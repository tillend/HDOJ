package AC_2090;

import java.util.Scanner;

public class Main_2091 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		while(in.hasNext()){
			String s = in.next();
			char a = s.charAt(0);
			if(a == '@'){
				break;
			}
			int n = in.nextInt();
			char[][] c = new char[n][2*n-1];
			if(sum != 0){
				System.out.println();
			}
			build(c,n,a);
			print(c,n);
			sum++;
		}

	}

	private static void build(char[][] c, int n, char a) {
		int i,j;
		for(i = 0; i < n; i++){
			for(j = 0; j < 2*n-1; j++){
				c[i][j] = ' ';
			}
		}
		
		for(i = n-1; i >= 0; i--){
			c[i][i+n-1] = c[i][n-i-1] = a;
		}
		for(i = 0; i < 2*n-1; i++){
			c[n-1][i] = a;
		}
		
	}
	
	private static void print(char[][] c, int n) {
		int i,j;
		for(i = 0; i < n; i++){
			for(j = 0; j < n+i; j++){
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
	}


}
