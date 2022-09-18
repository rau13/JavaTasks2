/*
Инкапсуляция - объединение данных и их обработка в одну капсулу
 */

package Lesson5_2;

public class BankAccount {
    private String name, lastname; //private - приватный доступ, можно использовать только в этом классе
    private int age;
    private double money;

    public BankAccount(){ //public - общий доступ
        name = "Andrey";
        money = 500;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }
}



/*
Вывод:
Инкапсуляция - объеденение данных в одну логическиую структуру
Модификаторы доступа становятся перед полями, конструкторами меотодами и классами. Они нужны для доступа к элементам из разных участков кода.
Геттер(getter) - обычный метод который возвращает знаяение поля.
Сеттер(setter) - обычнй метод  который задает новое значение поля.
 */

