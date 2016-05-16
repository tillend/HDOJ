package AC_2070;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class Main_2072 {

	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		HashSet<String> set = new HashSet<String>();
		while(!word.equals("#"))
		{
			word += ' ';
			set.clear();
			int flag = 0;
			int r = 0;
			for(int i = 0; i < word.length(); i++)
			{
				if(word.charAt(i) != ' '&& flag == 0)
				{
					flag = 1;
					r = i;
				}
				if(word.charAt(i) == ' '&& flag == 1)
				{
					set.add(word.substring(r, i));
					flag = 0;
				}
			}
			System.out.println(set.size());
			word = in.nextLine();
		}
	}
}