package AC_2000;

import java.util.Scanner;

public class Main_2006 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int x;
			int sum = 1;
			for(int i = 0; i < n; i++){
				x = in.nextInt();
				if((x % 2) != 0){
					sum *= x;
				}
			}
			
			System.out.println(sum);
		}
	}

}
