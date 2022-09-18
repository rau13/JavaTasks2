package hwLESSON5_1;

import java.util.Scanner;

public class hw9MODULE5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(c*c==a*a+b*b){
            System.out.println("Треугольник прямоугольный");
        }else{
            System.out.println("Треугольник не прямоугольный");
        }
    }
}
