package test;

import framework.ParentScenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;

public class RegistrationStepDef extends ParentScenario {

    @Given("User go to the NopCommerce Home page")
    public void user_go_to_the_nop_commerce_home_page() {
        registrationPage.verifyBrowserIsOpen();
        registrationPage.navigateToHomePage();
    }
    @Given("User navigate to the Registration page")
    public void user_navigate_to_the_registration_page() {
        registrationPage.clickOnRegistrationButton();
    }
    @When("User select the {string} as gender")
    public void user_select_the_as_gender(String gender) {
        registrationPage.selectGender(gender);
    }
    @When("User set first name and last name")
    public void user_set_first_name_and_last_name() {
        registrationPage.setFirstName();
        registrationPage.setLastName();
    }
    @When("User set {string} as date of birth")
    public void user_set_as_date_of_birth(String dob) {
        registrationPage.setDOB(dob);
    }
    @When("User set {string} as email")
    public void user_set_as_email(String email) {
        registrationPage.setEmail();
    }
    @When("User set {string} as company details")
    public void user_set_as_company_details(String companyName) {
        registrationPage.setCompanyName(companyName);
    }
    @When("User set Newsletter option as {string}")
    public void user_set_newsletter_option_as(String status) {
        registrationPage.setNewsletter(status);
    }
    @When("User set {string} as password and confirm password again")
    public void user_set_as_password_and_confirm_password_again(String password) {
        registrationPage.setPasswordAndConfirmPassword(password);
    }
    @When("User click on the Register button")
    public void user_click_on_the_register_button() {
        registrationPage.clickOnRegistrationSubmitButton();
    }
    @Then("Verify that the new account registration message {string} is displayed")
    public void verify_that_the_new_account_registration_message_is_displayed(String msg) {
        registrationPage.registrationSuccessValidation(msg);
        basePage.logout();
    }
}
