package AC_2030;

import java.util.Scanner;

public class Main_2036 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int n = in.nextInt();
			if(n == 0){
				break;
			}
			double sum = 0;
			Point[] p = new Point[n+1];
			for(int i = 0; i < n; i++){
				p[i] = new Point(in.nextInt(),in.nextInt());
			}
			p[n] = p[0];  //要使第1个点与第n个点相连
			for(int i = 0; i < n; i++){
				sum += (p[i].x * p[i+1].y - p[i+1].x * p[i].y);
			}
			System.out.printf("%.1f",sum/2);
			System.out.println();
		}

	}
	private static class Point{
		int x;
		int y;
		public Point(int x,int y){
			this.x = x;
			this.y = y;
		}
	}

}
