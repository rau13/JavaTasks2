interface OtherAnimal{
    public void sound();
}
/*class Animal implements OtherAnimal{
    public void sound(){
        System.out.println("SomeSound");
    }
}*/
// Вместо того чтобы создавать отдельный класс для реализации интерфейса
// (Если нам не нужен отдельный класс для этого)
// можем воспользоваться Анонимным классом
public class Anonim_Class {
    public static void main(String[] args){
        OtherAnimal animal = new OtherAnimal() {
            @Override
            public void sound() {
                System.out.println("SomeSound");
            }
        };
        animal.sound();
    }
}
