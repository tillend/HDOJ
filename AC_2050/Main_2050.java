package AC_2050;
/**折线分平面
根据直线分平面可知，由交点决定了射线和线段的条数，进而决定了新增的区域数。当n-1条折线时，区域数为f（n-1）。
为了使增加的区域最多，则折线的两边的线段要和n-1条折线的边，即2*（n-1）条线段相交。那么新增的线段数为4*（n-1），射线数为2。
但要注意的是，折线本身相邻的两线段只能增加一个区域。

 故：f(n)=f(n-1)+4(n-1)+2-1

                =f(n-1)+4(n-1)+1

               =f(n-2)+4(n-2)+4(n-1)+2

               ……

               =f(1)+4+4*2+……+4(n-1)+(n-1)   

               =2n^2-n+1
*/
import java.util.Scanner;

public class Main_2050 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();
		while(c-- > 0){
			int n = in.nextInt();
			System.out.println(2*n*n - n + 1);
		}

	}

}
