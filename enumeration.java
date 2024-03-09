enum Status {
    Started, Running, Failed, Pending, Success;
}

public class enumeration {
    public static void main(String[] args) {
        // int n = 5;
        // Status[] ss = Status.values();
        Status[] s = Status.values();
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        
        // for (Status s : ss) {
        // System.out.println(s + " : " + s.ordinal());
        // }
    }
}
