package pages;

import framework.Constants;
import framework.ParentDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends ParentDriver {
    WebDriverWait wait;
    WebElement element;
    //WebElement element2;
    Actions action;

    public String email;
    public String password;

    @FindBy(xpath = Constants.LOGOUT_BUTTON)
    WebElement logoutButton;
    @FindBy(xpath = Constants.LOGIN_BUTTON)
    WebElement loginButton;
    @FindBy(xpath = Constants.LOGIN_SUBMIT_BUTTON)
    WebElement loginSubmitButton;
    @FindBy(xpath = Constants.LOGIN_EMAIL)
    WebElement loginEmail;
    @FindBy(xpath = Constants.LOGIN_PASSWORD)
    WebElement loginPassword;

    public BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        action = new Actions(driver);
    }

    public static void teardownBaseObject() {
        driver.quit();
    }

    //Element click ability check, return webElement from Xpath
    public WebElement waitUntilClickable(String xpathOfTheElement) {
        element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathOfTheElement)));
        return element;
    }

    //Element click ability check, return webElement
    public WebElement waitUntilClickable(WebElement element) {
        element = wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    //Element visibility check, return webElement
    public WebElement waitUntilElementVisible(WebElement element) {
        element = wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    //Element presence check, return boolean
    public boolean elementPresence(String elementLocator) {
        boolean flag;
        flag = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementLocator)));
        return flag;
    }

    public void logout() {
        element = waitUntilElementVisible(logoutButton);
        element.click();

        element = waitUntilElementVisible(loginButton);
        Assert.assertTrue(element.isDisplayed());
    }

    public void login() {
        element = waitUntilElementVisible(loginButton);
        element.click();
        element = waitUntilElementVisible(loginEmail);
        element.sendKeys(email);
        element = waitUntilElementVisible(loginPassword);
        element.sendKeys(password);
        element = waitUntilElementVisible(loginSubmitButton);
        element.click();

        Assert.assertTrue(element.isDisplayed());
    }
}
