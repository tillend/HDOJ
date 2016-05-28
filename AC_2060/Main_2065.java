package AC_2060;

import java.util.Scanner;

public class Main_2065 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		while(in.hasNextInt()){
			int t = in.nextInt();
			if(t == 0){
				break;
			}
			
			int count = 1;
			while(t-- > 0){
				long n = in.nextLong();
				System.out.println("Case " + count++ + ": " + 
				(PowMod(4, n-1) + PowMod(2, n-1)) % 100);   //泰勒级数
			}
			System.out.println();
		}
	}

	//快速幂的计算
	private static int PowMod(int a, long b) {
		int ret = 1;
	    while(b != 0){
	        if((b & 1) != 0){    //幂数的二进制，有1则计算快速幂值
	        	ret = (ret * a) % 100;  
	        }   
	        a = (a * a) % 100;  //a的次方幂 (a^2)^0 -> (a^2)^1 -> (a^2)^2
	        b >>= 1;
	    }
	    return ret;
	}

}
