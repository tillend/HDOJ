package AC_2050;

import java.util.Scanner;

public class Main_2052 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int m = in.nextInt();
			draw(n,m);
			System.out.println();
		}
	}

	private static void draw(int n, int m) {
		drawF(n);
		drawM(n,m);
		drawF(n);
	}
	
	private static void drawF(int n){
		System.out.print("+");
		for(int i = 0; i < n; i++){
			System.out.print("-");
		}
		System.out.println("+");
	}
	
    private static void drawM(int n,int m){
    	for(int i = 0; i < m; i++){
    		System.out.print("|");
    		for(int j = 0; j < n; j++){
        		System.out.print(" ");
        	}
    		System.out.println("|");
    	}
    	
    }

}
