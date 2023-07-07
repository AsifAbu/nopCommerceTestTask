package framework;

public class Constants {
    //credentials


    //urls
    public static final String HOME_PAGE_URL = "https://training.nop-station.com/";
    public static final String REGISTRATION_PAGE_URL = "https://training.nop-station.com/register?returnUrl=%2F";


    //xpaths
    public static final String REGISTRATION_BUTTON = "//div[@class='header']/div[@class='header-upper']//div[@class='header-links']//li/a[contains(.,'Register')]";
    public static final String REGISTRATION_PAGE_LABEL = "//div[@class='page-title']/h1[contains(.,'Register')]";
    public static final String REGISTRATION_GENDER_MALE = "//div[contains(@class, 'registration-page')]//form[@method='post']//div[@class='inputs']/label[contains(.,'Gender')]/following-sibling::div[@id='gender'][1]//input[@type='radio' and @id='gender-male']";
    public static final String REGISTRATION_GENDER_FEMALE = "//div[contains(@class, 'registration-page')]//form[@method='post']//div[@class='inputs']/label[contains(.,'Gender')]/following-sibling::div[@id='gender'][1]//input[@type='radio' and @id='gender-female']";
    public static final String REGISTRATION_GENDER_MALE_SELECTED = "//div[contains(@class, 'registration-page')]//form[@method='post']//div[@class='inputs']/label[contains(.,'Gender')]/following-sibling::div[@id='gender'][1]/span/input[@type='radio' and @id='gender-male' and contains(@data-gtm-form-interact-field-id, '0')]";
    public static final String REGISTRATION_GENDER_FEMALE_SELECTED = "//div[contains(@class, 'registration-page')]//form[@method='post']//div[@class='inputs']/label[contains(.,'Gender')]/following-sibling::div[@id='gender'][1]/span/input[@type='radio' and @id='gender-female' and contains(@data-gtm-form-interact-field-id, '0')]";
    public static final String REGISTRATION_PAGE_FIRSTNAME = "//input[@id='FirstName']";
    public static final String REGISTRATION_PAGE_LASTNAME = "//input[@id='LastName']";
    public static final String REGISTRATION_PAGE_DOB_DAY = "//select[@name='DateOfBirthDay']";
    public static final String REGISTRATION_PAGE_DOB_MONTH = "//select[@name='DateOfBirthMonth']";
    public static final String REGISTRATION_PAGE_DOB_YEAR = "//select[@name='DateOfBirthYear']";
    public static final String REGISTRATION_PAGE_EMAIL = "//input[@id='Email']";
    public static final String REGISTRATION_PAGE_COMPANY = "//input[@id='Company']";
    public static final String REGISTRATION_PAGE_NEWSLETTER = "//input[@id='Newsletter']";
    public static final String REGISTRATION_PAGE_PASSWORD = "//input[@id='Password']";
    public static final String REGISTRATION_PAGE_CONFIRMPASSWORD = "//input[@id='ConfirmPassword']";
    public static final String REGISTRATION_PAGE_REGISTER_BUTTON = "//button[@id='register-button']";
    public static final String LOGOUT_BUTTON = "//div[@class='header-links']//li/a[@href='/logout' and contains(.,'Log out')]";
    public static final String LOGIN_BUTTON = "//div[@class='header-links']//li/a[contains(.,'Log in') and @class='ico-login']";
    public static final String REGISTRATION_COMPLETE_MESSAGE_XPATH = "//div[@class='result' and normalize-space()]";
    public static final String LOGIN_EMAIL = "//input[@id='Email']";
    public static final String LOGIN_PASSWORD = "//input[@id='Password']";
    public static final String LOGIN_SUBMIT_BUTTON = "//button[@type='submit' and contains(@class,'login-button')]";

