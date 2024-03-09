class A {

    static int value;

    public A() {
        System.out.println("in A");
    }

    // public A(int value) {
    // this.value = value;
    // System.out.println(value);
    // }

    public int valueReturn(int value) {
        this.value = value * value;
        return this.value;
    }

    // public A(int num) {
    // this();
    // System.out.println("in A int");
    // }

}

// class B extends A {
// public B() {
// super(6);
// System.out.println("in B");
// }

// public B(int num) {
// this();
// System.out.println("in B int");
// }
// }

public class Super {

    public static void main(String[] args) {
        // B obj = new B(5);
        A obj1 = new A();
        System.out.println(obj1.valueReturn(9));
    }
}