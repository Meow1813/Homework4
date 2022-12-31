public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 17;
         if (age >= 18 ){
             System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
         }
         else {
             System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
         }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 17;
        if (temperature < 5 ){
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 80;
        if (speed > 60 ){
            System.out.println("скорость превышена");
        }
        else {
            System.out.println("превышения скорости нет");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 21;
        if (age >= 2 && age <= 6)
        {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if ( age > 18 && age < 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else if (age > 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 21;
        if (age < 5 )
        {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else if ( age > 14 ){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int place = 98;
        int places = 102;
        int seatingPlaces = 60;
        int standingPlaces = places - seatingPlaces;

        if (place > places){
            System.out.println("Мест нет");
        }
        else if (place > 60){
            System.out.println("Есть стоячие места");
        }
        else{
            System.out.println("Есть сидячие места");
        }

    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println(one);
        }
        else if (two > one && two > three){
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }

    }

}