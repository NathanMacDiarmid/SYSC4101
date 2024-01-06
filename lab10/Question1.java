import java.lang.Math;

/*
 * SYSC 4101
 * Lab 10
 * Nathan MacDiarmid
 * 101098993
 */
public class Question1 {

    public static void Test1() {
        System.out.println("---------------------");
        System.out.println("-------TEST 1--------");
        System.out.println("---------------------");
        System.out.println();

        System.out.println("Math.sin(x) = Math.sin(Math.PI - x)");
        System.out.println();

        double precision = 0.000000000000001;

        for (int i = 1; i < 6; i++) {
            System.out.println("x = " + i);

            System.out.println("Math.sin(x) = " + Math.sin(i));
            System.out.println("Math.sin(Math.PI - x) = " + Math.sin(Math.PI - i));

            assert (Math.sin(i) - Math.sin(Math.PI - i)) < precision;
            System.out.println("\nRESULT = " + ((Math.sin(i) - Math.sin(Math.PI - i)) < precision) + "\n");
        }
    }

    public static void Test2() {
        System.out.println("---------------------");
        System.out.println("-------TEST 2--------");
        System.out.println("---------------------");
        System.out.println();

        System.out.println("Math.sin(x) = -Math.sin(Math.PI + x)");
        System.out.println();

        double precision = 0.000000000000001;

        for (int i = 1; i < 6; i++) {
            System.out.println("x = " + i);

            System.out.println("Math.sin(x) = " + Math.sin(i));
            System.out.println("-Math.sin(Math.PI + x) = " + -Math.sin(Math.PI + i));

            assert (Math.sin(i) - -Math.sin(Math.PI + i)) < precision;
            System.out.println("\nRESULT = " + ((Math.sin(i) - -Math.sin(Math.PI + i)) < precision) + "\n");
        }
    }

    public static void Test3() {
        System.out.println("---------------------");
        System.out.println("-------TEST 3--------");
        System.out.println("---------------------");
        System.out.println();

        System.out.println("Math.sin(x) = -Math.sin(-x)");
        System.out.println();

        double precision = 0.000000000000001;

        for (int i = 1; i < 6; i++) {
            System.out.println("x = " + i);

            System.out.println("Math.sin(x) = " + Math.sin(i));
            System.out.println("-Math.sin(-x) = " + -Math.sin(-i));

            assert (Math.sin(i) - -Math.sin(-i)) < precision;
            System.out.println("\nRESULT = " + ((Math.sin(i) - -Math.sin(-i)) < precision) + "\n");
        }
    }
    public static void main(String args[]) {
        Question1.Test1();
        Question1.Test2();
        Question1.Test3();
    }
}