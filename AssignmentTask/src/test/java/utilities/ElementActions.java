package utilities;

import env.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

import javax.swing.*;
import java.time.Duration;
import java.util.Random;

public class ElementActions extends Base {
    public static WebElement element = null;
    public static WebElement findAndWaitForTheElement(By locator)
    {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element = driver.findElement(locator);
        }
        catch (Exception e)
        {
            System.out.println("Element not Found");
        }
        return  element;

    }
    public static void hoverElement(By locator)
    {
        //WebElement el = findAndWaitForTheElement(locator);
        Actions act = new Actions(driver);
        act.moveToElement(findAndWaitForTheElement(locator)).perform();
    }
    public static void clickOnItem(By locator)
    {
        findAndWaitForTheElement(locator).click();
    }
    public static void clearField(By locator)
    {
        findAndWaitForTheElement(locator).sendKeys(Keys.BACK_SPACE);
    }
    public static void sendText(By locator, String text)
    {
        findAndWaitForTheElement(locator).sendKeys(text);
    }
//    public static boolean visibilityCheck(By locator)
//    {
//        return findAndWaitForTheElement(locator).isDisplayed();
//    }
    public static void selectFromDropDown(By locator, String text)
    {
        Select dropdown = new Select(findAndWaitForTheElement(locator));
        dropdown.selectByVisibleText(text);
    }
    public static void selectFromDropDownByValue(By locator, String text)
    {
        Select dropdown = new Select(findAndWaitForTheElement(locator));
        dropdown.selectByValue(text);
    }
    public static String getText(By locator)
    {
        return findAndWaitForTheElement(locator).getText();
    }
    public static String generateEmailDynamically()
    {
        Random ra = new Random();
        return ("jondoe"+ra.nextInt(500)+"@gmail.com");
    }
//    public static boolean tabTitleCheck(String expectedTitle)
//    {
//        String actualTitle = driver.getTitle();
//        return actualTitle.equalsIgnoreCase(expectedTitle);
//    }

}
