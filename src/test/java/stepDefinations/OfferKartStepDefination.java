package stepDefinations;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObjPackage.OfferPageObj;
import utils.TestSetup;

import java.util.Iterator;
import java.util.Set;


public class OfferKartStepDefination {
    TestSetup testSetup;

    public String offerPageProductName;

    public  LandingKartStepDefination landingKartStepDefination;

    public OfferKartStepDefination(TestSetup testSetup){
          this.testSetup = testSetup;
    }

    public void switchToTheOffersPage(){
        testSetup.driver.findElement(By.linkText("Top Deals")).click();
        Set<String> s1 = testSetup.driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        testSetup.driver.switchTo().window(childWindow);
    }

    @Then("User go and search for {string} shortname in offers page to check if product exist same name")
    public void user_go_and_search_for_the_same_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {

        switchToTheOffersPage();
        OfferPageObj offerPageObj = new OfferPageObj(testSetup.driver);
        offerPageObj.searchInOffersPageField(shortName);
        Thread.sleep(2000);
        offerPageProductName = testSetup.driver.findElement(By.cssSelector("#root > div > div > div > div > div > div > table > tbody > tr > td:nth-child(1)")).getText();

        Assert.assertEquals(offerPageProductName, testSetup.landingPageProductName);


    }
}
