package Runner


import cucumber.api.junit.Cucumber
import cucumber.api.testng.AbstractTestNGCucumberTests
import org.junit.runner.RunWith
import cucumber.api.CucumberOptions


//@RunWith(Cucumber.class)
@CucumberOptions(features = arrayOf("src/test/java/features"), format = arrayOf("json:target/cucumber.json", "html:target/site/cucumber-pretty"), glue = arrayOf("Steps"))
//public class TestRunner{
 class TestRunner : AbstractTestNGCucumberTests(  ){


}

