/*
Абстрактный класс - это класс который имеет абстрактные методы.
Абстрактные метод - это метод, который не имеет тела.
Полиморфизм - одно тело, множество форм. Одно имя метода - различные реализации.
Связывание - связь между вызывом метода и его кодом.
Ранее связывание - когда тело заранее определено(статично).
Позднее связывание - когда перед запуском программы не известно какой метод сработает (динамичное).
Перегрузка методов - это способность класса иметь несколько методов с одинаковыми именами, но при этом отличаться параметрами(количество,типами или последовательностью).
 */
package Lesson4_2;

import java.util.ArrayList;

public class Cat extends Animals{
    String nickname;

    Cat(){ //Перегрузка конструкторов

    }

    Cat(String nickname){  //Перегрузка конструкторов
        this.nickname = nickname;
    }

    String sound(){   //Перегрузка метода
        return "Meow";
    }

    String sound(String t){ //Перегрузка метода
        return t;
    }

    public static void main(String[] args){
        Cat mycat = new Cat();
        System.out.println(mycat.sound());
        System.out.println(mycat.sound("Hello"));

        Animals mynewcat = new Cat();
        Animals mynewdog = new Dog();
        ArrayList<Animals> list = new ArrayList<>();
        list.add(mynewcat);
        list.add(mynewdog);

        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i).sound());
        }


        }
    }
/*
Вывод:
Абстрактный класс - имеет абстрактные методы, это методы которые не имеют реалиацию
Полиморфизм - одно имя, разные реализации
Переопределение - это позднее связывание
Перегрзука - ранее связывание
 */

