package common;

import javax.xml.parsers.DocumentBuilderFactory;
import java.sql.Driver;
import java.util.ServiceLoader;

public class SPIDemo {
  public static void main(String[] args) {
    ServiceLoader<Driver> serviceLoader;
    DocumentBuilderFactory factory =  DocumentBuilderFactory.newInstance();
    Runtime runtime;
  }
}
