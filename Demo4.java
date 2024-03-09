interface A {
    int salary = 10000;
    String name = "Aakash";
    String company = "Meta";

    void empDetails();

    String empName(String name);
}

interface X extends A {
    String compName(String company);
}

class B implements A, X {
    public String compName(String compName) {
        return compName;
    }

    public void empDetails() {
        System.out.println("in empDetails");
    }

    public String empName(String name) {
        return name;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        B obj = new B();
        obj.empDetails();
    }
}
