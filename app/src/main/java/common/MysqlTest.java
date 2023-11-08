package common;

import com.google.common.util.concurrent.RateLimiter;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.GsonBuilder;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.MysqlDataSource;

import java.text.NumberFormat;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;


public class MysqlTest {

  public static void main(String[] arts) {
    RateLimiter rateLimiter;
    Driver driver;
    NumberFormat numberFormat;
    ProcessBuilder processBuilder;
    ThreadPoolExecutor executor;
    ExecutorCompletionService executorCompletionService;
    ThreadFactory factory;
    Object object;
    MysqlDataSource dataSource;
    GsonBuilder builder = new GsonBuilder().enableComplexMapKeySerialization()
            .disableHtmlEscaping()
            .serializeNulls()
            .addDeserializationExclusionStrategy(new ExclusionStrategy() {
              @Override
              public boolean shouldSkipField(FieldAttributes f) {
                return false;
              }

              @Override
              public boolean shouldSkipClass(Class<?> clazz) {
                return false;
              }
            });
  }
}
