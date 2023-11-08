package reference;

import lombok.Data;

@Data
public class SavePoint {
  String name;

  public SavePoint(String name) {
    this.name = name;
  }
}
