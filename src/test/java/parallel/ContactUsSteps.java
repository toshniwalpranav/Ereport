package parallel;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.pages.ContactUsPage;
import com.qa.Util.ExcelReader;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsSteps {

    private ContactUsPage contactUsPage =
            new ContactUsPage(DriverFactory.getDriver());

    @Given("user navigate to contact us page")
    public void user_navigate_to_contact_us_page() {

        DriverFactory.getDriver().get("https://demoqa.com/text-box");
    }

    @When("user fill the form from given sheetname {string} and rownumber {int}")
    public void user_fill_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber)
            throws IOException {

        ExcelReader reader = new ExcelReader();

        List<Map<String, String>> testData =
                reader.getData("src/test/resources/TestData.xlsx", sheetName);

        String fullName = testData.get(rowNumber).get("FullName");
        String email = testData.get(rowNumber).get("Email");
        String currentAddress = testData.get(rowNumber).get("CurrentAddress");
        String permanentAddress = testData.get(rowNumber).get("PermanentAddress");

        contactUsPage.fillContactUsForm(
                fullName,
                email,
                currentAddress,
                permanentAddress);
    }

    @Then("user click on send button")
    public void user_click_on_send_button() {

        contactUsPage.clickSubmit();
    }
}