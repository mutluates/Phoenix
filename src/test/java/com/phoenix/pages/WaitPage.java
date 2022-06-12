package com.phoenix.pages;

import com.phoenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WaitPage {

    public WaitPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="alert")
    public WebElement alertButton;

    @FindBy(xpath = "//button[@id='display-other-button']")
    public WebElement displayButton;

    @FindBy(xpath = "//button[@id='hidden']")
    public WebElement hiddenEnableButton;

    @FindBy(xpath = "//button[@id='enable-button']")
    public WebElement enableButton;

    @FindBy(xpath = "//button[@id='disable']")
    public WebElement disableButton;




}
