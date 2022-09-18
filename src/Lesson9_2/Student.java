package Lesson9_2;

import java.util.List;

public class Student <T,A> { //< > - Обобщенный класс
    private T phone;
    private A age;

    Student(A age, T phone){
        this.age = age;
        this.phone = phone;
    }
    public T getsmth(){
        return phone;
    }
    public <Q> void print(Q q){ //Может принимать любые типы.
        System.out.println(q);
    }

public static void main(String[] args){
        Student<String,Integer> me = new Student(15,"45679");
        Student<Integer,Integer> friend = new Student(16,456489);
        String s = me.phone;
        int a = friend.phone;
    System.out.println(s + " " + a);
    me.print("ggwp");
    me.print(78);
    }

}
/*
Object - прародитель всех классов в Java.
Generic типы нужны:
                    - для изменения ошибки из Runtime в Compilation
                    - для упрощения использования кода для разных типов
                    Нельзя создавать экземпляр типа параметра Generic
Generic могут быть:
                   -классы, интерфейсы
                   -методы, конструкторы
 */
