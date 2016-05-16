package AC_2050;

import java.util.Scanner;

public class Main_2051 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			Binary(n);
			System.out.println();
		
		}
	}
	
	public static void Binary(int b){
		if(b != 1){
			Binary(b / 2);
		}
		System.out.print(b % 2);

	}
}
