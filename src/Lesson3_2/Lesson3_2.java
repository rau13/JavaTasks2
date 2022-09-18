package Lesson3_2;

/*
Наследование - это свойство класса перенимать все характеристики(поля и методы)базового класса, а также дополнять его своими полями и методами.
Интервейс - это такой класс, который содержит в себе только названия методов, которые в дальнейшем будут реализованы у наслдеников.
Final - это модификатор который ставится перед типом данных и указывает, что данная переменная не будет меняться. Другими словами это константа.
 */

class Cat extends Animals implements Predator{
    String nick;
    Cat(){
        super();
    }
    String sound(){ //Переопределение метода
        return "Meow";
    }
    public void hunt(){
        System.out.println("I can hunt");
    }

public static void main(String[] args) {
    Cat mycat = new Cat();
    Dog mydog = new Dog();
    mycat.age = 7;
    System.out.println(mycat.age);
    mycat.hunt();
    System.out.println(mycat.a);
    System.out.println(mycat.sound());
    System.out.println(mydog.sound());
    }

}
/*
Вывод:
Классы могут наследовать или быть наследованными
У класса не может быть несколько родительских классов
Класс можеть реализовывать несколько интерфейсов
В интерфейсе методы всегда public а переменные final static
Final = константа
Final классы не наследуются
Методы базового класса могут быть изменены в Производном классе.
 */
