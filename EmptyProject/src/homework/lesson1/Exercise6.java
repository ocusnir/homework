package homework.lesson1;

public class Exercise6 {
    public static void main(String[] args) {

        int x = 34;

        boolean kk = posorneg(x);
        System.out.println(kk);

    }

    public static boolean posorneg (int a) {
        if (a >= 0)
            return true;
        else {
            return false;
        }
    }

}
