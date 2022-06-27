package com.phoenix.tasks.webstaurantTask;

import com.phoenix.pages.WebstaurantHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends WebstaurantHomePage {

    @FindBy(xpath = "//a[@data-testid='itemDescription']")
    public List<WebElement> productDescription;

    @FindBy(xpath = "//a[@data-testid='itemAddCart']")
    public List<WebElement> addCart;

}
