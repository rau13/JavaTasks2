package WriteToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/WriteToFile/test");
        PrintWriter pw = new PrintWriter(file);
        pw.println("First column ");
        pw.println("Second column ");
        pw.close();
    }
}
