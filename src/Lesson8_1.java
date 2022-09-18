import java.util.Scanner;

public class Lesson8_1 {
    public static double pi = 3.14;

    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in); // Создает объект сканнер
        System.out.println("Введите радиус круга");
        double radius = scannerObj.nextDouble();     // Считывает следующую цифру

        double circleArea = GetCircleArea(radius);
        System.out.println("Area is: " + circleArea);// Вывод данных на консоль
    }
    public static double GetCircleArea(double radius){
        return radius*radius*pi;
    }

}


