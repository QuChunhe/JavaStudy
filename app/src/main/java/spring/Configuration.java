package spring;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Configuration {

  @Bean(name = "user")
  public User getUser(){
    return new User(1, "Jack",18);
  }

  @Bean
  public BeanFactoryPostProcessor custom(){
    return new MyBeanFactoryPostProcessor();
  }
}