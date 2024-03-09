import java.util.*;

public class DiamondOfNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print left side of the diamond
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Print right side of the diamond
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i > 0; i--) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print left side of the diamond
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }
            // Print right side of the diamond
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
