//В переменной month лежит какое-то число из интервала от 1 до 12. Определите в какую пору года
//попадает этот месяц (зима, лето, весна, осень). Примечание: использовать switch-case
package hwLESSON5_1;

import java.util.Scanner;

public class hw8MODULE5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        switch (month){
            case 1,2,3:
                System.out.println("Зима");
                break;
            case 4,5,6:
                System.out.println("Весна");
                break;
            case 7,8,9:
                System.out.println("Лето");
                break;
            case 10,11,12:
                System.out.println("Осень");
                break;
        }

    }
}
