//Напишите метод который проверяет четное число или нечетное (метод должен возвращать
//true если четное, и false если нечетное)
package hwLESSON8_1;

import java.util.Scanner;

public class hw1MODULE8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(test(num));
    }
    public static boolean test(int a){
        boolean total = false;
        if (a%2==0){
            total = true;
        }
        else{
            total = false;
        }
        return total;
    }
}
