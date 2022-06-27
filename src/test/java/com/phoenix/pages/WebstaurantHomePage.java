package com.phoenix.pages;

import com.phoenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class WebstaurantHomePage {

    public WebstaurantHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="searchval")
    public WebElement searchBox;

}
