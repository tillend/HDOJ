package AC_2060;
/**
 * @author LIn
 * 思路来自于：http://blog.csdn.net/lianqi15571/article/details/8877014
 * 注：未能AC,Time Limit Exceeded
 */
import java.util.Scanner;

public class Main_2062 {

    public static void main(String[] args) {
         int i,t;  //t：所求子集位于分组后的第几组
         long[] c = new long[22];  //后面将子集分组后平均每组个数，如:c[2]表示n=2时的分组每组中子集数
         int[] s = new int[22];  //后面将子集按字典序分组后每组的初始首元素,组数<=20

         c[1] = 1;
         for(i = 2; i < 22; i++){
             c[i] = c[i-1] * (i-1) + 1; //推导出来的c[n]=(n-1)*c[n-1]+1
         }
         
         Scanner in = new Scanner(System.in);
         while(in.hasNextInt()){
             int n = in.nextInt();
             long m = in.nextLong();  //位于第几个子集

             for(i = 0; i < 22; i++){
                 s[i] = i;    //每循环一次就重新归位每组首元素
             }
             while (n > 0 && m > 0){
                 t = (int) (m / c[n] + ((m % c[n] > 0)?1:0));
                 if(t > 0){   //得到第m个子集在分组后的第t组,若t>0
                     System.out.printf("%d",s[t]);
                     for(i = t; i <= n; i++){
                         s[i]=s[i+1];   //或s[i]+=1,我们发现:第n组中，第2个元素在第n个时变为它的下一个数
                     }
                     m -= ((t-1) * c[n] + 1);   //减去(t-1组总子集数+1）,m变为表示在剩余子集中位于第几个
//                     System.out.print(m==0?'\n':' ');
                     if(m == 0){
                    	 System.out.println();
                     }else{
                    	 System.out.print(" ");
                     }
                 }
                 n--; //依次递减,直到执行上面的if代码或退出
             }
         }
    }

}