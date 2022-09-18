package Polymorphism;

public class Test {
    public static void main(String[] args){
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        test(cat);
        test(dog);
        test(animal);
    }
    public static void test(Animal animal){
        animal.eat();
    }
}
