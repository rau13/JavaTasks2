package hwLESSON5_1;

import java.util.Scanner;

public class hw10MODULE5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x%4==0&&x%100==1||x%400==0){
            System.out.println("Количество дней в году: 366");
        }else{
            System.out.println("Количество дней в году: 365");
        }
    }
}
