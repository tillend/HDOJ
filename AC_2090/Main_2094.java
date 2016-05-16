package AC_2090;

import java.util.Iterator;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main_2094 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
			Map<String,Integer> m = new HashMap<String,Integer>();
			String k;
			while(n-- > 0){
				k = in.next();   // §’ﬂ
				if(!m.containsKey(k)){
					m.put(k, 1);
				}
				k = in.next();   //∞‹’ﬂ
				m.put(k, -1);
			}
			int num = 0;
			//±È¿˙hashmap
			Iterator iter = m.entrySet().iterator();
			while (iter.hasNext()) {
			    Map.Entry entry = (Map.Entry) iter.next();
			    int val = (int) entry.getValue();
			    if(val == 1){
			    	num++;
			    }
			}
			if(num == 1){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}

	}

}
