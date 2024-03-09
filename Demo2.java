
// abstract class A {
//     public abstract void show();

//     public int add(int n1, int n2) {
//         return n1 + n2;
//     }

//     public int sub(int n1, int n2) {
//         return n1 - n2;
//     }
// }

public class Demo2 {
    public static void main(String[] args) {
        // A obj = new A() {
        // public void show() {
        // System.out.println("in new Show");
        // }
        // };
        // obj.show();
        // int add = obj.add(1, 2);
        // int sub = obj.sub(2, 1);
        int num = 5;
        int result = 2;
        int result2 = 2;
        result = ++num;
        result2 = num++;
        System.out.println(result + " " + result2);

    }
}
