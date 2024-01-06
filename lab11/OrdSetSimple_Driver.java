/**
 * Nathan MacDiarmid
 * 101098993
 * 
 * CONCLUSION
 * The construction of code coverage testing means nothing
 * unless code functionality is being tested.
 * Step 19 reveals a fault in the actual OrdSetSimple.java
 * program. 
 */
public class OrdSetSimple_Driver {

  public static void main(String argv[]) {

    TestCase1();

    // add other calls to test case methods here

    TestCase2();
    TestCase3();

  }

  public static void TestCase1() {
    System.out.println("----------------------");
    System.out.println("------- TEST 1 -------");
    System.out.println("----------------------");
    OrdSetSimple s1, s2, s3;

    s1 = new OrdSetSimple(3); // Creating a set of maximum size 3.
    System.out.println("s1 = "+s1);

    s2 = new OrdSetSimple(2);
    s2.addElement(1);
    s2.addElement(4);
    System.out.println("s2 = "+s2);

    s3 = s1.difference(s2);
    System.out.println("s3 = s1 - s2 = "+s3);
    System.out.println("Expected: { }");
    System.out.println("Actual: " + s3);
  }

  /*
   * This test case is for 1, 2, and 3, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
   */
  public static void TestCase2() {
    System.out.println("----------------------");
    System.out.println("------- TEST 2 -------");
    System.out.println("----------------------");
    OrdSetSimple s1, s2, s3, s4;

    s1 = new OrdSetSimple(2); // Creating a set of maximum size 3.
    s1.addElement(1);
    s1.addElement(5);
    System.out.println("s1 = "+s1);

    s2 = new OrdSetSimple(2);
    s2.addElement(1);
    s2.addElement(4);
    System.out.println("s2 = "+s2);

    s4 = new OrdSetSimple(2);
    s4.addElement(5);

    s3 = s1.difference(s2);
    if (!s3.equals(s4)) {
      throw new AssertionError("\ns3 does not equal s1.difference(s2)\nExpected: { 5 }\nActual: " + s3);
    }
    System.out.println("s3 = s1 - s2 = "+s3);
    System.out.println("Expected: { 5 }");
    System.out.println("Actual: " + s3);
  }

  /*
   * This test case is for 4, 5, 6, 7, 8, 9
   */
  public static void TestCase3() {
    System.out.println("----------------------");
    System.out.println("------- TEST 3 -------");
    System.out.println("----------------------");
    OrdSetSimple s1, s2, s3, s4;

    s1 = new OrdSetSimple(5); // Creating a set of maximum size 3.
    s1.addElement(1);
    s1.addElement(2);
    s1.addElement(3);
    System.out.println("s1 = "+s1);

    s2 = new OrdSetSimple(2);
    s2.addElement(4);
    s2.addElement(5);
    System.out.println("s2 = "+s2);

    s4 = new OrdSetSimple(3);
    s4.addElement(1);
    s4.addElement(2);
    s4.addElement(3);

    s3 = s1.difference(s2);
    if (!s3.equals(s4)) {
      throw new AssertionError("\ns3 does not equal s1.difference(s2)\nExpected: { 1 2 3 }\nActual: " + s3);
    }
    System.out.println("s3 = s1 - s2 = "+s3);
    System.out.println("Expected: { 1 2 3 }");
    System.out.println("Actual: " + s3);
  }
}





 


