//2 задача Напишите программу, которая будет определять какое из 2-х введенных цифр ближе к 15.
package hwLESSON5_1;

public class hw2MODULE5 {
    public static void main(String[] args){
        int a = 15;
        int b = 18;
        int c = 20;
        if (a + b > a + c||a - b > a -c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}