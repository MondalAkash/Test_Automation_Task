package pageObjects;
import org.openqa.selenium.By;
import utilities.ElementActions;

public class RegistrationPage {
    public static By registerButton = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    public static By genderMaleRadioButton = By.xpath("//*[@id=\"gender\"]/span[1]/label");
    public static By genderFemaleRadioButton = By.xpath("//*[@id=\"gender\"]/span[2]/label");
    public static By firstName = By.id("FirstName");
    public static By lastName = By.id("LastName");
    public static By dobDay = By.name("DateOfBirthDay");
    public static By dobMonth = By.name("DateOfBirthMonth");
    public static By dobYear = By.name("DateOfBirthYear");
    public static By email = By.id("Email");
    public static By companyName = By.id("Company");
    public static By newsletterCheckbox = By.id("Newsletter");
    public static By password = By.id("Password");
    public static By confirmPassword = By.id("ConfirmPassword");
    public static By regButton = By.id("register-button");
    public static By confirmationMessage = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]");

    public static void clickRegisterLink()
    {
        ElementActions.clickOnItem(registerButton);
    }
    public static void selectGender(String value)
    {
        if(value.equalsIgnoreCase("Male"))
        {
            ElementActions.clickOnItem(genderMaleRadioButton);
        }
        else if(value.equalsIgnoreCase("Female"))
        {
            ElementActions.clickOnItem(genderFemaleRadioButton);
        }
    }
    public static void fillFirstName(String value)
    {
        ElementActions.sendText(firstName,value);
    }
    public static void fillLastname(String value)
    {
        ElementActions.sendText(lastName, value);
    }
    public static void selectDobDay(String value)
    {
        ElementActions.selectFromDropDown(dobDay,value);
    }
    public static void selectDobMonth(String value)
    {
        ElementActions.selectFromDropDownByValue(dobMonth,value);
    }
    public static void selectDobYear(String value)
    {
        ElementActions.selectFromDropDownByValue(dobYear,value);
    }
    public static void fillEmail(String value)
    {
        ElementActions.sendText(email, value);
    }
    public static void fillCompanyName(String value)
    {
        ElementActions.sendText(companyName, value);
    }
    public static void selectNewsletterCheckbox(String value)
    {
        if(value.equalsIgnoreCase("unchecked"))
        {
            ElementActions.clickOnItem(newsletterCheckbox);
        }
    }
    public static void fillPassword(String value)
    {
        ElementActions.sendText(password, value);
    }
    public static void fillConfirmPassword(String value)
    {
        ElementActions.sendText(confirmPassword, value);
    }
    public static void clickRegButton()
    {
        ElementActions.clickOnItem(regButton);
    }
    public static String confirmationMessage()
    {
        return ElementActions.getText(confirmationMessage);
    }
}
