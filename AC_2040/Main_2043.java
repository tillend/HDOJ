package AC_2040;
/**
 * @author LIn
 * 详细解析：http://blog.csdn.net/why_still_confused/article/details/51199772
 */
import java.util.Scanner;

public class Main_2043 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- != 0){
			String a = in.next();
			//密码长度大于等于8，且不要超过16
			if(a.length() <8 || a.length() > 16){
				System.out.println("NO");
				continue;
			}
			
			char[] x = a.toCharArray();
			int q = 0,w = 0,e = 0,r = 0;
			for(char c:x){
				if(Character.isLowerCase(c)){   //小写字母
					q = 1;
				}else if(Character.isDigit(c)){  //数字
					w = 1;
				}else if(Character.isUpperCase(c)){  //大写字母
					e = 1;
				}else{
					r = 1;
				}
			}
			int sum = q + w + e + r;
			if(sum >= 3){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}	
	}

}
