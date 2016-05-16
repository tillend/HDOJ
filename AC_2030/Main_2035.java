package AC_2030;

import java.util.Scanner;

public class Main_2035 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int a = in.nextInt();
			int b = in.nextInt();
			if(a == 0 || b == 0){
				break;
			}
			int sum = 1;
			while(b-- > 0){
				sum = (sum * a) % 1000;
			}
			System.out.println(sum);
		}

	}

}
