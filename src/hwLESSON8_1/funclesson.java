package hwLESSON8_1;

import java.util.Scanner;

public class funclesson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String b = scan.nextLine();
        int n = scan.nextInt();
        int a = scan.nextInt();
        System.out.println(NullNumbers(n,a,b));
    }

    static int NullNumbers(int n, int a, String b) {
        int c = 0;
        if(b == "+"){
            c = n + a;
        }
        if (b == "-"){
            c = n - a;
        }
    return c;
    }
}

