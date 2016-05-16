package AC_2010;

import java.util.Scanner;

public class Main_2017 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- != 0){
			String a = in.next();
			char[] x = a.toCharArray();
			int sum = 0;
			for(char c:x){
				if(Character.isDigit(c)){
					sum++;
				}
			}
			System.out.println(sum);
		}
	}

}
