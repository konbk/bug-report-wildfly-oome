package wildflyoome;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;

@Model
public class BackingBean {
  private byte[] bytes;
  private int property;

  @PostConstruct
  public void init() {
    bytes = new byte[50 * 1024 * 1024];
  }

  public int getProperty() {
    return property;
  }
}
