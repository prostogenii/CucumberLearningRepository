package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = "src/test/java/fetures", glue = "stepDefinations", monochrome = true)

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
