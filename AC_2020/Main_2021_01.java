package AC_2020;

import java.util.Scanner;

public class Main_2021_01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
			int sum = 0;
			while(n-- > 0){
			    int a = in.nextInt();
			    sum += a / 100;
		    	a %= 100;
		    	sum += a / 50;
		    	a %= 50;
		    	sum += a / 10;
		    	a %= 10;
		    	sum += a / 5;
		    	a %= 5;
		    	sum += a / 2;
		    	sum += a % 2;
			}
			System.out.println(sum);
		}

	}

}
