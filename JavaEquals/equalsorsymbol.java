public class equalsorsymbol {
    public static void main(String[] args) {
        
        String a = "Lemur";
        String b = "Lemur";
        
        if (a == b) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }

        String c = new String("Lemur");
        String d = new String("Lemur");

        if (c.equals(d)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
