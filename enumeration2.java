public class enumeration2 {
    enum Status {
        Started, Running, Failed, Pending, Success;
    }

    public static void main(String[] args) {
        Status s = Status.Pending;

        if (s == Status.Running)
            System.out.println("All good");
        else if (s == Status.Failed)
            System.out.println("Try Again");
        else if (s == Status.Pending)
            System.out.println("Please wait");
        else
            System.out.println("Done");
    }
}
