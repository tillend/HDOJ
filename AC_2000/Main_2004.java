package AC_2000;

import java.util.Scanner;

public class Main_2004 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n < 0 || n > 100){
				System.out.println("Score is error!");
				continue;
			}
			switch(n/10){
			case 9:case 10:System.out.println("A");break;
			case 8:System.out.println("B");break;
			case 7:System.out.println("C");break;
			case 6:System.out.println("D");break;
			default:System.out.println("E");break;
			}
		}

	}

}
