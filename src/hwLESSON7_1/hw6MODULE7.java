package hwLESSON7_1;

import java.util.Scanner;

public class hw6MODULE7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = (int)(Math.random()*10);
        int attempts = 0;
        int b = 0;
        System.out.println(a);
        while(b!=a){
            b = scan.nextInt();
            attempts+=1;
            if(b==a){
                System.out.println("Поздравляем!Вы угадали число");
                System.out.println("Число попыток: " + attempts);
                break;
            }

        }

    }
}
