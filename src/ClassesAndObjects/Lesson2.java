package ClassesAndObjects;

public class Lesson2 {
    public static void main(String[] args){
        Human human = new Human("Rauan");

    }
}
class Human{
        private String name; //private - доступны только внутри своего класса
        private int age;

        public Human(String name){ //Конструктор
            this.name = name;
            System.out.println("Имя указано");
        }
        public Human(int age){ //Конструктор
            this.age = age;
            System.out.println("Возраст указан");
        }
        public Human(){ //Конструктор
            System.out.println("Данные не указаны");
        }
        public Human(String name, int age){ //Конструктор
            this.name = name;
            this.age = 15;
        }
        public String getName() { // создали геттеры и сеттеры для того чтобы можно было обращться к приватизированным данным
            return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void sayAgeName(){
        System.out.println(name + " " + age);
    }

}
