package pages;

import framework.Constants;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class RegistrationPage extends BasePage{

    @FindBy(xpath = Constants.REGISTRATION_BUTTON)
    WebElement registrationButton;
    @FindBy(xpath = Constants.REGISTRATION_GENDER_MALE)
    WebElement registrationGenderMale;
    @FindBy(xpath = Constants.REGISTRATION_GENDER_FEMALE)
    WebElement registrationGenderFemale;
    @FindBy(xpath = Constants.REGISTRATION_GENDER_MALE_SELECTED)
    WebElement registrationGenderMaleSelected;
    @FindBy(xpath = Constants.REGISTRATION_GENDER_FEMALE_SELECTED)
    WebElement registrationGenderFemaleSelected;
    @FindBy(xpath = Constants.REGISTRATION_PAGE_FIRSTNAME)
    WebElement registrationFirstName;
    @FindBy(xpath = Constants.REGISTRATION_PAGE_LASTNAME)
    WebElement registrationLastName;
    @FindBy(xpath = Constants.REGISTRATION_PAGE_EMAIL)
    WebElement registrationEmail;
    @FindBy(xpath = Constants.REGISTRATION_PAGE_COMPANY)
    WebElement registrationCompany;
    @FindBy(xpath = Constants.REGISTRATION_PAGE_NEWSLETTER)
    WebElement registrationNewsletter;
    @FindBy(xpath = Constants.REGISTRATION_PAGE_PASSWORD)
    WebElement registrationPassword;
    @FindBy(xpath = Constants.REGISTRATION_PAGE_CONFIRMPASSWORD)
    WebElement registrationConfirmPassword;
    @FindBy(xpath = Constants.REGISTRATION_PAGE_REGISTER_BUTTON)
    WebElement registrationRegisterButton;
    @FindBy(xpath = Constants.LOGOUT_BUTTON)
    WebElement logoutButton;
    @FindBy(xpath = Constants.REGISTRATION_COMPLETE_MESSAGE_XPATH)
    WebElement registrationSuccessMessage;


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void verifyBrowserIsOpen(){
        Assert.assertFalse(driver.toString().contains("null"));
    }
    public void navigateToHomePage() {
        driver.navigate().to(Constants.HOME_PAGE_URL);
    }

    public void clickOnRegistrationButton() {
        element = waitUntilClickable(registrationButton);
        element.click();
        Assert.assertEquals(Constants.REGISTRATION_PAGE_URL, driver.getCurrentUrl());

        //Registration page label visible
        element = waitUntilClickable(Constants.REGISTRATION_PAGE_LABEL);
        Assert.assertTrue(element.isDisplayed());

        //Registration page gender male button visible
        element = waitUntilClickable(Constants.REGISTRATION_GENDER_MALE);
        Assert.assertTrue(element.isDisplayed());
    }

    public void selectGender(String gender) {
        if(Objects.equals(gender.toLowerCase(), "male")){
            element = waitUntilClickable(registrationGenderMale);
            element.click();
            element = waitUntilElementVisible(registrationGenderMaleSelected);
            Assert.assertTrue(element.isDisplayed());
        }
        else if(Objects.equals(gender.toLowerCase(), "female")) {
            element = waitUntilClickable(registrationGenderFemale);
            element.click();
            element = waitUntilElementVisible(registrationGenderFemaleSelected);
            Assert.assertTrue(element.isDisplayed());
        }
    }

    public void setFirstName() {
        element = waitUntilElementVisible(registrationFirstName);
        Assert.assertTrue(element.isDisplayed());
        element.sendKeys("abc");
    }
    public void setLastName() {
        element = waitUntilElementVisible(registrationLastName);
        Assert.assertTrue(element.isDisplayed());
        element.sendKeys("xyz");
    }
    public void setDOB(String dob) {
        String[] tokens = dob.split("/");

        //day selection
        Select e = new Select(driver.findElement(By.xpath(Constants.REGISTRATION_PAGE_DOB_DAY)));;
        e.selectByValue(tokens[0]);

        //month selection
        e = new Select(driver.findElement(By.xpath(Constants.REGISTRATION_PAGE_DOB_MONTH)));;
        e.selectByValue(String.valueOf(Integer.parseInt(tokens[1])));

        //year selection
        e = new Select(driver.findElement(By.xpath(Constants.REGISTRATION_PAGE_DOB_YEAR)));;
        e.selectByValue(tokens[2]);

    }

    public void setEmail() {
        element = waitUntilElementVisible(registrationEmail);
        Assert.assertTrue(element.isDisplayed());
        //String randomEmail = RandomStringUtils.randomAlphanumeric(10).toLowerCase();
        String randomEmail = RandomStringUtils.randomAlphabetic(10).toLowerCase();
        String finalEmail = randomEmail + "@gmail.com";
        element.sendKeys(finalEmail);
        email = finalEmail; // keeping the email for future login
    }

    public void setCompanyName(String companyName) {
        element = waitUntilElementVisible(registrationCompany);
        Assert.assertTrue(element.isDisplayed());
        element.sendKeys(companyName);
    }

    public void setNewsletter(String status) {
        element = waitUntilElementVisible(registrationNewsletter);
        element.isDisplayed();
        boolean defaultSelection = element.isSelected();

        if(defaultSelection){
            if(status.toLowerCase().equals("unchecked")){
                element.click(); //for unchecking
            }
        }
        else{
            if(status.toLowerCase().equals("checked")){
                element.click(); //for checked
            }
        }
    }

    public void setPasswordAndConfirmPassword(String pass) {
        element = waitUntilElementVisible(registrationPassword);
        element.isDisplayed();
        element.sendKeys(pass);

        element = waitUntilElementVisible(registrationConfirmPassword);
        element.isDisplayed();
        element.sendKeys(pass);
        password = pass; //keeping the password for future login
    }

    public void clickOnRegistrationSubmitButton() {
        element = waitUntilElementVisible(registrationRegisterButton);
        element.isDisplayed();
        element.click();
    }

    public void registrationSuccessValidation(String msg) {
        element = waitUntilElementVisible(registrationSuccessMessage);
        Assert.assertEquals(msg, element.getText().trim());
        element = waitUntilElementVisible(logoutButton);
        Assert.assertTrue(element.isDisplayed());
    }


}
