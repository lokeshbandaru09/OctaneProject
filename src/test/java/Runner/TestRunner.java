package Runner;


import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;



//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"} ,format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"}, glue = "Steps")
//public class TestRunner{
public class TestRunner extends AbstractTestNGCucumberTests {
}