//Выведите столбец четных чисел в промежутке от 0 до 100.
package hwLESSON7_1;
public class hw3MODULE7 {
    public static void main(String[] args){
        int i = 0;
        while (i<100){
           i++;
           if (i%2==1){
               continue;
           }
            System.out.println(i);
        }

    }
}
