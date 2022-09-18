//1 Напишите программу, которая будет определять четное ли введенное число или не четное.
package hwLESSON5_1;

import java.util.Scanner;

public class hw1MODULE5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%2==0){
            System.out.println("Четное");
        }
        else{
            System.out.println("Нечтное");
        }


    }
}

