package spring;

import lombok.Data;

@Data
public class User {
  private Integer id;
  private String name;
  private Integer age;

  public void doSth() {
    Book book = new Book();
    book.setId(1);
    book.setName("故事新编");
    book.setPrice((double) 20);
  }

  public User(Integer id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
