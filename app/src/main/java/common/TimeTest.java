package common;

import java.time.Duration;
import java.util.HashMap;

public final class TimeTest {
  private int i = 0;

  public TimeTest(int i) {
    this.i = i;
  }

  @Override
  public String toString() {
    return Integer.toString(i);
  }

  private static void kk(int i) {
    i = i << 1;
    System.out.println(i);
  }

  private static void qq(Integer i) {
    i = 11;
    System.out.println(i);
  }


  private static void qq(String i) {
    i = i + "adafsadf";
    System.out.println(i);
  }


  private static void qq(TimeTest o) {
    o.i = o.i << 2;
    System.out.println(o);
  }
  public static void main(String[] args) {
    Duration duration;
    HashMap hashMap;
    int i= 3;
    System.out.println(i);
    kk(3);
    System.out.println(i);
    Integer k = Integer.valueOf(4);
    System.out.println(k);
    qq(k);
    System.out.println(k);

    TimeTest t = new TimeTest(1);
    System.out.println(t);
    qq(t);
    System.out.println(t);


    String s = "12345";
    System.out.println(s);
    qq(s);
    System.out.println(s);
  }
}
