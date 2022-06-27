package com.phoenix.tasks.cydeoPractices;

import com.phoenix.utilities.BrowserUtils;
import com.phoenix.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class task1 {

    @Test
    public void test1(){

        Driver.getDriver().get(" https://www.webstaurantstore.com/search/stainless-work-table.html");

        WebElement firstElement = Driver.getDriver().findElement(By.xpath("(//input[@name='addToCartButton'])[2]"));
        firstElement.click();

        WebElement secondElement = Driver.getDriver().findElement(By.xpath("(//input[@name='addToCartButton'])[1]"));
        secondElement.click();

        WebElement cart = Driver.getDriver().findElement(By.xpath("(//span[@class='hidden xsl:inline'])[1]"));


     //  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(25));

      // wait.until(ExpectedConditions.elementToBeClickable(cart));

        BrowserUtils.sleep(15);
        cart.click();

        WebElement removeElement =Driver.getDriver().findElement(By.xpath("//button[@title='Remove Regency 30\" x 72\" 18-Gauge 304 Stainless Steel Commercial Work Table with Galvanized Legs and Undershelf from Cart']//*[name()='svg']"));
        removeElement.click();









    }

}
