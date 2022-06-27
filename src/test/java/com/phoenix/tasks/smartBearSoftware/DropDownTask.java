package com.phoenix.tasks.smartBearSoftware;

import com.phoenix.utilities.BrowserUtils;
import com.phoenix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTask {


    @BeforeMethod
    public void setup() {

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    @Test
    public void test1() {

        Driver.getDriver().findElement(By.xpath("//a[.='Order']")).click();
        WebElement dropDownElement = Driver.getDriver().findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']"));
        Select dropDown = new Select(dropDownElement);

        String expectedValue = "MyMoney";
        String actualValue = dropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualValue, expectedValue, "Default Option Test Failed");

        dropDown.selectByVisibleText("FamilyAlbum");
        BrowserUtils.sleep(2);

        Assert.assertEquals(dropDown.getFirstSelectedOption().getText(), "FamilyAlbum");

        WebElement quantityBox = Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));

        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(quantityBox).sendKeys("2").perform();

        Driver.getDriver().findElement(By.xpath("//input[@value='Calculate']")).click();

    }

}
