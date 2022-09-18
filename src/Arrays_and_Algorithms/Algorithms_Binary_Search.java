package Arrays_and_Algorithms;
// Бинарный поиск
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Algorithms_Binary_Search {
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(77);
        list.add(2);
        list.add(6);
        list.add(5);
        boolean ok = false; // Изначально стоит false(числа нет) просто как флаг
        int x  = 77; // Число которое нужно найти в массиве(проверить наличие этого числа в массиве)
        Collections.sort(list); // Массив сортируется по порядку
        int l = 0; // Левая сторона массива(Первые элемент в массиве)
        int r = list.size()-1; // Правая сторона массива(Последний элемент в массиве)

        while (l<=r){ // Пока два указателя не пересеклись
            int m = (l+r)/2; // Середина массива(Элемент находящийся в середине)
            if(list.get(m) == x){ //Если средний элемент в массиве равен числу которое мы ищем то флаг становится TRUE (что значит мы его нашли)
                ok = true;
                break;
            }
            else if(list.get(m) > x) r = m-1; //Если средний элемент в массиве больше чем число которое мы хотим найти то двигаем правый указатель на сердину
            else l = m+1; // Двигаем левый указатель на середину
        }
        System.out.println(ok);
    }
}
