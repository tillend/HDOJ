package AC_2090;
/**
 * @author LIn
 */
import java.util.Scanner;

public class Main_2099 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int a = in.nextInt();
			int b = in.nextInt();
			
			if(a == 0 && b == 0){
				break;
			}
			
			int c = a * 100 % b;   //余数
			boolean flag = false;  //不是第一个数就输出空格
			for(int i = 0; i*b-c < 100; i++){
				if(0 <= i*b-c){
					if(flag){
						System.out.print(" ");
					}
					System.out.printf("%02d",i*b-c);
					flag = true;
				}
			}
			System.out.println();
		}

	}

}
