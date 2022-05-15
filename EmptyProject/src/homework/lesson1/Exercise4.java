package homework.lesson1;

public class Exercise4 {
    public static void main(String[] args) {

        int x3 = 22;
        int x1 = 12;

        boolean checker1 = check(x3,x1);
        System.out.println(checker1);

    }

    /**
     * This method calculates a sum of two numbers
     * @param a the first number
     * @param b the second number
     * @return
     */
    public static boolean check(int a, int b) {
        int sum = a + b;
        if (sum >= 10 || sum <= 20)
            return true;
        else {
            return false;
        }
    }
}
