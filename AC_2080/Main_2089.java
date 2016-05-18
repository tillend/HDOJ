package AC_2080;
/**
 * 排除有"4"和"62"子串的数字串
 */
import java.util.Scanner;

public class Main_2089 {

	static int[] s = new int[1000000];
	
	public static void main(String[] args) {
		 init();
	     Scanner in = new Scanner(System.in);
	     while(in.hasNextInt()){
	    	 int n = in.nextInt();
	    	 int m = in.nextInt();
	    	 if(n == 0 && m == 0){
	    		 break;
	    	 }
	    	 int sum = 0;
	    	 for(int i = n; i <= m; i++){
	    		 sum += s[i];
	    	 }
	    	 System.out.println(sum);

	     }
	    	 
	}

	private static void init() {
		String a = "4";
		String b = "62";
		for(Integer i = 0; i < 1000000; i++){
			if(i.toString().contains(a) || i.toString().contains(b)){
				s[i] = 0;
			}else{
				s[i] = 1;
			}
		
	    }
	}

}
