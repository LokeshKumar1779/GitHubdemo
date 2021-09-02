package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	
	  @Given("^User is on Netbanking landing page$") public void
	  user_is_on_netbanking_landing_page() throws Throwable {
	  System.out.println("hello1"); }
	  
	  @When("^User login into application with username and pwd$") public void
	  user_login_into_application_with_username_and_pwd() throws Throwable {
	  System.out.println("hello2"); }
	  
	  @Then("^Home page is populated$") public void home_page_is_populated() throws
	  Throwable { System.out.println("hello3"); }
	  
	  @And("^Cards are displayed$") public void cards_are_displayed() throws
	  Throwable { System.out.println("hello4"); }
	  
	  @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
	     System.out.println(strArg1 +" "+strArg2 );
	    }
	  
	  @Then("^Cards are displayed \"([^\"]*)\"$")
	  public void cards_are_displayed(String string) {
	     System.out.println(string);
	      
	  }


	 
}