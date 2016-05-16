package AC_2020;
/**
 * ¾ø¶ÔÖµÅÅĞò
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main_2020 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
        	int n = in.nextInt();
        	if(n == 0){
        		break;
        	}
        	A[] x = new A[n];
			for(int i = 0; i < n; i++){
				x[i] = new A(in.nextInt());
			}	
        	Arrays.sort(x);
			for(int i = 0; i < n - 1; i++){
				System.out.print(x[i].a + " ");
			}	
			System.out.print(x[n - 1].a);
        	System.out.println();
        }
			
	}

}
class A implements Comparable<A>{

	int a;
	public A(int a){
		this.a = a;
	}
	@Override
	public int compareTo(A A) {
		return (Math.abs(a) < Math.abs(A.a))?1:-1;
	}
	
}

