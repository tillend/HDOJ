package AC_2050;

import java.util.Scanner;

public class Main_2055 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
        	String x = in.next();
        	char[] c = x.toCharArray();
            int y = in.nextInt();
            if(Character.isUpperCase(c[0])){
            	System.out.println(c[0]-64+y);
            }else{
            	System.out.println(96-c[0]+y);
            }
            
        }

	}

}
