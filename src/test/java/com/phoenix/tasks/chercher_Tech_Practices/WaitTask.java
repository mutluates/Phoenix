package com.phoenix.tasks.chercher_Tech_Practices;

import com.phoenix.pages.WaitPage;
import com.phoenix.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitTask {

    WaitPage page;
    WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        Driver.getDriver().get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        page = new WaitPage();
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(12));

    }

    @Test
    public void test1() {

        page.alertButton.click();
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }

    @Test
    public void test2(){

        page.displayButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(page.hiddenEnableButton));
        Assert.assertTrue(page.hiddenEnableButton.isEnabled());

    }

    @Test
    public void test3(){

        page.enableButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(page.disableButton));
        Assert.assertTrue(page.disableButton.isEnabled());

    }


}
