package parallel;

import com.pages.ContactUsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsSteps {

    private ContactUsPage contactUsPage = new ContactUsPage(driverFactory.getDriver());

    @Given("user navigate to contact us page")
    public void user_navigate_to_contact_us_page() {
     DriverFactory.getDriver().get("https://demoqa.com/text-box");   
}

@When("user fill the form from given sheetname {string} and rownumber0")
public void user_fill_the_form_from_given_sheetname_and_rownumber0(String string) {
    
}

@Then("user click on send button")
public void user_click_on_send_button() {
   
}

@When("user fill the form from given sheetname {string} and rownumber1")
public void user_fill_the_form_from_given_sheetname_and_rownumber1(String string) {
 
 }



}
