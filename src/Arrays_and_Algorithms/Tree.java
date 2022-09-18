package Arrays_and_Algorithms;

import java.util.Set;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args){
        Set<Integer> tree = new TreeSet<>();
        tree.add(5);
        tree.add(4);
        tree.add(11);
        tree.add(5); // В "Дереве" элементы не повторяются(как во множествах в Пайтон)
        tree.remove(4); // Убирает элемент
        System.out.println(tree.contains(4)); // Содержит ли какой то элемент
        System.out.println(tree);
    }
}
