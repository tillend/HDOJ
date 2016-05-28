package AC_2030;
/**
 * @author LIn
 * 详细解析：http://blog.csdn.net/why_still_confused/article/details/51199493
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main_2037 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
			//电视节目总数
			TV[] tvs = new TV[n];
			for(int i = 0; i < n; i++){				
				tvs[i] = new TV(in.nextInt(),in.nextInt());
			}
			//按结束时间升序排序
			Arrays.sort(tvs);
			int k = 0;
			int sum = 0;
			for(int i = 0; i < n; i++){
				if(tvs[i].s >= k){
					sum++;
					k = tvs[i].e;
				}
			}
			System.out.println(sum);
		}
	}
}
//电视节目类
class TV implements Comparable<TV>{
	int s;  //开始时间
	int e;  //结束时间
	public TV(int s,int e){
		this.s = s;
		this.e = e;
	}
	//重写比较方法
	@Override  
    public int compareTo(TV tv) {  
        return (e > tv.e)? 1:-1;  
	}
	
}
