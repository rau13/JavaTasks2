package Serialization;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFromFile {
    public static void main(String[] args){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.bin"))){
            /*FileInputStream fis = new FileInputStream("users.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);*/ //Вместо этого можно создавать объекты в скобках try
            User user1 = (User) ois.readObject();
            System.out.println(user1);
            //ois.close();
        }catch (IOException e ){
            e.printStackTrace();
        }catch (ClassNotFoundException e ){
            e.printStackTrace();
        }
    }
}
