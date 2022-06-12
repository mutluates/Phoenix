package com.phoenix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationContactPage extends AutomationMainPage {

    @FindBy(xpath = "//h2[text()='Get In Touch']")
    public WebElement getİnTouchHeader;

    @FindBy(name = "name")
    public WebElement name;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "subject")
    public WebElement subject;

    @FindBy(id = "message")
    public WebElement messageBox;

    @FindBy(name = "upload_file")
    public WebElement upload;

    @FindBy(name = "submit")
    public WebElement submit;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement message;



}
