package AC_2020;

import java.util.Scanner;

public class Main_2029 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        while(n-- > 0){
        	String a = in.next();
        	StringBuilder sb = new StringBuilder(a);
        	if(sb.reverse().toString().equals(a)){
        		System.out.println("yes");
        	}else{
        		System.out.println("no");
        	}
        	
        }

	}

}
