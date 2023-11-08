package common;

import com.google.common.util.concurrent.RateLimiter;

import java.sql.Driver;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class IntegerTest {
  public static void main(String[] arts) {
    RateLimiter rateLimiter;
    Driver driver;
    com.mysql.cj.jdbc.Driver driver1;
    HashMap hashMap;
    String s;
    Integer i;
    ConcurrentHashMap concurrentHashMap;
    //s.split()
    System.out.println(Float.floatToIntBits(1.0f));
    System.out.println(Float.floatToIntBits(1.1f));
    System.out.println(Float.floatToIntBits(1.2f));

    System.out.println(Float.floatToIntBits(-1.0f));
    System.out.println(Float.floatToIntBits(-1.1f));
    System.out.println(Float.floatToIntBits(-1.2f));
  }
}
