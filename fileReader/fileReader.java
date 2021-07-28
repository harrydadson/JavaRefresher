import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("");
        Scanner scan = new Scanner(file);

        String fileContent = "";
        while(scan.hasNextLine()) {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }
        FileWriter writer = new FileWriter("");
        writer.write(fileContent);
        writer.close();
    }
}
