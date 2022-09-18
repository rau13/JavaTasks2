//Напишите метод который проверяет входящую переменную str на наличие в переменной
//символа “$” (метод должен возвращать текст “Доллары” если символ присутствует в тексте, и
//текст “Без долларов” если символа нет)
package hwLESSON8_1;
public class hw3MODULE8 {
    public static void main(String[] args){
        System.out.println(proverka("$ ABS"));
    }
    public static String proverka(String a){
        if(a.contains("$")){
            return "Доллары";
        }
        else{
            return "Без долларов";
        }
    }
}
