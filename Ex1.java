import java.util.Scanner;

public class Ex1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(countNum(n));
        }
    }

    public static int countNum(int n) {
        String s = Integer.toString(n);
        return s.length();

    }

}
