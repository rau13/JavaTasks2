package hwLESSON5_1;

import java.util.Scanner;

public class hw5MODULE5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a>2&&a<11||b>=6&&b<14){
            System.out.println("Верно");
        }else{
            System.out.println("Неверно");
        }
    
    }
    

}
