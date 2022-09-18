//Создайте массив любой длины. Найдите произведение элементов массива
package hwLESSON6_1;
public class hw1MODULE6 {
    public static void main(String[] args){
        int bucket[] = {200,300,100,500};
        int sum = 0;
        int mult = 1;
        for(int i = 1;i<bucket.length;i++){
            sum+=bucket[i];
            mult*= bucket[i];
        }
        System.out.println(sum + " " + mult);
    }
}
