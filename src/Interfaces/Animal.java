package Interfaces;

public class Animal implements Info {
    public int id;
    public Animal(int id){
        this.id = id;
    }
    public void sleep(){
        System.out.println("Sleeping now!");
    }
    public void ShowInfo(){
        System.out.println("ID is - " + id);
    }

}
