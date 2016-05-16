package AC_2010;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2014 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int[] s = new int[n];
			int sum = 0;
			for(int i = 0; i < n; i++){
				int a = in.nextInt();
				s[i] = a;
			}
			Arrays.sort(s);
			for(int i = 1; i < n-1; i++){
				sum += s[i];
			}
			double avg = sum * 1.0 / (n-2);
			System.out.printf("%.2f",avg);
			System.out.println();
		}

	}

}
