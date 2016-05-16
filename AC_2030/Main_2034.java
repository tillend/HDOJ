package AC_2030;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main_2034 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			int m = in.nextInt();
			if(n == 0 && m == 0){
				break;
			}
			int x;
			Set<Integer> s = new TreeSet<Integer>();
			for(int i = 0; i < n; i++){
				x = in.nextInt();
				s.add(x);
			}
			for(int i = 0; i < m; i++){
				x = in.nextInt();
				if(s.contains(x)){
					s.remove(x);
				}
			}
			if(s.isEmpty()){
				System.out.println("NULL");
				continue;
			}
			for(Integer i:s){
				System.out.printf("%d ", i);
			}
			System.out.println();
			
			s.clear();
		}

	}

}
