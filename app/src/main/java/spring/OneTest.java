package spring;

import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.parsing.BeanEntry;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OneTest {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml");
    Book book = (Book) ctx.getBean("book");
    System.out.println(book);
    BeanDefinition beanDefinition;
    BeanFactory beanFactory;
    BeanFactoryPostProcessor beanFactoryPostProcessor;

    String s = new String("abc");
    Aware aware;

  }
}
