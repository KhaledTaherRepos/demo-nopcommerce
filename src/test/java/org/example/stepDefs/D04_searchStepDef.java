package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.DataTable;
import org.example.pages.P03_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;


public class D04_searchStepDef {


    P03_homepage homepage = new P03_homepage();

    String searchword = "";


    @Given("user could search using {string}")
    public void userCouldSearchUsing(String arg0) {
        searchword = arg0;
        homepage.search.sendKeys(arg0);
        System.out.println(arg0);
    }


    @When("user click on search button")
    public void userClickOnSearchButton() {homepage.searchbtn.click();

    }

    @Then("search shows relevant results")
    public void searchShowsRelevantResults() {

       List<WebElement> products = Hooks.driver.findElements(By.className("product-title")) ;//product-title
        int size = products.size();

        for (int i = 0 ;i<size ;i++){
        String title = products.get(i).getText().toLowerCase();
        Assert.assertTrue(title.contains(searchword.toLowerCase()));

        }


    }


    @Then("url contains {string}")
    public void urlContains(String arg0) {

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains(arg0));

        soft.assertAll();

    }

    @Then("search shows exact result")
    public void searchShowsExactResult() {
       WebElement product = Hooks.driver.findElement(By.className("product-item")) ;//product-title
        product.click();
        WebElement sku = Hooks.driver.findElement(By.className("additional-details")) ;
        String d = sku.getText();
        Assert.assertTrue(sku.getText().contains(searchword));



    }
}
