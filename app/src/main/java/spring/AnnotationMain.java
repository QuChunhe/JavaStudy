package spring;

import org.springframework.beans.factory.Aware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
  public static void main(String[] args){
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("spring");
    User user = ctx.getBean("user",User.class);
    System.out.println(user);
    Aware aware;
  }

}
