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
			int[] a = new int[n/2+1];
			int num = 0,k;
			boolean flag = false;
			for(int i = 0; i < n; i++){
				k = in.nextInt();
				for(int j = 0; j < num; j++){
					if(a[j] == k){
						a[j] = 0;
						flag = true;
						break;
					}
				}
				if(!flag){
					a[num++] = k;
				}
				
			}
			for(int i = 0; i < num; i++){
				if(a[i] != 0){
					System.out.println(a[i]);
					break;
				}
			}
		
		}

	}

}
