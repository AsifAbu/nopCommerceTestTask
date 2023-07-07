package pages;

import framework.Constants;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.Locale;

public class OrderPage extends BasePage{

    @FindBy(xpath = Constants.CATEGORY_ELECTRONICS)
    WebElement categoryElectronics;
    @FindBy(xpath = Constants.ELECTRONIC_OPTION_CELLPHONE)
    WebElement electronicOptionCellphone;
    @FindBy(xpath = Constants.CELLPHONE_PAGETITLE)
    WebElement cellphonePageTitle;
    @FindBy(xpath = Constants.CELLPHONE_SELECTION)
    WebElement cellphoneSelection;
    @FindBy(xpath = Constants.CELLPHONE_QUANTITY)
    WebElement cellphoneQuantity;
    @FindBy(xpath = Constants.ADD_TO_CART_BUTTON)
    WebElement addToCartButton;
    @FindBy(xpath = Constants.CLOSE_ALERT_BUTTON)
    WebElement closeAlertButton;
    @FindBy(xpath = Constants.SHOPPING_CART_BUTTON)
    WebElement shoppingCartButton;
    @FindBy(xpath = Constants.CART_TERMS_AND_CONDITION)
    WebElement cartTermsAndConditionButton;
    @FindBy(xpath = Constants.CART_CHECKOUT_BUTTON)
    WebElement cartCheckoutButton;
    @FindBy(xpath = Constants.CHECKOUT_GUEST_BUTTON)
    WebElement checkoutAsGuestButton;

    @FindBy(xpath = Constants.BILLING_FIRST_NAME)
    WebElement billingFirstName;
    @FindBy(xpath = Constants.BILLING_LAST_NAME)
    WebElement billingLastName;
    @FindBy(xpath = Constants.BILLING_EMAIL)
    WebElement billingEmail;
    @FindBy(xpath = Constants.BILLING_CITY)
    WebElement billingCity;
    @FindBy(xpath = Constants.BILLING_ADDRESS1)
    WebElement billingAddress1;
    @FindBy(xpath = Constants.BILLING_ZIP)
    WebElement billingZip;
    @FindBy(xpath = Constants.BILLING_PHONE_NUMBER)
    WebElement billingPhoneNumber;
    @FindBy(xpath = Constants.BILLING_CONTINUE)
    WebElement billingContinue;
    @FindBy(xpath = Constants.SHIPPING_METHOD_NEXT_DAY_BY_AIR)
    WebElement shippingMethod;
    @FindBy(xpath = Constants.SHIPPING_CONTINUE)
    WebElement shippingContinue;
    @FindBy(xpath = Constants.PAYMENT_METHOD_CREDIT_CARD)
    WebElement paymentMethod;
    @FindBy(xpath = Constants.PAYMENT_CONTINUE)
    WebElement paymentContinue;
    @FindBy(xpath = Constants.CARD_CARDHOLDER_NAME)
    WebElement cardHolderName;
    @FindBy(xpath = Constants.CARD_NUMBER)
    WebElement cardNumber;
    @FindBy(xpath = Constants.CARD_CVV_NUMBER)
    WebElement cardCVVNumber;
    @FindBy(xpath = Constants.CARD_CONTINUE)
    WebElement cardContinue;
    @FindBy(xpath = Constants.ORDER_CONFIRM_CONTINUE)
    WebElement orderConfirmContinue;
    @FindBy(xpath = Constants.PRODUCT_NAME_VALIDATION)
    WebElement productNameValidation;
    @FindBy(xpath = Constants.PRODUCT_QUANTITY_VALIDATION)
    WebElement productQuantityValidation;
    @FindBy(xpath = Constants.PAYMENT_METHOD_VALIDATION)
    WebElement paymentMethodValidation;
    @FindBy(xpath = Constants.SHIPPING_ADDRESS_COUNTRY_VALIDATION)
    WebElement shippingCountryValidation;
    @FindBy(xpath = Constants.BILLING_ADDRESS_COUNTRY_VALIDATION)
    WebElement billingCountryValidation;
    @FindBy(xpath = Constants.SHIPPING_METHOD_VALIDATION)
    WebElement shippingMethodValidation;
    @FindBy(xpath = Constants.ORDER_CONFIRMED_MESSAGE)
    WebElement orderConfirmedMessage;
    @FindBy(xpath = Constants.ORDER_CONFIRMED_PAGE_CONTINUE)
    WebElement orderConfirmedPageContinue;
    @FindBy(xpath = Constants.HEADER_LOGO)
    WebElement headerLogo;



    public OrderPage(WebDriver driver) {
        super(driver);
    }

    public void categoryAndOptionSelection(String option, String category) {

        // option and category can be dynamic. But for this scenario, this not needed. So, keeping the xpath static

        element = waitUntilElementVisible(categoryElectronics);
        element.click();
        element = waitUntilElementVisible(electronicOptionCellphone);
        element.click();

        element = waitUntilElementVisible(cellphonePageTitle);
        Assert.assertEquals("Cell phones", element.getText().trim());
    }

