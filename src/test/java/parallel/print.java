package parallel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class print {

    // Scenario 1: Print

    @Given("user is on webpage")
    public void user_is_on_webpage() {
        System.out.println("User is on the webpage");
    }

    @When("user print")
    public void user_print() {
        System.out.println("Printing the page");
    }

    @Then("close the page")
    public void close_the_page() {
        System.out.println("Closing the page");
    }

    // Scenario 2: Location

    @Given("user is on webpage to find location")
    public void user_is_on_webpage_to_find_location() {
        System.out.println("User is on the webpage to find location");
    }

    @When("user findout location")
    public void user_findout_location() {
        System.out.println("Finding the location");
    }

}