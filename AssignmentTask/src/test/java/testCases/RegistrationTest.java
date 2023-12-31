package testCases;

import env.Base;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.RegistrationPage;
import utilities.ElementActions;

public class RegistrationTest extends Base {
    @Test(dataProvider = "credentials")
    public void TC001(String gender, String dobDay, String dobMon, String dobYear, String email, String companyName, String status, String password, String expectedMessage) throws InterruptedException
    {
        RegistrationPage.clickRegisterLink();
        Thread.sleep(1000);
        RegistrationPage.selectGender(gender);
        Thread.sleep(1000);
        RegistrationPage.fillFirstName("Jon");
        Thread.sleep(1000);
        RegistrationPage.fillLastname("Doe");
        Thread.sleep(1000);
        RegistrationPage.selectDobDay(dobDay);
        Thread.sleep(1000);
        RegistrationPage.selectDobMonth(dobMon);
        Thread.sleep(1000);
        RegistrationPage.selectDobYear(dobYear);
        Thread.sleep(1000);
        RegistrationPage.fillEmail(email);
        Thread.sleep(1000);
        RegistrationPage.fillCompanyName(companyName);
        Thread.sleep(1000);
        RegistrationPage.selectNewsletterCheckbox(status);
        Thread.sleep(1000);
        RegistrationPage.fillPassword(password);
        Thread.sleep(1000);
        RegistrationPage.fillConfirmPassword(password);
        RegistrationPage.clickRegButton();
        //System.out.println(expectedMessage);
        String actualMessage = RegistrationPage.confirmationMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    @DataProvider(name = "credentials")
    public Object[][] dataset1()
    {
        return new Object[][]{
                {"Male", "20", "5","1995" , ElementActions.generateEmailDynamically(), "Brainstation-23", "checked", "pass@1234", "Your registration completed"},
                {"Female", "9", "5","1999", ElementActions.generateEmailDynamically(), "Brainstation-23", "unchecked", "pass@1234", "Your registration completed"},
                {"Female", "3", "5","2000", ElementActions.generateEmailDynamically(), "Brainstation-23", "unchecked", "pass@1234", "Your registration completed"},
                {"Male", "2", "5","2001", ElementActions.generateEmailDynamically(), "Brainstation-23", "checked", "pass@1234", "Your registration completed"},
                {"Female", "10", "5","1990", ElementActions.generateEmailDynamically(), "Brainstation-23", "unchecked", "pass@1234", "Your registration completed"}

        };
    }
}
