package AC_2010;

import java.util.Scanner;

public class Main_2018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n != 0) {
                int a[] = new int[56];
                a[1] = 1;
                a[2] = 2;
                a[3] = 3;
                a[4] = 4;
                for (int i = 5; i <= n; i++) {
                    a[i] = a[i - 1] + a[i - 3];
                }
                System.out.println(a[n]);
            }
        }
    }
}