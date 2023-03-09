package utils;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WebDriverManagerSetUp {

    WebDriver driver;



    public WebDriver WebDriverManager() throws IOException {


          FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties");
          Properties properties = new Properties();
          properties.load(fis);
          String url = properties.getProperty("URL");

          if (properties.getProperty("browser").equalsIgnoreCase("chrome")) {
              driver = new ChromeDriver();
              driver.get(url);
          }
          else if (properties.getProperty("browser").equalsIgnoreCase("firefox")) {
              //firefox coge
          }

        return driver;

    }
    @After
    public void quitWeb(){
        driver.quit();
    }

}
