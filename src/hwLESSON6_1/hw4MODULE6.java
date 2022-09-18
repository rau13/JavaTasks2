package hwLESSON6_1;

public class hw4MODULE6 {
    public static void main(String[] args){
        int array[] = {13,5,4,6,17,9};
        int total = 0;
        for(int i = 0;i< array.length;i++){
            if(array[i]%2!=0&&array[i]<11){
                total++;
            }
        }
        System.out.println(total);
    }
}
