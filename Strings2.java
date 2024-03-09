public class Strings2 {
    public static void main(String[] args) {
        // String name = new String("Aakash"); //Strings are immutable
        // System.out.println(name);
        // System.out.println(name.concat(" Chandra Vakkalagadda"));

        StringBuffer name = new StringBuffer("Aakash"); // String Buffers are mutable
        System.out.println(name.capacity());
        name.append(" Chandra");
        System.out.println(name);
        System.out.println(name.capacity());

    }
}
