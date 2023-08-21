package testCases;
import env.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PlaceOrderPage;
import utilities.ElementActions;

public class PlaceOrderTest extends Base{
    @Test(description = "Guest User Order Place")
    public void TC001() throws InterruptedException
    {
        PlaceOrderPage.hoverOnElectronics();
        Thread.sleep(1000);
        PlaceOrderPage.selectCellPhone();
        Thread.sleep(1000);
        PlaceOrderPage.selectLumiaPhone();
        Thread.sleep(1000);
        PlaceOrderPage.updateQuantity("2");
        Thread.sleep(1000);
        PlaceOrderPage.clickAddToCart();
        Thread.sleep(1000);
        PlaceOrderPage.clickShoppingCart();
        Thread.sleep(1000);
        PlaceOrderPage.clickAgreeCheckBox();
        Thread.sleep(1000);
        PlaceOrderPage.clickCheckout();
        Thread.sleep(1000);
        PlaceOrderPage.clickCheckoutAsGuest();
        Thread.sleep(1000);
        PlaceOrderPage.fillFirstName("Jon");
        Thread.sleep(1000);
        PlaceOrderPage.fillLastName("Doe");
        Thread.sleep(1000);
        PlaceOrderPage.fillEmail(ElementActions.generateEmailDynamically());
        Thread.sleep(1000);
        PlaceOrderPage.fillCompany("JD Enterprise");
        Thread.sleep(1000);
        PlaceOrderPage.selectCountry("United States");
        Thread.sleep(4000);
        PlaceOrderPage.selectProvince("Alaska");
        Thread.sleep(1000);
        PlaceOrderPage.fillCity("Fairbanks");
        Thread.sleep(1000);
        PlaceOrderPage.fillAddress1("25/0/B, Fairbanks, Alaska, US");
        Thread.sleep(1000);
        PlaceOrderPage.fillPostalCode("1219");
        Thread.sleep(1000);
        PlaceOrderPage.fillPhoneNumber("01700000000");
        Thread.sleep(1000);
        PlaceOrderPage.clickContinueButtonBillingAddress();
        Thread.sleep(1000);
        PlaceOrderPage.clickRadioButtonNextDayAir();
        Thread.sleep(1000);
        PlaceOrderPage.clickContinueButtonShippingMethod();
        Thread.sleep(1000);
        PlaceOrderPage.clickCreditCard();
        Thread.sleep(1000);
        PlaceOrderPage.clickContinueButtonPaymentMethod();
        Thread.sleep(1000);
        PlaceOrderPage.selectCreditCard("Visa");
        Thread.sleep(1000);
        PlaceOrderPage.fillCardHolderName("Jon Doe");
        Thread.sleep(1000);
        PlaceOrderPage.fillCardNumber("4810821423602581");
        Thread.sleep(1000);
        PlaceOrderPage.selectCardExpireMonth("08");
        Thread.sleep(1000);
        PlaceOrderPage.selectCardExpirationYear("2029");
        Thread.sleep(1000);
        PlaceOrderPage.fillCardCode("848");
        Thread.sleep(1000);
        PlaceOrderPage.clickContinueButtonPaymentInformation();
        PlaceOrderPage.clickConfirmButton();
        Thread.sleep(1000);
        String expectedMessage = "Your order has been successfully processed!";
        String actualMessage = PlaceOrderPage.findSuccessMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
