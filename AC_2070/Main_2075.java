package AC_2070;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main_2075 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			BigDecimal a = in.nextBigDecimal();
			BigDecimal b = in.nextBigDecimal();
			BigDecimal c = new BigDecimal(0);
			if(a.remainder(b).equals(c)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}

	}

}
