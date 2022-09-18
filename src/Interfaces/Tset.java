package Interfaces;

public class Tset {
    public static void main(String[] args){
        Person user = new Person("Rauan");
        user.ShowInfo();
        user.sayHello();
        Animal cat = new Animal(13);
        cat.ShowInfo();
        cat.sleep();
    }
}
