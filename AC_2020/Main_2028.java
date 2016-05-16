package AC_2020;

/*最大公约数
最小公倍数
*/

import java.util.Scanner;

public class Main_2028 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
        	int n = in.nextInt();
        	long x = 1;
        	long k;
        	for(int i = 0; i < n; i++){
        		k = in.nextInt();
        		x = lcm(x,k);
        	}
        	System.out.println(x);
        }

	}
	
    public static long gcd(long x,long y){
    	if(x % y == 0) 
    		return y;
    	return gcd(y, x % y);
	}
	
	public static long lcm(long x,long y){
		return x * y / gcd(x,y);
	}

}
