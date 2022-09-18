//Выведите столбец чисел от 1 до 100.
package hwLESSON7_1;

import java.util.Random;
import java.util.Scanner;

public class hw1MODULE7 {
    public static void main(String[] args){
        System.out.println("Result: " + gg());
    }
    public static int gg(){
        Random rand = new Random();
        int n = rand.nextInt();
        return n;
        }
    }


