package ClassesAndObjects;

public class Lesson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Rauan";
        person1.age = 17;
        person1.sayHello();
        person1.yourAge();
        Person person2 = new Person();
        person2.name = "rauan";
        person2.age = 16;
        person2.sayHello();
        person2.yourAge();
        int year1 = person1.yearsToRetirement();//Помещает данные полученные из функции в переменную
        int year2 = person2.yearsToRetirement();
        System.out.println(year1 + " " + year2);
    }

}
class Person{
        //У класса могут быть:
        //1. Данные(поля)
        //2. Действия(Методы)
    String name;//Данные(поля)
    int age;//Данные(поля)
    int yearsToRetirement(){
        return 65 - age;//Возвращает данные
    }
    void sayHello(){
        System.out.println(name + " Hello!");
    }
    void yourAge(){
        System.out.println("Your age - " + age);
    }
}
