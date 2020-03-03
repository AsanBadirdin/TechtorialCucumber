package StepDefinitions.WebOrderStepDef;

import Pages.LoginPage;
import Utils.ConfigReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ListAllOfStepDef {
    WebDriver driver = Driver.getDriver();
    LoginPage page = new LoginPage();
    @Then("the user validate the header text {string}")
    public void the_user_validate_the_header_text(String string) {

    }

}