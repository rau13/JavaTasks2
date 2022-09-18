//С помощью цикла найдите сумму нечетных чисел от 1 до 100
package hwLESSON7_1;
public class hw5MODULE7 {
    public static void main(String[] args){
        int i = 1;
        int total = 0;
        while(i<100){
            i++;
            if (i%2!=2){
                total+=i;
                continue;
            }
            System.out.println(total);
        }
    }
}
