package com.phoenix.pages;

import com.phoenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationMainPage {

    public AutomationMainPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[normalize-space()='Home']")
    public WebElement homeLink;

    @FindBy(linkText = " Products")
    public WebElement productsLink;

    @FindBy(linkText = " Cart")
    public WebElement cartLink;

    @FindBy(linkText = " Signup / Login")
    public WebElement signupLoginLink;

    @FindBy(xpath = "//a[.=' Contact us']")
    public WebElement contactUslink;

    @FindBy(xpath = "(//i[@class='fa fa-angle-up'])[1]")
    public WebElement scrollUpButton;

    @FindBy(xpath = "//h2[text()='Subscription']")
    public WebElement subscription;

    @FindBy(xpath = "//h2[text()='Full-Fledged practice website for Automation Engineers']")
    public WebElement pageMessage;

}
