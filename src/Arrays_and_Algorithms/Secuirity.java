package Arrays_and_Algorithms;

import javax.security.auth.login.CredentialException;
import java.util.*;
import java.util.concurrent.Callable;

public class Secuirity {
    public static void main(String[] args){
        System.out.println(DeCryptCaesar("DEFG",3));
        System.out.println(Caesar("ABCD",3));
    }
    static String Caesar(String text, int key){
        String s = "";
        for(int i = 0; i<text.length();i++){
            int x = (((int)text.charAt(i)) - 65 + key)% 26;
            char y = (char)(x+65);
            s+=y;
        }
        return s;
    }
    static String DeCryptCaesar(String text, int key){
        String s = "";
        for(int i = 0; i<text.length();i++){
            int x = (((int)text.charAt(i)) - 65 - key)% 26;
            char y = (char)(x+65);
            s+=y;
        }
        return s;
    }
    static String simple(String text){
        Character[] a = {'A','B','C','D','E','F','G','H','N'};
        String s = "";
        List<Character> list = Arrays.asList(a);
        Collections.shuffle(list);
        for(int i = 0;i<text.length();i++){
            int x = ((int) text.charAt(i)) - 65;
            char y = list.get(x);
            s += y;
        }
        return s;
    }
}
