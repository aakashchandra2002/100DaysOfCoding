class Laptop {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Developer {
    public void devApp(Laptop lap) {
        lap.code();
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Laptop lap = new Laptop();

        Developer Aakash = new Developer();
        Aakash.devApp(lap);
    }
}
