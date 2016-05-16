package AC_2040;

import java.util.*;

public class Main_2041 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int c = sc.nextInt();
            for (int j = 1; j <= c; j++) {
                int n = sc.nextInt();
                int a[] = new int[n];
                a[0] = 1;
                a[1] = 1;
                for (int i = 2; i < a.length; i++) {
                    a[i] = a[i - 1] + a[i - 2];

                }
                System.out.println(a[n - 1]);
            }

        }
    }
}