package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class print {

@Given("user is on webpage")
public void user_is_on_webpage() {
   System.out.println("on web page");
}

@When("user print")
public void user_print() {
	System.out.println("hii");
}

@Then("close the page")
public void close_the_page() {
	System.out.print("close the page");
}




}
