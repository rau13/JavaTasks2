//Создайте массив любой длины. Найдите количество четных чисел в массиве.
package hwLESSON6_1;
public class hw2MODULE6 {
    public static void main(String[] args){
        int massiv[] = {5,6,7,4,10};
        int total = 0;
        for(int i =0;i< massiv.length;i++){
            if (massiv[i]%2==0){
                total++;
            }
        }
        System.out.println(total);
    }
}
