class Mobile {
    static String brand;
    static int year;

    // public Mobile() {
    // String brand = "";
    // int price = 200;
    // System.out.println("in constructor");
    // }
    public Mobile() {
        int year = 19;
        String brand = "Apple";
        System.out.println(year + " " + brand);
    }

    public Mobile(int year, String brand) {
        this.year = year;
        this.brand = brand;
        System.out.println("The year is " + year + " The brand is " + brand);
    }

    public Mobile(int year) {
        System.out.println("//parameterized constructor : " + year);
    }

    // public Mobile() {
    // System.out.println("//unparameterized constructor");
    // }

    // static void Hi() {
    // name = "Phone";
    // System.out.println("in static block");
    // }

    // static int Hi(int num) {
    // return num;
    // }
}

public class StaticBlocks { // static blocks are used to initialise the static variables
    /**
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // Class.forName("Mobile");
        // int num = 3;
        // int age=21;
        // String name="Aakash";
        // Mobile.Hi();
        // Mobile mp1 = new Mobile();
        // Mobile mp3= new Mobile();
        // Mobile mp2 = new Mobile(3);

        // System.out.println(Mobile.Hi(num));
        Mobile m = new Mobile();
        Mobile m1 = new Mobile(2021, "Apple");
        Mobile m2 = new Mobile(1999);
        // Mobile m1=new Mobile(2017);
        // Mobile m2= new Mobile(2017,"Apple");
        // }
    }
}
