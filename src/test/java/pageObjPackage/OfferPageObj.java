package pageObjPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPageObj {

    public WebDriver driver;

    By search = By.xpath("//input[@type='search']");

    public OfferPageObj(WebDriver driver){

        this.driver = driver;

    }

    public void searchInOffersPageField(String name){
        driver.findElement(search).sendKeys(name);
    }
}
