package AC_2060;
/**
 * @author LIn
 */
import java.util.Scanner;

public class Main_2061 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
	    while(n-- > 0){
	    	if(count != 0){
	    		System.out.println();
	    	}
	    	boolean flag = true;
	    	int k = in.nextInt();
	    	double sum = 0, csum = 0;
	    	Class[] c = new Class[k];
	    	
	    	for(int i = 0; i < k; i++){
	    		c[i] = new Class(in.next(), in.nextDouble(), in.nextDouble());
	    	}
	    	
	    	for(int i = 0; i < k; i++){
	    		if(c[i].score < 60){
	    			flag = false;
	    			break;
	    		}else{
	    			sum += c[i].score * c[i].credits;
		    		csum += c[i].credits;
	    		}
	    	}
	    	
	    	if(flag){
	    		System.out.printf("%.2f",sum / csum);
	    		System.out.println();
	    	}else{
	    		System.out.println("Sorry!");
	    	}
	    	count++;
	    }

	}

}

class Class{
	String name;
	double credits;
	double score;
	
	public Class(String name, double credits, double score){
		this.name = name;
		this.credits = credits;
		this.score = score;
	}
}