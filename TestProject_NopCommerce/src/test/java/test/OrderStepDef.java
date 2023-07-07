package test;

import framework.ParentScenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepDef extends ParentScenario {

    @When("User click {string} option from {string} category")
    public void user_click_option_from_category(String option, String category) {
        //basePage.login();
        orderPage.categoryAndOptionSelection(option, category);
    }

    @When("User click on the {string} for product details")
    public void user_click_on_the_for_product_details(String productName) {
        orderPage.selectProduct(productName);
    }

    @When("User set the quantity number {int} in the quantity field")
    public void user_set_the_quantity_number_in_the_quantity_field(Integer quantity) {
        orderPage.setQuantity(quantity);
    }

    @When("User click on the {string} button")
    public void user_click_on_the_button(String cart) {
        orderPage.clickAddToCartButton(cart);
    }

    @When("User go to the shipping cart page")
    public void user_go_to_the_shipping_cart_page() throws InterruptedException {
        orderPage.closeAlert();
        orderPage.goToCartPage();
    }

    @When("User accept terms conditions and click checkout button")
    public void user_accept_terms_conditions_and_click_checkout_button() {
        orderPage.acceptTermsAndCondition();
        orderPage.clickCheckoutButton();
    }

    @When("User click checkout as guest button")
    public void user_click_checkout_as_guest_button() {
        orderPage.clickCheckoutAsGuestButton();
    }

    @When("User input all the billing details and click continue")
    public void user_input_all_the_billing_details_and_click_continue() throws InterruptedException {
        orderPage.completeBillingDetails();
    }

    @When("User select shipping method {string} and click continue")
    public void user_select_shipping_method_and_click_continue(String shippingMethod) {
        orderPage.selectShippingMethod(shippingMethod);
    }

    @When("User select payment method {string} and click continue")
    public void user_select_payment_method_and_click_continue(String paymentMethod) {
        orderPage.selectPaymentMethod(paymentMethod);
    }

    @When("User select {string} card and input card information")
    public void user_select_card_and_input_card_information(String card) {
        orderPage.setCardInformation(card);
    }

    @When("User click confirm button to place the order")
    public void user_click_confirm_button_to_place_the_order() {
        orderPage.placeOrder();
    }

    @Then("Verify that the order place message {string} is displayed")
    public void verify_that_the_order_place_message_is_displayed(String msg) {
        orderPage.verifyOrderConfirmation(msg);
    }
}
