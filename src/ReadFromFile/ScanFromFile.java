package ReadFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Scanner;

public class ScanFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        File file = new File("src/ReadFromFile/text");
        File file1 = new File("src/ReadFromFile/numbers");
        Scanner scan = new Scanner(file);
        Scanner scan1 = new Scanner(file1);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        scan.close();
        String line = scan1.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[5];
        int counter = 0;
        for(String number: numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));

        scan1.close();
    }
}
