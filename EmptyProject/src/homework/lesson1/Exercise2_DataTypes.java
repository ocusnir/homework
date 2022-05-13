package homework.lesson1;

public class Exercise2_DataTypes {
    public static void main(String[] args) {

        // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        // byte, short, int, long, float, double, char, boolean;

        byte x1 = 34;
        short x2 = 123;
        int x3 = 1500;
        long x4 = 45999;
        float x5 = 3.4f;
        double x6 = 24.2;
        /* тип данных double имеет возможность хранить значения как с плавающей
        точкой так и целые числа, поэтому я для примера написал 2 значения.*/
        double x7 = 223;
        char x9 = 'a';
        char x10 = 'b';


        byte calc1 = sum(x1, x1);
        System.out.println("byte " + calc1);

        short calc2 = sum(x1, x2, x2);
        System.out.println("Short " + calc2);

        int calc3 = sum(x3, x2);
        System.out.println("Int " + calc3);

        long calc4 = sum(x4, x3);
        System.out.println("long " + calc4);

        float calc5 = sum(x5, x5);
        System.out.println("float " + calc5);

        double calc6 = sum(x6, x5);
        System.out.println("double " + calc6);

        double calc6_1 = sum(x6, x7);
        System.out.println("double " + calc6_1);

        System.out.println("char " + x9 + x10);

        int a = 32;
        if(statement(a) == false) // тут число заранее известно, но при вводе числа данное условие будет работать более правильно, например проверка пароля и тд
            System.out.println("This is boolean and It works");

    }

        public static byte sum ( byte a, byte b){
            byte calc = (byte) (a - b);
            return calc;
        }

        public static short sum ( short a, short b, short c){
            short calc = (short) (a + (b / c) );
            return calc;
        }

        public static int sum ( int a, int b){
            int calc = a / b;
            return calc;
        }

        public static long sum ( long a, long b){
            long calc = a * b;
            return calc;
        }

        public static float sum ( float a, float b){
            float calc = a + b;
            return calc;
        }

        public static double sum ( double a, double b){
            double calc = a + b;
            return calc;
        }

        public static boolean statement ( int a){

            return a > 100;
    }

}
