public class Lesson6_1 {
    public static void main(String[] args){
        int bucket[] = {250,1500,250,300};        //массив
        int total = 0;

        for (int i = 0; i< bucket.length; i++){   //цикл
            total+=bucket[i];
        }


        System.out.println(total);
    }
}
