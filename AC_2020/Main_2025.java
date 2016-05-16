package AC_2020;

import java.util.Scanner;

public class Main_2025 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String a = in.nextLine();
			char[] s = a.toCharArray();
			char x = 'a';
			for(char c:s){
				if(c > x){
					x = c;
				}			
			}
			for(char c:s){
				if(c == x){
					System.out.print(c + "(max)");
				}else{
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}
