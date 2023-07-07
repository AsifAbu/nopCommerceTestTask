package framework;

import org.openqa.selenium.WebDriver;
import pages.*;

public class ParentScenario extends ParentDriver{

    WebDriver driver = getDriver();

    public BasePage basePage = new BasePage(driver);
    public OrderPage orderPage = new OrderPage(driver);
    public RegistrationPage registrationPage = new RegistrationPage(driver);
}
