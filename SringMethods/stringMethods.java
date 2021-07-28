public class stringMethods {
    public static void main(String[] args) {
        String name = "Billy Bob Joe";

        System.out.println("Name: " + name);
        System.out.println("UpperCase: " + name.toUpperCase());
        System.out.println("First Char: " + name.charAt(0));
        System.out.println("Length: " + name.length());
        System.out.println("last Char: " + name.charAt(name.length() - 1));
        System.out.println("Substring: " + name.substring(10, 13));
    }
}