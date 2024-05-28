package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homepage homepage = new P03_homepage();


    @Given("user opens facebook link")
    public void user_opens_facebook_link() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(0));
        Hooks.driver.switchTo().window(tabs.get(1));
        //Hooks.driver.close();
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

    }
    @Then("{string} is opened in new tab")
    public void is_opened_in_new_tab(String string) {
        String actualurl= Hooks.driver.getCurrentUrl();
        Assert.assertEquals(string,actualurl);

    }

    @Given("user opens twitter link")
    public void userOpensTwitterLink() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(0));
        Hooks.driver.switchTo().window(tabs.get(1));
        //Hooks.driver.close();
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("{string} this link opened in new tab")
    public void thisLinkOpenedInNewTab(String arg0) {
        String actualurl= Hooks.driver.getCurrentUrl();
        Assert.assertEquals(arg0,actualurl);
    }

    @Given("user opens rss link")
    public void userOpensRssLink() {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]")).click();

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(0));
        Hooks.driver.switchTo().window(tabs.get(1));
        //Hooks.driver.close();
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("{string} rss link opened in new tab")
    public void rssLinkOpenedInNewTab(String arg0) {
        String actualurl= Hooks.driver.getCurrentUrl();
        Assert.assertEquals(arg0,actualurl);
    }
}
