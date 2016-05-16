package AC_2050;

import java.util.Scanner;

public class Main_2053 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			if(n % Math.sqrt(n) == 0){
				System.out.println(1);
			}else{
				System.out.println(0);
			}
		}
		

	}

}
