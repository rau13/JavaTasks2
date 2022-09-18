package Arrays_and_Algorithms;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        Iterator it = list.listIterator();
        while(it.hasNext()){
            int i = (Integer)it.next();
            System.out.println(i);
        }
    }
}
