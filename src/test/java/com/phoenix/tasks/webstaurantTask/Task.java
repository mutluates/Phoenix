package com.phoenix.tasks.webstaurantTask;

import com.phoenix.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Task {

    SearchPage page =new SearchPage();

    @BeforeMethod
    public void setup(){

        Driver.getDriver().get("https://www.webstaurantstore.com/");

    }




    @Test
    public void task1(){

        page.searchBox.sendKeys("stainless work table" + Keys.ENTER);

        List<WebElement> products = page.productDescription;

        for (WebElement each : products) {

            Assert.assertTrue(each.getText().toLowerCase().contains("table"));

        }

    }

    @Test
    public void task2(){




    }

}
