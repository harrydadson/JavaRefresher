import java.util.HashMap;

public class hashMaptutorial {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 3;
        int c = 88;

        HashMap<String, Integer> happyy = new HashMap<String, Integer>();
        happyy.put("a",10);
        happyy.put("b", 3);
        happyy.put("c", 88);

        System.out.println(happyy);
        System.out.println(happyy.get("a"));

    }

}
