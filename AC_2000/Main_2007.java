package AC_2000;

import java.util.Scanner;

public class Main_2007 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int a = in.nextInt();
			int b = in.nextInt();
			if(a > b){
				int temp = b;
				b = a;
				a = temp;
			}
			long c = 0,d = 0;
			for(int i = a; i <= b; i++){
				if(i % 2 == 0){
					c += i * i;
				}else{
					d += i * i * i;
				}
			}
			System.out.println(c +" "+ d);
		}
	}
	
}
