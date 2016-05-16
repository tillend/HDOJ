package AC_2000;

import java.util.Scanner;

public class Main_2008 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
			int a=0,b=0,c=0;
			double x;
			for(int i = 0; i < n; i++){
				x = in.nextDouble();
				if(x < 0){
					a++;
				}else if(x == 0){
					b++;
				}else{
					c++;
				}
			}
			System.out.println(a + " " + b + " " + c);
		}

	}

}
