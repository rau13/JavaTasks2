package Extends;

//extends - наследует от класса Animals то есть класс Animals является родительским классом
public class Dog extends Animals {
    public static void main(String[] args){

    }
    public static void bark(){
        System.out.println("*Barking*");
    }
    //Переопределили метод родительского класса
    public static void eat(){
        System.out.println("Dog eating now");
    }
}
