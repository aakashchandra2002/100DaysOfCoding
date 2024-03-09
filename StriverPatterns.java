//to print pattern that filled with stars

import java.util.*;

public class StriverPatterns {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        sc.close();

    }
}
