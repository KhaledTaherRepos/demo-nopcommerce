package org.example.stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_login login = new P02_login();

    @Given("user go to login page")
    public void user_go_to_login_page() {
        login.loginlink.click();
    }

    @When("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String arg0, String arg1) {
        login.enterMail.sendKeys(arg0);
        login.enterPass.sendKeys(arg1);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.button.click();

    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();

        String actualUrl = Hooks.driver.getCurrentUrl();
        String expectedUrl = "https://demo.nopcommerce.com/";
        soft.assertEquals(actualUrl,expectedUrl);

        String actualText = login.myaccnt.getText();
        String expectedText = "My account";
        soft.assertEquals(actualText,expectedText);


        soft.assertAll();
    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1) {
        login.enterMail.sendKeys(arg0);
        login.enterPass.sendKeys(arg1);

    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.msgerror.getText().toLowerCase().contains("login was unsuccessful"));

        String actualColor = login.msgerror.getCssValue("color");
        soft.assertEquals(Color.fromString(actualColor).asHex(),"#e4434b");

        soft.assertAll();
    }
}