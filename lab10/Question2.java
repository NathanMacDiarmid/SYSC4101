import java.lang.Math;

/*
 * SYSC 4101
 * Lab 10
 * Nathan MacDiarmid
 * 101098993
 */
public class Question2 {

    public static void Test1() {
        System.out.println("---------------------");
        System.out.println("-------TEST 1--------");
        System.out.println("---------------------");
        System.out.println();

        System.out.println("Math.sin(x)^2 + Math.cos(x)^2 = 1");
        System.out.println();

        double precision = 0.000000000000001;

        for (int i = 1; i < 6; i++) {
            System.out.println("x = " + i);

            System.out.println("Math.sin(x)^2 = " + Math.pow(Math.sin(i), 2));
            System.out.println("Math.cos(x)^2 = " + Math.pow(Math.cos(i), 2));
            System.out.println("Math.sin(x)^2 + Math.cos(x)^2 = " + (Math.pow(Math.sin(i), 2) + Math.pow(Math.cos(i), 2)));

            assert (1 - (Math.pow(Math.sin(i), 2) + Math.pow(Math.cos(i), 2))) < precision;
            System.out.println("\nRESULT = " + ((Math.sin(i) - Math.sin(Math.PI - i)) < precision) + "\n");
        }
    }

    public static void Test2() {
        System.out.println("---------------------");
        System.out.println("-------TEST 2--------");
        System.out.println("---------------------");
        System.out.println();

        System.out.println("Math.cos(Math.PI + x) = -Math.cos(x)");
        System.out.println();

        double precision = 0.000000000000001;

        for (int i = 1; i < 6; i++) {
            System.out.println("x = " + i);

            System.out.println("-Math.cos(x) = " + -Math.cos(i));
            System.out.println("Math.cos(Math.PI + x) = " + Math.cos(Math.PI + i));

            assert (-Math.cos(i) - Math.cos(Math.PI + i)) < precision;
            System.out.println("\nRESULT = " + ((-Math.cos(i) - Math.cos(Math.PI + i)) < precision) + "\n");
        }
    }

    public static void Test3() {
        System.out.println("---------------------");
        System.out.println("-------TEST 3--------");
        System.out.println("---------------------");
        System.out.println();

        System.out.println("Math.cos(Math.PI - x) = -Math.cos(x)");
        System.out.println();

        double precision = 0.000000000000001;

        for (int i = 1; i < 6; i++) {
            System.out.println("x = " + i);

            System.out.println("-Math.cos(x) = " + -Math.cos(i));
            System.out.println("Math.cos(Math.PI + x) = " + Math.cos(Math.PI - i));

            assert (-Math.cos(i) - Math.cos(Math.PI - i)) < precision;
            System.out.println("\nRESULT = " + ((-Math.cos(i) - Math.cos(Math.PI - i)) < precision) + "\n");
        }
    }
    public static void main(String args[]) {
        Question2.Test1();
        Question2.Test2();
        Question2.Test3();
    }
}