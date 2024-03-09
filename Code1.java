public class Code1 {
    public void myMethod() {
        System.out.println("Method");
    }

    {
        System.out.println("Instance Block");
    }

    public void First_C() {
        System.out.println("Constructor ");
    }

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        Code1 c = new Code1();
        c.First_C();
        c.myMethod();
    }
}