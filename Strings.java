import java.util.*;

public class Strings {
    public static String nameOfPerson(String rollNo) {
        switch (rollNo) {
            case "21885A0423":
                return "Aakash Chandra Vakkalagadda";
            case "21885a0423":
                return "Aakash Chandra Vakkalagadda";
            case "21885A0422":
                return "Mahesh Keshaboina";
            case "21885a0422":
                return "Mahesh Keshaboina";
            case "21885A0419":
                return "Harshath Kumar Bayyaram";
            case "21885a0419":
                return "Harshath Kumar Bayyaram";
            default:
                return "Invalid roll number";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your roll number");
        String rollNo = sc.nextLine();
        int n = rollNo.length();
        System.out.println(n);
        String p = nameOfPerson(rollNo);
        int Numbers = p.length();
        String q = p.toUpperCase();
        String r = p.toLowerCase();
        System.out.println("Hello' " + p + " ' Wassup?");
        System.out.println("Your name has " + Numbers + " number of digits");
        System.out.println("Upper Case : " + q);
        System.out.println("Lower Case : " + r);
        sc.close();
    }
}
