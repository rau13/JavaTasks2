package Serialization;

import Interfaces.Person;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args){
        User user1 = new User(1, "Rauan");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.bin"))) {
            /*FileOutputStream fos = new FileOutputStream("users.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);*/

            oos.writeObject(user1);
            //fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
