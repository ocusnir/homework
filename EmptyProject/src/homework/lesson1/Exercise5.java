package homework.lesson1;

public class Exercise5 {
    public static void main(String[] args) {

        int x = -23;

        PositiveOrNegative(x);
    }

    public static void PositiveOrNegative (int a) {
        if (a >=0)
            System.out.println("This number is a positive one");
        else {
            System.out.println("This number is a negative one");
        }

    }
}
