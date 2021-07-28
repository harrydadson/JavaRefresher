import java.util.LinkedList;
import java.util.Queue;

public class queueAlgo {
    public static void main(String[] args) {
        Queue<String> bbqline = new LinkedList<String>();
        bbqline.add("Jackson");
        bbqline.add("Tariq");
        bbqline.add("Susan");

        System.out.println(bbqline.poll()); 
        System.out.println(bbqline.peek()); 

        System.out.println(bbqline);
    }
}
