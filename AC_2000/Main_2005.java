package AC_2000;

import java.util.Scanner;
public class Main_2005 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int month[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		while(cin.hasNext())
		{
			String s = cin.nextLine();
			String[] str = s.split("/"); //按/ 截取字符串
			int year = Integer.parseInt(str[0]);//强制转换为整数
			int mon = Integer.parseInt(str[1]);
			int day = Integer.parseInt(str[2]);
			int flag = 0;
			if(year % 4 == 0 && year % 100 !=0 || year % 400 ==0){
				flag = 1;
			}
			int ans = 0;
			for(int i = 0; i < mon - 1; i++){
				ans += month[i];
			}
			ans += day;
			if(flag == 1 && mon > 2){
				ans++;
			}
			System.out.println(ans);
		}
	}
}