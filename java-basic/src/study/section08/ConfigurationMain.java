package study.section08;

public class ConfigurationMain {

  public static void main(String[] args) {
    ConfigurationManager config = ConfigurationManager.getInstance();
    config.setConfig("url", "https://jh2021.tistory.com/");
    config.setConfig("timeout", "5000");

    System.out.println("URL: " + config.getConfig("url"));
    System.out.println("Timeout: " + config.getConfig("timeout"));
  }
}
