package AC_2030;

import java.util.Scanner;

public class Main_2033 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- > 0){
			int a =in.nextInt();
			int b =in.nextInt();
			int c =in.nextInt();
			int d =in.nextInt();
			int e =in.nextInt();
			int f =in.nextInt();
			
						
			if((c + f) > 59){
				b += 1;
			}
			c = (c + f) % 60;
						
			if((b + e) > 59){			
				a += 1;
			}
			b = (b + e) % 60;
			a += d;
			System.out.println(a + " " + b + " " +c);
			
		}

	}

}
