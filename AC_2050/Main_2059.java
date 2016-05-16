package AC_2050;

import java.util.Scanner;

public class Main_2059 {
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     while(in.hasNextInt()){
	    	 double L = in.nextInt();
	    	 int n = in.nextInt();   //充电站个数
	    	 double c = in.nextInt();   //满电能走距离
	    	 double t = in.nextDouble();   //充电时间
	    	 double vr = in.nextInt();   //兔子速度
	    	 double vt1 = in.nextInt();   //乌龟电动车速度
	    	 double vt2 = in.nextInt();   //乌龟走路速度
	    	 double s[] = new double[n + 2];  //充电站到起点距离
	    	 double dp[] = new double[n + 2];  //dp[i]表示到第i个加电站的最小耗费时间
	    	 double time = 0,len; //乌龟总时间
	    	 int i,j;
	    	 s[0] = 0;
	    	 s[n+1] = L;
	    	 dp[0] = 0;
	    	 for(i = 1; i <= n; i++){
	    		 s[i] = in.nextInt();
	    	 }

	    	 for(i = 1; i <= n+1; i++){
	             dp[i] = Integer.MAX_VALUE;
	             for(j = 0; j < i; j++){
	            	 len = s[i] - s[j];
	            	 //如果该距离大于电动车能行驶的最大距离,否则全程电动车
	                 if(len > c){	
	                	 time = c / vt1 + (len - c) / vt2;//把电动车行驶的时间加上乌龟用脚踏的时间
	                 }
	                 else{
	                	 time = len / vt1;
	                 }           
	                 time += dp[j];//之后加上到第j个加电站的最优时间
	                 if(j > 0){  //非起点,加上充电时间
	                     time += t;
	                 }
	                 dp[i] = Math.min(dp[i],time);//每次挑出到第i个加电站的最优时间
	             }
	    	 }

	    	 double t2 = (L / vr);
	    	 if(dp[n+1] < t2){
	    		 System.out.println("What a pity rabbit!");
	    	 }else{
	    		 System.out.println("Good job,rabbit!");
	    	 }
	     }
	}

}
