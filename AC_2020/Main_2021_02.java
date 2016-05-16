package AC_2020;

import java.util.Scanner;

public class Main_2021_02 {

	public static void main(String[] args) {
		int a[] = {0,1,1,2,2,1,2,2,3,3};
		int b[] = {0,1,2,3,4,1,2,3,4,5};
		
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
			int sum = 0;
			while(n-- > 0){
			    int x = in.nextInt();
			    sum += x / 100;
			    x %= 100;
			    sum += a[x % 10] + b[x / 10];
			}
			System.out.println(sum);
		}

	}

}
