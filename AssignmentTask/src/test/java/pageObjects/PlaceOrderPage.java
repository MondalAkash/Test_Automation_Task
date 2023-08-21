package pageObjects;
import org.openqa.selenium.By;
import utilities.ElementActions;
import java.security.PublicKey;
public class PlaceOrderPage {
    public static By electronicButton = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a");
    public static By cellPhoneButton = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[2]/a");
    public static By lumiaPhone = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/h2/a");
    public static By quantityBox = By.id("product_enteredQuantity_20");
    public static By addToCartButton = By.id("add-to-cart-button-20");
    public static By shoppingCartButton = By.xpath("/html/body/div[5]/div/p/a");
    public static By agreeCheckBox = By.id("termsofservice");
    public static By checkOutButton = By.id("checkout");
    public static By checkOutAsGuestButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]");
    public static By firstName = By.id("BillingNewAddress_FirstName");
    public static By lastName = By.id("BillingNewAddress_LastName");
    public static By email = By.id("BillingNewAddress_Email");
    public static By company = By.id("BillingNewAddress_Company");
    public static By countryDropDown = By.id("BillingNewAddress_CountryId");
    public static By stateDropDown = By.id("BillingNewAddress_StateProvinceId");
    public static By city = By.id("BillingNewAddress_City");
    public static By address1 = By.id("BillingNewAddress_Address1");
    public static By postalCode = By.id("BillingNewAddress_ZipPostalCode");
    public static By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    public static By continueButtonBillingAddress = By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]");
    public static By radioButtonNextDayAir = By.xpath("//*[@id=\"shipping-methods-form\"]/ul/li[2]/div[1]/label");
    public static By continueButtonShippingMethod = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
    public static By radioButtonCreditCard = By.id("paymentmethod_1");
    public static By continueButtonPaymentMethod = By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
    public static By cardTypeDropDown = By.id("CreditCardType");
    public static By cardHolderName = By.id("CardholderName");
    public static By cardNumber = By.id("CardNumber");
    public static By cardExpireDateMonthDropDown = By.id("ExpireMonth");
    public static By cardExpireDateYearDropDown = By.id("ExpireYear");
    public static By cardCode = By.id("CardCode");
    public static By continueButtonPaymentInformation = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button");
    public static By confirmButtonConfirmOrder = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button");
    public static By orderSuccessMessage = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong");

    public static void hoverOnElectronics()
    {
        ElementActions.hoverElement(electronicButton);
    }
    public static void selectCellPhone()
    {
        ElementActions.clickOnItem(cellPhoneButton);
    }
    public static void selectLumiaPhone()
    {
        ElementActions.clickOnItem(lumiaPhone);
    }
    public static void updateQuantity(String text)
    {
        ElementActions.clearField(quantityBox);
        ElementActions.sendText(quantityBox, text);
    }
    public static void clickAddToCart()
    {
        ElementActions.clickOnItem(addToCartButton);
    }
    public static void clickShoppingCart()
    {
        ElementActions.clickOnItem(shoppingCartButton);
    }
    public static void clickAgreeCheckBox()
    {
        ElementActions.clickOnItem(agreeCheckBox);
    }
    public static void clickCheckout()
    {
        ElementActions.clickOnItem(checkOutButton);
    }
    public static void clickCheckoutAsGuest()
    {
        ElementActions.clickOnItem(checkOutAsGuestButton);
    }
    public static void fillFirstName(String value)
    {
        ElementActions.sendText(firstName, value);
    }
    public static void fillLastName(String value)
    {
        ElementActions.sendText(lastName, value);
    }
    public static void fillEmail(String value)
    {
        ElementActions.sendText(email, value);
    }
    public static void fillCompany(String value)
    {
        ElementActions.sendText(company, value);
    }
    public static void selectCountry(String value)
    {
        ElementActions.selectFromDropDown(countryDropDown, value);
    }
    public static void selectProvince(String value)
    {
        ElementActions.selectFromDropDown(stateDropDown, value);
    }
    public static void fillCity(String value)
    {
        ElementActions.sendText(city, value);
    }
    public static void fillAddress1(String value)
    {
        ElementActions.sendText(address1, value);
    }
    public static void fillPostalCode(String value)
    {
        ElementActions.sendText(postalCode, value);
    }
    public static void fillPhoneNumber(String value)
    {
        ElementActions.sendText(phoneNumber, value);
    }
    public static void clickContinueButtonBillingAddress()
    {
        ElementActions.clickOnItem(continueButtonBillingAddress);
    }
    public static void clickRadioButtonNextDayAir()
    {
        ElementActions.clickOnItem(radioButtonNextDayAir);
    }
    public static void clickContinueButtonShippingMethod()
    {
        ElementActions.clickOnItem(continueButtonShippingMethod);
    }
    public static void clickCreditCard()
    {
        ElementActions.clickOnItem(radioButtonCreditCard);
    }
    public static void clickContinueButtonPaymentMethod()
    {
        ElementActions.clickOnItem(continueButtonPaymentMethod);
    }
    public static void selectCreditCard(String value)
    {
        ElementActions.selectFromDropDown(cardTypeDropDown, value);
    }
    public static void fillCardHolderName(String value)
    {
        ElementActions.sendText(cardHolderName, value);
    }
    public static void fillCardNumber(String value)
    {
        ElementActions.sendText(cardNumber, value);
    }
    public static void selectCardExpireMonth(String value)
    {
        ElementActions.selectFromDropDown(cardExpireDateMonthDropDown, value);
    }
    public static void selectCardExpirationYear(String value)
    {
        ElementActions.selectFromDropDown(cardExpireDateYearDropDown, value);
    }
    public static void fillCardCode(String value)
    {
        ElementActions.sendText(cardCode, value);
    }
    public static void clickContinueButtonPaymentInformation()
    {
        ElementActions.clickOnItem(continueButtonPaymentInformation);
    }
    public static void clickConfirmButton()
    {
        ElementActions.clickOnItem(confirmButtonConfirmOrder);
    }
    public static String findSuccessMessage()
    {
        return ElementActions.getText(orderSuccessMessage);
    }
}
