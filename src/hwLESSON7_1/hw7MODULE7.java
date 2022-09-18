package hwLESSON7_1;

import java.util.Scanner;

public class hw7MODULE7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 1;
        while((a/=100)>0){
            b++;
        }
        System.out.println(b);
    }

}
