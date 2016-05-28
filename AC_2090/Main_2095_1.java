package AC_2090;

import java.util.Scanner;

public class Main_2095_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
			
			int appearOne = 0;
			int[] bitCount = new int[32];
			while(n-- > 0){
				int a = in.nextInt();
				for(int i = 0; i < 32; i++){
					bitCount[i] += ((a >> i) & 1);
				}
			}
			for(int i = 0; i < 32; i++){
				if(bitCount[i] % 2 != 0){
					appearOne += (1 << i);
				}
			}
			System.out.println(appearOne);

		}

	}


}
