package com.phoenix.tasks.AutPractices;

import com.phoenix.pages.AutomationMainPage;
import com.phoenix.utilities.BrowserUtils;
import com.phoenix.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC25 {

    AutomationMainPage page;
    WebDriverWait wait;

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get("http://automationexercise.com");
        page = new AutomationMainPage();
    }



    @Test
    public void task1(){

         // 3. Verify that home page is visible successfully
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Automation Exercise"));

        // 4. Scroll down page to bottom
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(page.subscription).perform();

        // 5. Verify 'SUBSCRIPTION' is visible
        Assert.assertTrue(page.subscription.isDisplayed());

        // 6. Click on arrow at bottom right side to move upward
        BrowserUtils.sleep(2);
        page.scrollUpButton.click();

        // 7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
        Assert.assertTrue(page.pageMessage.isDisplayed());

    }

    @Test
    public void task2(){

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();

        BrowserUtils.sleep(2);
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

    }

    @Test
    public void task3(){

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0, 2000)");

        BrowserUtils.sleep(2);
        js.executeScript("window.scrollBy(0, -1000)");

    }



}
