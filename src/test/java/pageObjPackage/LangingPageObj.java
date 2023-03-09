package pageObjPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestSetup;

public class LangingPageObj {

    WebDriver driver;

    By search = By.xpath("//input[@type='search']");

    public LangingPageObj(WebDriver driver){
        this.driver = driver;
    }

    public void searchInEnterFieldMethodUsingXpath(String sendKey){

        driver.findElement(search).sendKeys(sendKey);

    }

    public String gettingProductNameMethodUsingCssSelector(String name){

         return driver.findElement(By.cssSelector(name)).getText();

    }
}
