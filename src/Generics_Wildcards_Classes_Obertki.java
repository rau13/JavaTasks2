import java.util.ArrayList;
import java.util.List;

public class Generics_Wildcards_Classes_Obertki {
    public static void main(String[] args){
        Animals Puppy1 = new Puppy();  // Вызова(создание) объекта
        Animals Kitten1 = new Kitten();
        Animals animals = new Animals();
        Puppy1.setName("Puppy1"); // Вызов метода объекта
        Kitten1.setName("Kitten1");
        animals.setName("Animal1");
        List<Animals> ListOfAnimals = new ArrayList<>(); // Generics - параметризация List<Тип данных который будет в списке>
        ListOfAnimals.add(Puppy1); // Добавления объектов в список
        ListOfAnimals.add(Kitten1);
        ListOfAnimals.add(animals);
        ListOfAnimals.get(0); // Получение объекта по индексу в списке
        for(Animals animal: ListOfAnimals){
            System.out.println(animal); // Получение объектов из списка
        }
        for(Animals animal: ListOfAnimals){
            System.out.println(animal.getName()); // Получение имени каждого объекта
        }

    }
}
class Animals{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void Sound(){
        System.out.println("Hey");
    }
}
class Puppy extends Animals{

    public void Sound(){
        System.out.println("GAV");
    }

    @Override //Наследованный метод  переопределяется (Полиморфизм)
    public void setName(String name) {
        super.setName(name);
    }
}
class Kitten extends Animals{ // Объекта котенок наслдуется от класса Животные (Котенок является животным)

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void Sound(){
        System.out.println("Myau");
    }

}
