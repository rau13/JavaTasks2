//Напишите метод который позволяет возводить числа в квадрат
package hwLESSON8_1;

import java.util.Scanner;

public class hw2MODULE8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(vkvadrat(num));
    }
    public static int vkvadrat(int a){
        return a*a;
    }
}
