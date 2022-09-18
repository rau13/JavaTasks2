package hwLESSON6_1;

public class hw5MODULE6 {
    public static void main(String[] args){
        int array[] = {1,5,7,8,9};
        int total = 0;
        for(int i = 0; i < array.length-1; i++) {
            if ((array[i]+1) % 2 == 0) {
                total+=array[i];
            }
        }
        System.out.println(total);
    }
}
