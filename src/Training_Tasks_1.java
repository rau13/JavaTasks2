import java.util.Scanner;

public class Training_Tasks_1 {
    public static void main(String[] args){
        //task1();
    //task2();
   task3();
    }

    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();

        int array[] = new int [arraySize];
        System.out.println("Заполните массив: ");
        for (int i=0;i<arraySize;i++){
            array[i] = scanner.nextInt();
        }
        int oddNumerSum = 0;
        int evenNumberSum = 0;
        for (int i = 0;i<arraySize;i++){
            if (i%2==0){
                evenNumberSum+=array[i];
            }
            else{
                oddNumerSum+=array[i];
            }
        if (evenNumberSum>oddNumerSum){
            System.out.println("even");
        }
        else if(evenNumberSum<oddNumerSum){
            System.out.println("odd");
        }
        else{
            System.out.println("equal");
        }
        }
    }

    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();

        int array[] = new int[arraySize];
        System.out.println("Заполните массив: ");
        for (int i=0;i<arraySize;i++){
            array[i] = scanner.nextInt();
        }
        int maxNumber = 0;
        int maxIndex = 0;
        for (int i=0; i<arraySize; i++){
            if (array[i]>maxNumber){
                maxNumber = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Индекс максимального числа в массиве: " + maxIndex);
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = scanner.nextInt();

        System.out.println("Введите число: ");
        int b = scanner.nextInt();

        System.out.println("Итог: ");
        if(a>b){
            System.out.println(a);
        }
        else if(b>a){
            System.out.println(b);
        }
        else{
            System.out.println("equal");
        }
    }
}


