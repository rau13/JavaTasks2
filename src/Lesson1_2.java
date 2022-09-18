//Класс - ссылочный тип данных, который может содержать в себе несколько других типов данных(Поля),
// а также может производить действия над этими данными(Методы).


class Cat {
        String nick; //Поля
        int age;     //Поля

        String sayMeow() { //Методы
            return "Meow";
            //Some code
        }

        String sleep() {   //Методы
            return "I'm sleeping now";
            //Some code
        }

        //Объект - это экземпляр класса, который обладает опрделенными атрибутами и действиями, прописанными в клас
        public static void main(String args[]) {
            Cat mycat = new Cat(); // Создание объекта
            mycat.age = 7;
            mycat.nick = "MIA";
            System.out.println(mycat.nick);
            System.out.println(mycat.age);
            System.out.println(mycat.sleep());
        }
    }



