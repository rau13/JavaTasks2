import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class Lesson8__1 {
    public static void main(String[] args) {
        int total = calcualte(5,6);
        System.out.println(calcualte(15,16));
        System.out.println(calcualte(10,13));
        System.out.println("Total: "+total);
    }
    public static int calcualte(int a, int b) {
        return a+b;
    }
}
