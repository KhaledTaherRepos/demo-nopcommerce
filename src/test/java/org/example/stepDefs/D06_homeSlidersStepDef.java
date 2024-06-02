package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homepage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_homeSlidersStepDef {

    P03_homepage homepage = new P03_homepage();


    @Given("first slider is clickable")
    public void first_slider_is_clickable() throws InterruptedException {
        homepage.slider.findElement(By.cssSelector("a[]")).click();
        Thread.sleep(2000);

    }


    @Then("navigate to the selected item page")
    public void navigateToTheSelectedItemPage() {
        String actualurl= Hooks.driver.getCurrentUrl();
        String expectedurl = "https://demo.nopcommerce.com/iphone14";
        Assert.assertEquals(expectedurl,actualurl);
    }


    @Given("second slider is clickable")
    public void secondSliderIsClickable() throws InterruptedException {
        homepage.slider.findElement(By.cssSelector("div[id=\"nivo-slider\"] a")).click();
        Thread.sleep(2000);

    }

    @Then("navigate to the selected item")
    public void navigateToTheSelectedItem() {

        String actualurl= Hooks.driver.getCurrentUrl();
        String expectedurl = "https://demo.nopcommerce.com/samsungs22";
        Assert.assertEquals(expectedurl,actualurl);
    }
}
