package hwLESSON6_1;
public class hw3MODULE6 {
    public static void main(String[] args){
        int array[] = {3,21,12,33,5};
        int total = 3;
        for (int i = 0;i<array.length;i++){
            if (array[i]%3==0&&array[i]%7!=0){
                total++;
            }
        }
        System.out.println(total);
    }
}


