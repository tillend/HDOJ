package AC_2010;

import java.util.Scanner;

public class Main_2012 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int x = in.nextInt();
			int y = in.nextInt();
			if(x == 0 && y ==0){
				break;
			}
			boolean flag = true;
			for(int i = x; i <= y; i++){
				if(!is_prime(f(i))){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("OK");
			}else{
				System.out.println("Sorry");
			}
			
			
		}
		

	}
	
	public static int f(int x){
		return x*x + x + 41;
	}
	
	public static boolean is_prime(int x){
		for(int i = 2; i <= Math.sqrt(x); i++){
			if(x % i == 0){
				return false;
			}
		}
		return true;
	}

}
