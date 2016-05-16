package AC_2000;

import java.util.Scanner;

public class Main_2001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextDouble()){
			double x1 = scanner.nextDouble();
			double y1 = scanner.nextDouble();
			double x2 = scanner.nextDouble();
			double y2 = scanner.nextDouble();
			
			double d = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
			System.out.printf("%.2f",d);
			System.out.println();
		}

	}

}