    public void selectProduct(String productName) {

        // option and category can be dynamic. But for this scenario, this not needed. So, keeping the xpath static

        element = waitUntilElementVisible(cellphoneSelection);
        element.click();

        element = waitUntilElementVisible(addToCartButton);
        Assert.assertTrue(element.isDisplayed());
    }

    public void setQuantity(Integer quantity) {
        element = waitUntilElementVisible(cellphoneQuantity);
        element.clear();
        element.sendKeys(String.valueOf(quantity));
    }

    public void clickAddToCartButton(String cart) {
        element = waitUntilElementVisible(addToCartButton);
        element.click();
    }

    public void closeAlert() throws InterruptedException {
        element = waitUntilElementVisible(closeAlertButton);
        element.click();
        Thread.sleep(1000); //need that sleep because the success alert hides slowly
    }
    public void goToCartPage() {
        element = waitUntilElementVisible(shoppingCartButton);
        element.click();
    }

    public void acceptTermsAndCondition() {
        element = waitUntilElementVisible(cartTermsAndConditionButton);
        boolean flag = element.isSelected();
        if(!flag){
            element.click();
        }
    }

    public void clickCheckoutButton() {
        element = waitUntilElementVisible(cartCheckoutButton);
        element.click();
    }

    public void clickCheckoutAsGuestButton() {
        element = waitUntilElementVisible(checkoutAsGuestButton);
        element.click();
    }

    public void completeBillingDetails() throws InterruptedException {
        element = waitUntilElementVisible(billingFirstName);
        element.sendKeys("abc");
        element = waitUntilElementVisible(billingLastName);
        element.sendKeys("xyz");
        element = waitUntilElementVisible(billingEmail);
        element.sendKeys("abc.xyz@gmail.com");

        Select e = new Select(driver.findElement(By.xpath(Constants.BILLING_COUNTRY)));;
        e.selectByVisibleText("Bangladesh");
        Thread.sleep(500);
        e = new Select(driver.findElement(By.xpath(Constants.BILLING_STATE)));
        e.selectByValue("70");

        element = waitUntilElementVisible(billingCity);
        element.sendKeys("Dhaka");
        element = waitUntilElementVisible(billingAddress1);
        element.sendKeys("Khilkhet");
        element = waitUntilElementVisible(billingZip);
        element.sendKeys("1229");
        element = waitUntilElementVisible(billingPhoneNumber);
        element.sendKeys("01799999999");
        element = waitUntilElementVisible(billingContinue);
        element.click();
    }

    public void selectShippingMethod(String method) {
        element = waitUntilElementVisible(shippingMethod);
        element.click();
        element = waitUntilElementVisible(shippingContinue);
        element.click();
    }

    public void selectPaymentMethod(String method) {
        element = waitUntilElementVisible(paymentMethod);
        element.click();
        element = waitUntilElementVisible(paymentContinue);
        element.click();
    }

    public void setCardInformation(String card) {
        Select e = new Select(driver.findElement(By.xpath(Constants.CARD_TYPE_SELECT)));;
        e.selectByValue(card.toLowerCase());
        element = waitUntilElementVisible(cardHolderName);
        element.sendKeys("abc xyz");
        element = waitUntilElementVisible(cardNumber);
        element.sendKeys("0000000000000000");
        e = new Select(driver.findElement(By.xpath(Constants.CARD_EXPIRATION_MONTH)));;
        e.selectByValue("6");
        e = new Select(driver.findElement(By.xpath(Constants.CARD_EXPIRATION_YEAR)));;
        e.selectByValue("2030");
        element = waitUntilElementVisible(cardCVVNumber);
        element.sendKeys("123");
        element = waitUntilElementVisible(cardContinue);
        element.click();
    }

    public void placeOrder() {
        element = waitUntilElementVisible(productNameValidation);
        Assert.assertEquals("Nokia Lumia 1020", element.getText().trim());
        element = waitUntilElementVisible(productQuantityValidation);
        Assert.assertEquals("2", element.getText().trim());
        element = waitUntilElementVisible(paymentMethodValidation);
        Assert.assertEquals("Credit Card", element.getText().trim());
        element = waitUntilElementVisible(shippingMethodValidation);
        Assert.assertEquals("Next Day Air", element.getText().trim());
        element = waitUntilElementVisible(billingCountryValidation);
        Assert.assertEquals("Bangladesh", element.getText().trim());
        element = waitUntilElementVisible(shippingCountryValidation);
        Assert.assertEquals("Bangladesh", element.getText().trim());

        element = waitUntilElementVisible(orderConfirmContinue);
        element.click();

    }

    public void verifyOrderConfirmation(String msg) {
        element = waitUntilElementVisible(orderConfirmedMessage);
        Assert.assertEquals(msg, element.getText().trim());
        element = waitUntilElementVisible(orderConfirmedPageContinue);
        element.click();
        element = waitUntilElementVisible(headerLogo);
        Assert.assertTrue(element.isDisplayed());
    }






}
