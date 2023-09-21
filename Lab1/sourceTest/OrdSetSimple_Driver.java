public class OrdSetSimple_Driver {

  public static void main(String argv[]) {

    TestDifference();
    TestRemove();
    TestCapacity();
    TestSize();
    TestElemAt();
    TestFind();
    TestUnion();
    TestToString();
    TestEquals();

    // add other calls to test case methods here

  }

  public static void TestDifference() {
    OrdSetSimple s1, s2, s3, s4;

    s1 = new OrdSetSimple(3); // Creating a set of maximum size 3.
    System.out.println("s1 = "+s1);

    s2 = new OrdSetSimple(2);
    s2.addElement(1);
    s2.addElement(4);
    System.out.println("s2 = "+s2);

    s4 = new OrdSetSimple(3);
    s4.addElement(3);
    s4.addElement(1);
    s4.addElement(5);

    s3 = s1.difference(s2);
    System.out.println("s3 = s1 - s2 = "+s3);
  }

  // Add other methods defining tests here.
  public static void TestRemove() {
    OrdSetSimple s1;

    s1 = new OrdSetSimple(3);
    System.out.println("s1 = "+s1);

    s1.addElement(1);
    System.out.println("s1 = "+s1);
    s1.addElement(4);
    System.out.println("s1 = "+s1);

    s1.remove(1);
    System.out.println("s1 = "+s1);
  }

  public static void TestCapacity() {
    OrdSetSimple s1;

    s1 = new OrdSetSimple(3);
    System.out.println("s1 capacity = "+s1.getCapacity());
  }

  public static void TestSize() {
    OrdSetSimple s1;

    s1 = new OrdSetSimple(3);
    System.out.println("s1 = "+s1);

    s1.addElement(1);
    System.out.println("s1 = "+s1);
    System.out.println("s1 size = "+s1.getSize());
    s1.addElement(4);
    System.out.println("s1 size = "+s1.getSize());

    s1.remove(1);
    System.out.println("s1 size = "+s1.getSize());
  }

  public static void TestElemAt() {
    OrdSetSimple s1;

    s1 = new OrdSetSimple(4);
    System.out.println("s1 = "+s1);

    s1.addElement(1);
    System.out.println("s1 = "+s1);
    s1.addElement(4);
    System.out.println("s1 = "+s1);
    s1.addElement(3);
    System.out.println("s1 = "+s1);
    s1.addElement(9);
    System.out.println("s1 = "+s1);

    System.out.println("index 0 is " + s1.getElementAt(0));
    System.out.println("index 1 is " + s1.getElementAt(1));
    System.out.println("index 2 is " + s1.getElementAt(2));
    System.out.println("index 3 is " + s1.getElementAt(3));
    System.out.println("improper index " + s1.getElementAt(4));
    System.out.println("negative index " + s1.getElementAt(-1));
  }

  public static void TestFind() {
    OrdSetSimple s1;

    s1 = new OrdSetSimple(4);
    System.out.println("s1 = "+s1);

    s1.addElement(1);
    System.out.println("s1 = "+s1);
    s1.addElement(4);
    System.out.println("s1 = "+s1);
    s1.addElement(3);
    System.out.println("s1 = "+s1);
    s1.addElement(9);
    System.out.println("s1 = "+s1);
    s1.addElement(8);
    System.out.println("s1 = "+s1);

    System.out.println("4 is at index = "+s1.find(4));
    System.out.println("3 is at index = "+s1.find(3));
    System.out.println("1 is at index = "+s1.find(1));
    System.out.println("9 is at index = "+s1.find(9));
  }

  public static void TestUnion() {
    OrdSetSimple s1, s2;

    s1 = new OrdSetSimple(3);
    s2 = new OrdSetSimple(5);
    System.out.println("s1 = "+s1);
    System.out.println("s2 = "+s2);

    s1.addElement(1);
    System.out.println("s1 = "+s1);
    s1.addElement(4);
    System.out.println("s1 = "+s1);

    s2.addElement(1);
    System.out.println("s2 = "+s2);
    s2.addElement(3);
    System.out.println("s2 = "+s2);
    s2.addElement(5);
    System.out.println("s2 = "+s2);

    System.out.println("union = " + s1.union(s2));
  }

  public static void TestToString() {
    OrdSetSimple s1;

    s1 = new OrdSetSimple(4);
    System.out.println("s1 = "+s1);

    s1.addElement(1);
    System.out.println("s1 = "+s1);
    s1.addElement(4);
    System.out.println("s1 = "+s1);
    s1.addElement(3);
    System.out.println("s1 = "+s1);
    s1.addElement(9);
    System.out.println("s1 = "+s1);

    System.out.println("priting s1.toString() " + s1.toString());
  }

  public static void TestEquals() {
    OrdSetSimple s1, s2;

    s1 = new OrdSetSimple(3);
    s2 = new OrdSetSimple(3);
    System.out.println("s1 = "+s1);
    System.out.println("s2 = "+s2);

    s1.addElement(1);
    System.out.println("s1 = "+s1);
    s1.addElement(4);
    System.out.println("s1 = "+s1);

    s2.addElement(1);
    System.out.println("s2 = "+s2);
    s2.addElement(4);
    System.out.println("s2 = "+s2);

    System.out.println("testing equals = "+s2.equals(s1));
  }
}





 


