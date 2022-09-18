package Extends;

import javax.swing.*;

public class OOP_Lesson {
    public static void main(String[] args){
        Animals animal = new Animals();
        Dog dog = new Dog();
        dog.sleep(); //Класс Dog наследовал методы класса Animals
        dog.eat();
        dog.bark();
        animal.eat();
        animal.sleep();
    }
}
