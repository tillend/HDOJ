package AC_2030;
/*汉字机内码在计算机的表达方式的描述是，使用二个字节，每个字节最高位一位为1。
 *计算机中， 补码第一位是符号位， 1表示为 负数， 所以 汉字机内码的每个字节表示的十进制数都是负数
*/
import java.util.Scanner;

public class Main_2030 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		while(n-- > 0){
			int count = 0;
			String s = in.nextLine();
			byte[] bytes = s.getBytes();
			for(byte b:bytes){
				if(b < 0){
					count++;
				}
			}
			System.out.println(count/2);
		}

	}

}
