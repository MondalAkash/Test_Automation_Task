package testCases;
import env.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PlaceOrderPage;

public class PlaceOrderTest extends Base{
    @Test(description = "Guest User Order Place")
    public void TC001() throws InterruptedException
    {
        PlaceOrderPage.hoverOnElectronics();
        Thread.sleep(2000);
        PlaceOrderPage.selectCellPhone();
        Thread.sleep(2000);
        PlaceOrderPage.selectLumiaPhone();
        Thread.sleep(2000);
        PlaceOrderPage.updateQuantity("2");
        Thread.sleep(2000);
        PlaceOrderPage.clickAddToCart();
        Thread.sleep(2000);
        PlaceOrderPage.clickShoppingCart();
        Thread.sleep(2000);
        PlaceOrderPage.clickAgreeCheckBox();
        Thread.sleep(2000);
        PlaceOrderPage.clickCheckout();
        Thread.sleep(2000);
        PlaceOrderPage.clickCheckoutAsGuest();
        Thread.sleep(2000);
        PlaceOrderPage.fillFirstName("Jon");
        Thread.sleep(2000);
        PlaceOrderPage.fillLastName("Doe");
        Thread.sleep(2000);
        PlaceOrderPage.fillEmail("jondoe@abc.com");
        Thread.sleep(2000);
        PlaceOrderPage.fillCompany("JD Enterprise");
        Thread.sleep(2000);
        PlaceOrderPage.selectCountry("United States");
        Thread.sleep(4000);
        PlaceOrderPage.selectProvince("Alaska");
        Thread.sleep(2000);
        PlaceOrderPage.fillCity("Fairbanks");
        Thread.sleep(2000);
        PlaceOrderPage.fillAddress1("25/0/B, Fairbanks, Alaska, US");
        Thread.sleep(2000);
        PlaceOrderPage.fillPostalCode("1219");
        Thread.sleep(2000);
        PlaceOrderPage.fillPhoneNumber("01700000000");
        Thread.sleep(2000);
        PlaceOrderPage.clickContinueButtonBillingAddress();
        Thread.sleep(2000);
        PlaceOrderPage.clickRadioButtonNextDayAir();
        Thread.sleep(2000);
        PlaceOrderPage.clickContinueButtonShippingMethod();
        Thread.sleep(2000);
        PlaceOrderPage.clickCreditCard();
        Thread.sleep(2000);
        PlaceOrderPage.clickContinueButtonPaymentMethod();
        Thread.sleep(2000);
        PlaceOrderPage.selectCreditCard("Visa");
        Thread.sleep(2000);
        PlaceOrderPage.fillCardHolderName("Jon Doe");
        Thread.sleep(2000);
        PlaceOrderPage.fillCardNumber("4810821423602581");
        Thread.sleep(2000);
        PlaceOrderPage.selectCardExpireMonth("08");
        Thread.sleep(2000);
        PlaceOrderPage.selectCardExpirationYear("2029");
        Thread.sleep(2000);
        PlaceOrderPage.fillCardCode("848");
        Thread.sleep(2000);
        PlaceOrderPage.clickContinueButtonPaymentInformation();
        PlaceOrderPage.clickConfirmButton();
        Thread.sleep(2000);
        String expectedMessage = "Your order has been successfully processed!";
        String actualMessage = PlaceOrderPage.findSuccessMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
