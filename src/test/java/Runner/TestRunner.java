package Runner;


import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;



//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"} , glue = "Steps")
//public class TestRunner{
public class TestRunner extends AbstractTestNGCucumberTests {
}