package AC_2090;
/**
 * @author LIn
 * ×¢£ºÎ´ÄÜAC,Time Limit Exceeded
 */
import java.util.Scanner;


public class Main_2095 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
			int sum = 0;
			while(n-- > 0){
				sum ^= in.nextInt();
			}
			System.out.println(sum);

		}

	}

}
