import java.text.SimpleDateFormat;
import java.util.Date;

public class currentTime {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(currentDate));

        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(sdf2.format(currentDate));

        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE");
        System.out.println(sdf3.format(currentDate));

        SimpleDateFormat sdf4 = new SimpleDateFormat("h:mm a");
        System.out.println(sdf4.format(currentDate));
    }
}
