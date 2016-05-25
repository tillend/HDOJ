package AC_2060;

import java.util.Scanner;

public class Main_2063 {
	static int[][] line;
	static int[] used;
	static int[] boy;
	static int k,m,n;
	
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     while(in.hasNextInt()){
	    	 /*读入数据*/
	    	 k = in.nextInt();
	    	 if(k == 0){
		    	 break;
		     }
		     m = in.nextInt();
		     n = in.nextInt();

		     line = new int[505][505];
		 	 used = new int[505];
		 	 boy = new int[505];
		 	 int a,b,sum = 0;

		     while(k-- > 0){
		    	 a = in.nextInt();
		    	 b = in.nextInt();
		    	 line[a][b] = 1;
		     }
		     
		     for (int i = 1; i <= m; i++){
		    	 //恢复每个男生单身的身份
		         for(int j = 1; j <= m; j++){
		        	 used[j] = 0;
		         }
	             if(find(i)){  //成功找到一个新的增广路径
	            	 sum++;
	             }	
	         }
		     
		     System.out.println(sum);
	     }

	}

	private static boolean find(int x) { 
		for (int j = 1; j <= n; j++){    //扫描每个男生
			if (line[x][j] == 1 && used[j] == 0){    //若女生x曾试图找男生j做搭档，这次就没机会了
				used[j] = 1;
				if (boy[j] == 0 || find(boy[j])){    //若此男生能还没搭档，或者能将之前的搭档安排给别人
					boy[j] = x;
					return true;
				}
			}
		}
		return false;
	}

}
