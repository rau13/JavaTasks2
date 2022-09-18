import java.util.Random;
import java.util.Scanner;

public class gg {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 1;
        int sum = 0;

        while(a!=0){
            a = scan.nextInt();
            if (a%2!=0){
                sum+=a;
            }
        }

        System.out.println("Сумма нечетных чисел: " + sum );
    }
}


