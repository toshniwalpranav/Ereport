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
    public void user_fill_the_form_from_given_sheetname_and_rownumber(String sheetName, int rowNumber)
            throws IOException {

        ExcelReader reader = new ExcelReader();

        List<Map<String, String>> testData =
                reader.getData("src/test/resources/TestData.xlsx", sheetName);

        Map<String, String> data = testData.get(rowNumber);
        //testData contains all rows.  get(rowNumber) selects one row.

        contactUsPage.fillContactUsForm(
                data.get("FullName"),
                data.get("Email"),
                data.get("CurrentAddress"),
                data.get("PermanentAddress")
        );
    }

    @Then("user click on send button")
    public void user_click_on_send_button() {

        contactUsPage.clickSubmit();
    }
}