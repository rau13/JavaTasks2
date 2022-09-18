class Electrocar{
    private int id;
    static private String name = "Tesla";
    //Вложенный нестатический класс(подкласс, подобъект) имеет доступ к полям(данным) основного класса
    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id + " is starting...");
        }
    }
    //Вложенный статический класс имеет доступ только к статическим полям(данным)
    public static class Battery{
        public void charge(){
            System.out.println(name + " Battery is charging...");
        }
    }
    public Electrocar(int id){
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar " + id + " is starting...");
    }
}
public class InnerClasses {
    public static void main(String[] args){
        Electrocar electrocar = new Electrocar(5);
        electrocar.start(); // Вызов метода нестатического вложенного класса
        Electrocar.Battery battery = new Electrocar.Battery(); // Создание статического вложенного класса
        battery.charge();
    }
}
