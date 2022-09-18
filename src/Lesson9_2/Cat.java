package Lesson9_2;

public class Cat {
    String nickname;
    int age;

    String sound(){
        return "Meow";
    }
    public String toString(){
        return nickname + " " + age;
    }


    public static void main(String args[]){
       Cat mycat = new Cat();
       mycat.nickname = "MIA";
       mycat.age = 7;
       System.out.print(mycat.toString());
    }
}

