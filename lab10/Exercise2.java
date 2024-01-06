/*
 * SYSC 4101
 * Lab 10
 * Nathan MacDiarmid
 * 101098993
 */
public class Exercise2 {

    /**
     * This is the first metamorphic relation that was described in the assignment
     */
    public static void Test1() {
        System.out.println("---------------------");
        System.out.println("-------TEST 1--------");
        System.out.println("---------------------");
        System.out.println();

        OrdSetSimple s1 = new OrdSetSimple(4);
        for (int i = 1; i <= s1.getCapacity(); i++) {
            s1.addElement(i);
        }

        OrdSetSimple s2 = new OrdSetSimple(4);
        for (int i = 1; i <= s2.getCapacity(); i++) {
            s2.addElement(i);
        }

        OrdSetSimple s3 = new OrdSetSimple(8);
        for (int i = 1; i <= s3.getCapacity(); i++) {
            s3.addElement(i);
        }

        OrdSetSimple s4 = new OrdSetSimple(16);
        for (int i = 1; i <= s4.getCapacity(); i++) {
            s4.addElement(i);
        }

        OrdSetSimple s5 = new OrdSetSimple(32);
        for (int i = 1; i <= s5.getCapacity(); i++) {
            s5.addElement(i);
        }

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);

        System.out.println("s1.difference(s2) = " + s1.difference(s2));
        System.out.println("s1.difference(s3) = " + s1.difference(s3));
        System.out.println("s1.difference(s4) = " + s1.difference(s4));
        System.out.println("s1.difference(s5) = " + s1.difference(s5));
    }

    /**
     * If you add the same numbers to both sets, you wil get the same result
     * S1 - S2 = S1new - S2new
     */
    public static void Test2() {
        System.out.println("---------------------");
        System.out.println("-------TEST 2--------");
        System.out.println("---------------------");
        System.out.println();

        OrdSetSimple s1 = new OrdSetSimple(4);
        for (int i = 1; i <= s1.getCapacity(); i++) {
            s1.addElement(i);
        }

        OrdSetSimple s2 = new OrdSetSimple(4);
        for (int i = 1; i <= s2.getCapacity(); i++) {
            s2.addElement(i);
        }

        OrdSetSimple s3 = new OrdSetSimple(8);
        for (int i = 1; i <= s3.getCapacity(); i++) {
            s3.addElement(i);
        }

        OrdSetSimple s4 = new OrdSetSimple(8);
        for (int i = 1; i <= s4.getCapacity(); i++) {
            s4.addElement(i);
        }

        OrdSetSimple s5 = new OrdSetSimple(16);
        for (int i = 1; i <= s5.getCapacity(); i++) {
            s5.addElement(i);
        }

        OrdSetSimple s6 = new OrdSetSimple(32);
        for (int i = 1; i <= s6.getCapacity(); i++) {
            s6.addElement(i);
        }

        OrdSetSimple s7 = new OrdSetSimple(32);
        for (int i = 1; i <= s7.getCapacity(); i++) {
            s7.addElement(i);
        }

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);
        System.out.println("s7 = " + s7);

        System.out.println("s1.difference(s2) = " + s1.difference(s2));
        System.out.println("s1.difference(s3) = " + s1.difference(s3));
        System.out.println("s1.difference(s4) = " + s1.difference(s4));
        System.out.println("s1.difference(s5) = " + s1.difference(s5));
        System.out.println("s1.difference(s6) = " + s1.difference(s6));
        System.out.println("s1.difference(s7) = " + s1.difference(s7));
    }

    /**
     * If you remove the same numbers from boths sets you will get the same result
     * S1 - S2 = S1new - S2new
     */
    public static void Test3() {
        System.out.println("---------------------");
        System.out.println("-------TEST 3--------");
        System.out.println("---------------------");
        System.out.println();

        OrdSetSimple s1 = new OrdSetSimple(4);
        for (int i = 1; i <= s1.getCapacity(); i++) {
            s1.addElement(i);
        }

        OrdSetSimple s2 = new OrdSetSimple(4);
        for (int i = 1; i <= s2.getCapacity(); i++) {
            s2.addElement(i);
        }

        OrdSetSimple s3 = new OrdSetSimple(8);
        for (int i = 1; i <= s3.getCapacity(); i++) {
            s3.addElement(i);
        }

        OrdSetSimple s4 = new OrdSetSimple(8);
        for (int i = 1; i <= s4.getCapacity(); i++) {
            s4.addElement(i);
        }

        OrdSetSimple s5 = new OrdSetSimple(8);
        for (int i = 1; i <= s5.getCapacity(); i++) {
            s5.addElement(i);
        }

        s1.remove(2);
        s2.remove(2);
        s3.remove(2);
        s4.remove(2);
        s5.remove(2);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);

        System.out.println("s1.difference(s2) = " + s1.difference(s2));
        System.out.println("s1.difference(s3) = " + s1.difference(s3));
        System.out.println("s1.difference(s4) = " + s1.difference(s4));
        System.out.println("s1.difference(s5) = " + s1.difference(s5));
    }

    public static void main(String args[]) {
        Exercise2.Test1();
        Exercise2.Test2();
        Exercise2.Test3();
    }
}
