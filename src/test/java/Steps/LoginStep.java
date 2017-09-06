package Steps;


import Base.BaseUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;



public class LoginStep {
    private BaseUtil base;
    public LoginStep(BaseUtil base) {
        this.base = base;
    }



        ChromeOptions chromeOptions = new ChromeOptions();
      //  chromeOptions.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chromeOptions);





    @Given("^I navigate to Amazon Page$")
    public void iNavigateToAmazonPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();


            System.out.println("Hi, Welcome to DevOps Demo");

        //   Code for Amazon website to search for desired Name : Adidas Shoes.
             driver.navigate().to("https://www.amazon.com");
             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }



    @And("^I should search for the Search Bar$")
    public void iShouldSearchForTheSearchBar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Adidas Shoes");

    }

    @And("^I should search for the Adidas Shoes$")
    public void iShouldSearchForTheAdidasShoes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();

        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
    }

    @Then("^I should see all the available Adidas Shoes$")
    public void iShouldSeeAllTheAvailableAdidasShoes() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();

    }
}
