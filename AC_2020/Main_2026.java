package AC_2020;

import java.util.Scanner;

public class Main_2026 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String a = in.nextLine();
			char[] s = a.toCharArray();
			int flag = 1;
			for(char c:s){
				if(flag == 1){
					c = (char)(c - 32);
					flag = 0;
				}else if(c == ' '){
					flag = 1;
				}
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
