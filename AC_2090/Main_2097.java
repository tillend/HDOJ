package AC_2090;

import java.util.Scanner;

public class Main_2097 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
			
			int x = swap(n,10);
			int y = swap(n,16);
			int z = swap(n,12);
			if(x == y && y == z){
				System.out.println(n + " is a Sky Number.");
			}else{
				System.out.println(n + " is not a Sky Number.");
			}
		}
	}
	
	//进制数转换
	public static int swap(int n,int r){
		int a[] = new int[10];
		int sum = 0,length = 0;
		while(n != 0){
		  a[length++] = n % r;
		  n /= r;
		}
		for(int i = 0; i < length; i++){
			sum += a[i];
		}
		return sum;
	}
	
}
