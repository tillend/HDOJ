package AC_2010;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main_2010 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int a = in.nextInt();
			int b = in.nextInt();
			
			Set<Integer> s = new TreeSet<Integer>();
			int x,y,z,flag = 0;
			for(int i = a; i <= b; i++){
				x = i / 100;
				y = i / 10 - x * 10;
				z = i - y * 10 - x * 100;
				if(x * x * x + y * y * y + z * z * z == i){
					s.add(i);

				}
			}
			if(s.isEmpty()){
				System.out.println("no");
			}else{
				Iterator it=s.iterator();
			    while(it.hasNext())
			    {
			        Object o=it.next();
			        System.out.print(o);
			        if(it.hasNext()){
			        	System.out.print(" ");
			        }
			    }
			    System.out.println();

			}
		}

	}

}
