package Arrays_and_Algorithms;

import java.util.HashMap;

public class Map_Dict {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>(); // Работае как словарь в Пайтон <Ключ, значение ключа>(Указываетсч тип даных)
        map.put("Rauan", 17);
        map.put("Rakhat", 16);
        map.put("Timur", 18);
        System.out.println(map.containsKey("Roma")); //Есть ли такой ключ
        System.out.println(map.containsValue(20)); // Есть ли такое значение ключа
        System.out.println(map.get("Timur"));// Запрос элемента этого ключа
        map.remove("Timur");
        for(String i: map.keySet()){
            System.out.println(i+":" + map.get(i));
        }
    }
}
