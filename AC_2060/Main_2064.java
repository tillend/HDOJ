package AC_2060;
/**
 * @author LIn
 * ÏêÏ¸½âÎö£ºhttp://blog.csdn.net/why_still_confused/article/details/51193979
 */
import java.util.Scanner;

public class Main_2064 {

	static long[] a = new long[36];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			a[0] = 0;
			for(int i = 1; i <= n; i++){
				a[i] = 3 * a[i-1] + 2;
			}
			System.out.println(a[n]);

		}

	}

}
