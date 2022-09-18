package hwLESSON7_1;

import java.security.KeyStore;
import java.util.Scanner;

public class hw8MODULE7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        while(true){
            if (Math.pow(3,a)%a==0){
                System.out.println("YES");
                break;
            }else{
                System.out.println("NO");
                a = scan.nextInt();
            }
        }


        }
    }
