package Serialization;

import java.io.Serializable;
import java.security.PublicKey;

public class User implements Serializable {
    private int id;
    private String nick;
    public User(int id, String nick){
        this.id = id;
        this.nick = nick;
    }
    public int getId(){
        return id;
    }
    public String getNick(){
        return nick;
    }
    public String toString(){
        return id + " : " + nick;
    }
}
