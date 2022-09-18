package Lesson2_3_input_output_streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamsExample {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            File input = new File("src/input.txt");
            File output = new File("src/output.txt");

            in = new FileInputStream(input);
            out = new FileOutputStream(output);

            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }
}
