package spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    System.out.println("调用自定义BeanFactoryPostProcessor");
    BeanDefinition beanDefinition = beanFactory.getBeanDefinition("user");
    System.out.println("开始修改属性的值");
    beanDefinition.getPropertyValues().add("name","Tom");

  }
}
