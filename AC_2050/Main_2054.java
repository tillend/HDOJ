package AC_2050;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main_2054 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			BigDecimal a = in.nextBigDecimal();
            BigDecimal b = in.nextBigDecimal();
			if(a.compareTo(b) == 0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}

	}

}
