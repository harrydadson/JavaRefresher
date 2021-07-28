public class returnStatements {
    public static void main(String[] args) {
        int sum = add(9, 10);
        System.out.println(sum);

        printAmessage();

        String shouting = caps("why are you reading my diary!");
        System.out.println(shouting);

        int[] awesomeArray = ArrayFromInts(3, 7, 1);
        System.out.println(awesomeArray[0]);
        System.out.println(awesomeArray[1]);
        System.out.println(awesomeArray[2]);
    }
    public static void printAmessage() { // return nothing use void
        System.out.println("This is our first message");
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static String caps(String s) {
        return s.toUpperCase();
    }
    public static int[] ArrayFromInts(int a, int b, int c) {
        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        return array;
    }
}
