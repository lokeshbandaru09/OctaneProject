package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;





public class LoginStep {
    public BaseUtil base;
    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I navigate to Login Page$")
    public void iNavigateToLoginPage() throws Throwable {
       System.out.println("This is Login Step");
      //  throw new PendingException();
    }


    @And("^I enter the UserName as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUserNameAsAndPasswordAs(String UserName, String Password) throws Throwable {
        System.out.println("The User Name is : " + UserName + "Password is " + Password);
     //   throw new PendingException();
    }


    @And("^I click Login Button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("This is Login Step3");
      //  throw new PendingException();
    }



    @Then("^I should see the UserForm Page$")
    public void iShouldSeeTheUserFormPage() throws Throwable {
        System.out.println("This is Login Step4");
       // throw new PendingException();

    }


}
