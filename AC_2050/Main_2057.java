package AC_2050;

import java.util.Scanner;

public class Main_2057 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String a = in.next();
			String b = in.next();
			long A = Long.valueOf(a,16);
			long B = Long.valueOf(b,16);
			long C = A + B;
			if(C >= 0){
				String c = Long.toHexString(C);  
				System.out.println(c.toUpperCase());
			}else{
				String c = Long.toHexString(-C);  
				System.out.println("-" + c.toUpperCase());
			}

		}

	}

}


//import java.util.*;
//public class Main
//{
//	public static void main(String _[])
//    {
//		Scanner s=new Scanner(System.in);
//		while(s.hasNext()){
//			long i=Long.parseLong(s.next().replaceAll("\\+",""),16)+Long.parseLong(s.next().replaceAll("\\+",""),16);
//			if(i<0)System.out.println("-"+Long.toHexString(-i).toUpperCase());
//			else System.out.println(Long.toHexString(i).toUpperCase());
//		}
//    }
//}
