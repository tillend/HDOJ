package AC_2020;

import java.util.Scanner;

public class Main_2027 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	String a = in.nextLine();
    	while(n-- > 0){
    		String s = in.nextLine();
    		char[] chars = s.toCharArray();
    		int num1 = 0,num2 = 0,num3 = 0,num4 = 0,num5 = 0;
    		for(char c:chars){
    			if(c == 'a'){
    				num1++;
    				continue;
    			}else if(c == 'e'){
    				num2++;
    				continue;
    			}else if(c == 'i'){
    				num3++;
    				continue;
    			}else if(c == 'o'){
    				num4++;
    				continue;
    			}else if(c == 'u'){
    				num5++;
    			}
    		}
    		System.out.println("a:" + num1);
    		System.out.println("e:" + num2);
    		System.out.println("i:" + num3);
    		System.out.println("o:" + num4);
    		System.out.println("u:" + num5);
    		if(n != 0){
    			System.out.println();
    		}
    	}
	}

}
