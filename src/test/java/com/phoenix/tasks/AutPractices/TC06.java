package com.phoenix.tasks.AutPractices;

import com.github.javafaker.Faker;
import com.phoenix.pages.AutomationContactPage;
import com.phoenix.utilities.Driver;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC06 {

    @Test
    public void test06() {

        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        AutomationContactPage page = new AutomationContactPage();

        // 3. Verify that home page is visible successfully
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Automation Exercise"));

        // 4. Click on 'Contact Us' button
        page.contactUslink.click();

        // 5. Verify 'GET IN TOUCH' is visible
        Assert.assertTrue(page.getİnTouchHeader.isDisplayed());

        // 6. Enter name, email, subject and message
        Faker faker = new Faker();

        page.name.sendKeys(faker.name().fullName());
        page.email.sendKeys(faker.internet().emailAddress());
        page.subject.sendKeys(faker.expression("QA"));
        page.messageBox.sendKeys(faker.chuckNorris().fact());


        // 7. Upload file
        String path = "C:/Users/Hp/Desktop/SDET Course/test.txt";
        page.upload.sendKeys(path);

        // 8. Click 'Submit' button
        page.submit.click();

        // 9. Click OK button
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

        // 10. Verify success message 'Success! Your details have been submitted successfully.' is visible
       Assert.assertTrue(page.message.isDisplayed());

        // 11. Click 'Home' button and verify that landed to home page successfully
        page.homeLink.click();

        Assert.assertTrue(Driver.getDriver().getTitle().equals("Automation Exercise"));

    }
}
