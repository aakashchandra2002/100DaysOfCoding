
public class Arrays {

    public static void main(String args[]) {
        int num[][][] = new int[3][4][5]; // multi dimensional array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    num[i][j][k] = (int) (Math.random() * 10);
                    System.out.print(num[i][j][k] + " ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) { // 2 dimensional array
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }
    }
}
