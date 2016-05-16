package AC_2030;

import java.util.Scanner;

public class Main_2039 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		while(m-- > 0){
			double a = in.nextDouble();
			double b = in.nextDouble();
			double c = in.nextDouble();
			
			if((a+b > c)&&(a+c > b)&&(c+b > a)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}	

	}

}
