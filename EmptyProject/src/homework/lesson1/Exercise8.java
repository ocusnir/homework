package homework.lesson1;

public class Exercise8 {
    public static void main(String[] args) {
       // Проверка високосного года
        int year = 2016;

        LeapYear(year);

    }
    public static void LeapYear(int y) {
        if (y % 4 == 0)
            System.out.println("Этот год, високосный");

        else if ( y % 100 == 0)
            System.out.println("Этот год, високосный");

        else if (y % 400 == 0)
            System.out.println("Этот год, високосный");
        else {
            System.out.println("Этот год, не високосный");
       }

    }
}
