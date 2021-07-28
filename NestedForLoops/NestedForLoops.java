public class NestedForLoops {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println("its cold");
        }
        System.out.println("--------------------");

        String[] colors = {"Red", "Blue", "Green"};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        System.out.println("--------------------");

        String[][] fancyColors = { {"Red", "Blue", "Green"},
                                    {"Cyan", "Magenta", "Turquoise"} }; 
        
        for (int i = 0; i < fancyColors.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(fancyColors[i][j]);
            }
        }
    }
}
