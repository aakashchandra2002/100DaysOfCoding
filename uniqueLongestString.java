public class uniqueLongestString {
    public static boolean areDistinct(String s, int i, int j) {
        boolean[] visited = new boolean[256];

        for (int k = i; k <= j; k++) {
            if (visited[s.charAt(k)] == true)
                return false;
            visited[s.charAt(k)] = true;
        }
        return true;
    }

    public static int uniqueLongestDistictString(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (areDistinct(s, i, j)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "aakash";
        System.out.println(s);
        int n = uniqueLongestDistictString(s);
        System.out.println(n);
    }
}
