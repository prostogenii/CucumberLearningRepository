package utils;


import org.openqa.selenium.WebDriver;


import java.io.IOException;

public class TestSetup {

    WebDriverManagerSetUp webDriverManagerSetUp = new WebDriverManagerSetUp();

    public WebDriver driver;
    public String landingPageProductName;

    public void WebDriverGiver() throws IOException {
        driver = webDriverManagerSetUp.WebDriverManager();
    }


}
