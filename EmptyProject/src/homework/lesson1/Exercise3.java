package homework.lesson1;

public class Exercise3 {
    public static void main(String[] args) {

        float x1 = 3.33f;
        float x2 = 33.2f;
        float x3 = 21.55f;
        float x4 = 12.4f;

        float calc1 = little_math(x1, x2, x3, x4);
        System.out.printf("Just a little math with the float datatype: %.2f" , calc1);

    }

    public static float little_math (float a, float b, float c, float d) {
        float calc =  a * (b + (c / d));
        return calc;
    }
}
