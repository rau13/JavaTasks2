//Если переменная text равна 'test', то выведите 'Верно', иначе выведите 'Неверно'. Проверьте
//работу скрипта при text , равном 'test', 'тест', 3.
package hwLESSON5_1;

import java.util.Scanner;

public class hw6MODULE5 {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       String text = scan.nextLine();
       if (text == "test"){
            System.out.println("Верно");
        }else{
            System.out.println("Неверно");
        }
    }
}
