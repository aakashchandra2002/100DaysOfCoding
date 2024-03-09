public class Ex2 {
    public static void main(String args[]) {
        int m = 5;
        int n = 3;
        int a = 6;
        int b = 2;
        boolean result = Aakash(m, n, a, b);
        System.out.println(result);
    }

    public static boolean Aakash(int m, int n, int a, int b) {
        if (m > n && a > b) {
            return true;
        }
        return false;
    }
}