    public static final String CATEGORY_ELECTRONICS = "//div[@class='header-menu']/ul[contains(@class, 'notmobile')]/li/a[@href='/electronics' and contains(.,'Electronics')]";
    public static final String ELECTRONIC_OPTION_CELLPHONE = "//div[@class='sub-category-item']//a[@href='/cell-phones' and contains(.,'Cell phones')]";
    public static final String CELLPHONE_PAGETITLE = "//div[@class='page-title']/h1[contains(.,'Cell phones')]";
    public static final String CELLPHONE_SELECTION = "//div[@class='product-item']/div[@class='picture']//a[@href='/nokia-lumia-1020']";
    public static final String CELLPHONE_QUANTITY = "//input[@id='product_enteredQuantity_20']";
    public static final String ADD_TO_CART_BUTTON = "//button[@id='add-to-cart-button-20']";
    public static final String CLOSE_ALERT_BUTTON = "//div[@id='bar-notification']//span[@class='close' and @title='Close']";
    public static final String SHOPPING_CART_BUTTON = "//li[@id='topcartlink']/a[@href='/cart']";
    public static final String CART_TERMS_AND_CONDITION = "//input[@id='termsofservice']";
    public static final String CART_CHECKOUT_BUTTON = "//button[@id='checkout']";
    public static final String CHECKOUT_GUEST_BUTTON = "//button[contains(@class,'checkout-as-guest-button')]";
    public static final String BILLING_FIRST_NAME = "//input[@id='BillingNewAddress_FirstName']";
    public static final String BILLING_LAST_NAME = "//input[@id='BillingNewAddress_LastName']";
    public static final String BILLING_EMAIL = "//input[@id='BillingNewAddress_Email']";
    public static final String BILLING_COUNTRY = "//select[@id='BillingNewAddress_CountryId']";
    public static final String BILLING_STATE = "//select[@id='BillingNewAddress_StateProvinceId']";
    public static final String BILLING_CITY = "//input[@id='BillingNewAddress_City']";
    public static final String BILLING_ADDRESS1 = "//input[@id='BillingNewAddress_Address1']";
    public static final String BILLING_ZIP = "//input[@id='BillingNewAddress_ZipPostalCode']";
    public static final String BILLING_PHONE_NUMBER = "//input[@id='BillingNewAddress_PhoneNumber']";
    public static final String BILLING_CONTINUE = "//button[@name='save' and contains(@onclick,'Billing.save()')]";
    public static final String SHIPPING_METHOD_NEXT_DAY_BY_AIR = "//input[@id='shippingoption_1']";
    public static final String SHIPPING_CONTINUE = "//button[contains(@onclick,'ShippingMethod.save()')]";
    public static final String PAYMENT_METHOD_CREDIT_CARD = "//input[@id='paymentmethod_1' and @name='paymentmethod']";
    public static final String PAYMENT_CONTINUE = "//button[contains(@onclick,'PaymentMethod.save()')]";
    public static final String CARD_TYPE_SELECT = "//select[@id='CreditCardType']";
    public static final String CARD_CARDHOLDER_NAME = "//input[@id='CardholderName']";
    public static final String CARD_NUMBER = "//input[@id='CardNumber']";
    public static final String CARD_EXPIRATION_MONTH = "//select[@id='ExpireMonth']";
    public static final String CARD_EXPIRATION_YEAR = "//select[@id='ExpireYear']";
    public static final String CARD_CVV_NUMBER = "//input[@id='CardCode']";
    public static final String CARD_CONTINUE = "//button[@onclick='PaymentInfo.save()']";
    public static final String ORDER_CONFIRM_CONTINUE = "//button[@onclick='ConfirmOrder.save()']";
    public static final String PRODUCT_NAME_VALIDATION = "//table[@class='cart']//td[@class='product']/a[normalize-space()]";
    public static final String PRODUCT_QUANTITY_VALIDATION = "//table[@class='cart']//td[@class='quantity']/span[@class='product-quantity' and normalize-space()]";
    public static final String PAYMENT_METHOD_VALIDATION = "//div[@class='payment-method-info']//li[@class='payment-method']/span[@class='value' and normalize-space()]";
    public static final String SHIPPING_METHOD_VALIDATION = "//div[@class='shipping-method-info']//li[@class='shipping-method']/span[@class='value' and normalize-space()]";
    public static final String BILLING_ADDRESS_COUNTRY_VALIDATION = "//div[@class='billing-info']/ul[@class='info-list']/li[@class='country' and normalize-space()]";
    public static final String SHIPPING_ADDRESS_COUNTRY_VALIDATION = "//div[@class='shipping-info']/ul[@class='info-list']/li[@class='country' and normalize-space()]";
    public static final String ORDER_CONFIRMED_MESSAGE = "//div[contains(@class, 'section order-completed')]/div[@class='title']/strong[normalize-space()]";
    public static final String ORDER_CONFIRMED_PAGE_CONTINUE = "//button[contains(@class, 'order-completed-continue-button') and contains(.,'Continue')]";
    public static final String HEADER_LOGO = "//div[@class='header-logo']/a[@href='/']";







}
