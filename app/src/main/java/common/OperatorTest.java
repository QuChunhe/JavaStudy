package common;

public class OperatorTest {
  public static void main(String[] args) {
    int a = 1, b = 2, c= 3;
    a = b = c;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    System.out.println("*****************");
    System.out.println(((left(true) || right(true))));
    System.out.println((left(false) && right(false)));
    System.out.println("*****************");
    if (left(true) || right(false)) {
      //do nothing
    }
    if (left(false) && right(false)) {
      // do nothing
    }
    System.out.println("*****************");
    print(left(true) || right(true));
    print(left(false) && right(false));
    System.out.println("*****************");

  }

  static boolean left(boolean value) {
    System.out.println("left");
    return value;
  }

  static boolean right(boolean value) {
    System.out.println("right");
    return value;
  }

  static void print(boolean value) {
    System.out.println("-------------------");
  }

  static void print2(String v) {
    System.out.println("-------------------");
  }
}
