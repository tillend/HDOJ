package AC_2070;
/**
 * @author LIn
 * ÏêÏ¸½âÎö£ºhttp://blog.csdn.net/why_still_confused/article/details/51193979
 */
import java.util.Scanner;

public class Main_2077 {

	static long[] a = new long[21];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		while(m-- > 0){
			int n = in.nextInt();
			a[0] = 0;
			for(int i = 1; i <= n; i++){
				a[i] = 3 * a[i-1] + 2;
			}
			System.out.println(a[n-1]+2);

		}

	}

}
