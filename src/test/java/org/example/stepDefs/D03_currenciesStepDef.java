package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homepage homepage = new P03_homepage();

    @When("user select euro currency from the dropdown list on the top left of home page")
    public void user_select_euro_currency_from_the_dropdown_list_on_the_top_left_of_home_page() {

        homepage.selectEuroCurrency();
    }

    @Then("user select euro currency the products displayed in home page shown Euro Symbol")
    public void userSelectEuroCurrencyTheProductsDisplayedInHomePageShownEuroSymbol() {

        for (WebElement prod : homepage.products)
        {
            Assert.assertEquals(prod.getText().charAt(0),  '€');
        }
    }
}