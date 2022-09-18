package hwLESSON5_1;

import java.util.Scanner;

public class hw7MODULE5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        if (x.startsWith("1")||x.startsWith("2")||x.startsWith("3")){
            System.out.println("да");
        }else{
            System.out.println("Нет");
        }

    }
}
