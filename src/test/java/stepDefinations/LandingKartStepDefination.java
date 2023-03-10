package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjPackage.LangingPageObj;
import utils.TestSetup;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class LandingKartStepDefination {
    public String offerPageProductName;
    TestSetup testSetup;

    public LandingKartStepDefination(TestSetup testSetup){
         this.testSetup = testSetup;
    }

    @Given("User is on a GreenKart Landing page")
    public void user_is_on_a_green_kart_landing_page() throws IOException {

          testSetup.WebDriverGiver();

//        testSetup.driver = new ChromeDriver();
//        testSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

    }
    @When("^User searched with shortname (.+) and extracted actual name of product$")
    public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
        LangingPageObj langingPageObj = new LangingPageObj(testSetup.driver);

       langingPageObj.searchInEnterFieldMethodUsingXpath(shortName);
        Thread.sleep(1000);
        testSetup.landingPageProductName = langingPageObj.gettingProductNameMethodUsingCssSelector("#root > div > div.products-wrapper > div > div > h4").split("-")[0].trim();
        System.out.println(testSetup.landingPageProductName+" is extracted from the home page");

    }


}
