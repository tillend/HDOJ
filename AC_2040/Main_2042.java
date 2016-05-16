package AC_2040;

import java.util.Scanner;

public class Main_2042 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- > 0){
			int a = in.nextInt();
			int sum = 3;
			while(a-- > 0){
				sum = (sum-1) * 2;
			}
			System.out.println(sum);
		}

	}

}
