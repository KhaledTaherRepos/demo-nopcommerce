package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homepage {


    public List<WebElement> products ;
    public P03_homepage ()
    {
        PageFactory.initElements(Hooks.driver,this);

    }
    @FindBy (id ="customerCurrency")
    WebElement currency;

    public void selectEuroCurrency ()
    {
        Select droplist = new Select(currency);
        droplist.selectByVisibleText("Euro");
        products = Hooks.driver.findElements(By.className("prices")) ;//product-title

    }

    @FindBy (id = "small-searchterms")
    public WebElement search;

    @FindBy (className = "search-box-button")
    public WebElement searchbtn;

    @FindBy (css = "div[id=\"nivo-slider\"][class=\"nivoSlider\"]")
    public WebElement slider;




}
