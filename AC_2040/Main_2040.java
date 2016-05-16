package AC_2040;

import java.util.Scanner;

public class Main_2040 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		while(m-- > 0){
			int a = in.nextInt();
			int b = in.nextInt();
			if(AffinityNum(a,b)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}

	}
	
	public static boolean AffinityNum(int a,int b){
		if((a == Divisors(b) && (b == Divisors(a)))){
			return true;
		}else{
			return false;
		}
	}
	
	public static int Divisors(int a){
		int sum = 0;
		for(int i = 1; i <= Math.sqrt(a); i++){
			if(a % i == 0){
				if(i != 1){
					sum = sum + i + (a/i);
				}else{
					sum += i;
				}
				
			}
		}
		return sum;
	}
}
