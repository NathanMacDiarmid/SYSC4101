public class IntegerTest {

      public static void TestSuite1() {
            System.out.println("----- TEST SUITE 1 -----");
            System.out.println();

            System.out.println("----- Testing n < 0 -----");
            Integer_SQRT.integer_sqrt_v1(-1);
            Integer_SQRT.integer_sqrt_v1(-5);
            System.out.println();

            System.out.println("----- Testing n < 2 -----");
            System.out.println(Integer_SQRT.integer_sqrt_v1(0));
            System.out.println(Integer_SQRT.integer_sqrt_v1(1));
            System.out.println(Integer_SQRT.integer_sqrt_v1(2));
            System.out.println();

            System.out.println("----- Testing return small candidate -----");
            System.out.println(Integer_SQRT.integer_sqrt_v1(5));
            System.out.println(Integer_SQRT.integer_sqrt_v1(16));
            System.out.println();
      }

      public static void TestSuite2() {
            System.out.println("----- TEST SUITE 2 -----");
            System.out.println();

            System.out.println("----- Testing n < 0 -----");
            Integer_SQRT.integer_sqrt_v2(-1);
            Integer_SQRT.integer_sqrt_v2(-5);
            System.out.println();

            System.out.println("----- Testing n < 2 -----");
            System.out.println(Integer_SQRT.integer_sqrt_v2(0));
            System.out.println(Integer_SQRT.integer_sqrt_v2(1));
            System.out.println();

            System.out.println("----- Testing path -----");
            System.out.println(Integer_SQRT.integer_sqrt_v2(2));
            System.out.println(Integer_SQRT.integer_sqrt_v2(3));
            System.out.println(Integer_SQRT.integer_sqrt_v2(4));
            System.out.println();

            System.out.println("----- Testing return small candidate -----");
            System.out.println(Integer_SQRT.integer_sqrt_v2(5));
            System.out.println(Integer_SQRT.integer_sqrt_v2(16));
            System.out.println();
      }

      public static void TestSuite3() {
            System.out.println("----- TEST SUITE 3 -----");
            System.out.println();

            System.out.println("----- Testing n < 0 -----");
            Integer_SQRT.integer_sqrt_v3(-1);
            Integer_SQRT.integer_sqrt_v3(-5);
            System.out.println();

            System.out.println("----- Testing n < 2 -----");
            System.out.println(Integer_SQRT.integer_sqrt_v3(0));
            System.out.println(Integer_SQRT.integer_sqrt_v3(1));
            System.out.println(Integer_SQRT.integer_sqrt_v3(2));
            System.out.println();

            System.out.println("----- Testing return small candidate -----");
            System.out.println(Integer_SQRT.integer_sqrt_v3(5));
            System.out.println(Integer_SQRT.integer_sqrt_v3(16));
            System.out.println();
      }

      public static void main(String args[]) {
                TestSuite1();
                TestSuite2();
                TestSuite3();
      }
}

