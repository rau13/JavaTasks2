/*
Абстрактный класс - это класс который имеет абстрактные методы
Абстрактные методы - это методы которые не имеют тела(функционала)
Функционал абстрактных методов пишется в классах которые наследуют этот Абстрактный класс
Кроме обычных классов в Java есть абстрактные классы. Абстрактный класс похож на обычный класс.
В абстрактном классе также можно определить поля и методы, но в то же время нельзя создать объект или экземпляр абстрактного класса.
Абстрактные классы призваны предоставлять базовый функционал для классов-наследников.
А производные классы уже реализуют этот функционал.
 */
public class AbstractClass {
    public static void main(String[] args){
        Bank user = new BankUser("Kaspi");
        user.count();
        System.out.println(user.bank);
    }
}
abstract class Bank{
    String bank;
    public abstract void count();
}
class BankUser extends Bank{
    public BankUser(String bank){
        super.bank = bank;
    }
    public void count(){
        System.out.println("Счет: 10000");
    }

}