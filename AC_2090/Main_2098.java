package AC_2090;
/**
 * @author LIn
 */
import java.util.Scanner;

public class Main_2098 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();	
			if(n == 0){
				break;
			}
			int num = 0;
			for(int i = 2; i < n/2; i++){
				if(judge(i) == 1 || judge(n - i) == 1){
					continue;
				}else{
					num++;
				}	
			}	
			System.out.println(num);
		}
	}
	
	public static int judge(int n){
		 int i;
		 int flag = 0;
		 for (i = 2; i <= Math.sqrt(n); i++) {
		    if (n % i == 0) {
		       flag = 1;
		       break;
		    }
		}
		return flag;
	}
}
