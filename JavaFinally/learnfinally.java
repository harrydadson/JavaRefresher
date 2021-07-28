import java.util.Scanner;

public class learnfinally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.close();

        try {
            System.out.println(sc.next());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}
