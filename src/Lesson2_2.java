/*
This: Нужен для обращения к глобальным переменным и для вызова конструктора внутри класса.
Static - поля и методы принадлежат классу а не объекту.
*/

class Dog{
    String nick;//Поля
    int age;//Поля

    Dog(String nick, int age){ //Конструктор
    this.nick = nick;         //this-обращение к глобальной переменной
    this.age = age;
    }
    Dog(){
        this("GGWP",7);
    }
    String Voice(){ //Методы
        return "Gav";
    }

public static void main(String[] args){
       Dog mydog = new Dog(); // Вызываем пустой конструктор так как выше уже написаны параметры
       System.out.println(mydog.nick);
       System.out.println(mydog.age);
    }
}