import java.util.ArrayList;

public class foreachAlgo {
    public static void main(String[] args) {
        
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        String[] cars = {"BMW", "Kia", "Benz"};
        for (String car : cars) {
            System.out.println(car);
        }

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(4);
        nums.add(5);

        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
