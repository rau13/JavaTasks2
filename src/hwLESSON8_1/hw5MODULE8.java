package hwLESSON8_1;

public class hw5MODULE8 {
    public static void main(String[] args) {
        numbers(10,5);
    }
    static void numbers(int a, int b){
        int[] num_array = new int[a];
        if(a>b){
            for (int i = 0;i< num_array.length;i++){
                System.out.print(num_array[i]);
        }

    }else{
            for (int i = 0;num_array.length!=0;i--){
                System.out.println(num_array[i]);
            }
        }

}
}
