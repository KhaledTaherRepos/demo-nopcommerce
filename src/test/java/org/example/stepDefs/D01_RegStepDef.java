package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_RegStepDef
{
    P01_register register = new P01_register();
    @Given("user go to register page")
    public void user_go_to_register_page() {
        register.registerLink.click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.male.click();
    }

    @And("user enter {string} & {string}")
    public void userEnter(String firstname, String lastname) {
        register.firstName.sendKeys(firstname);
        register.lastName.sendKeys(lastname);
    }

    @And("user select date of birth")
    public void userSelectDateOfBirth() {
        // select day
        Select selectDay = new Select(register.dayList);
        selectDay.selectByValue("6");
        // select month
        Select selectMonth = new Select(register.monthList);
        selectMonth.selectByVisibleText("March");
        // select year
        Select selectYear = new Select(register.yearList);
        selectYear.selectByIndex(9);


    }

    @And("user enter email")
    public void userEnter() {
        // generate random email
        Faker fake = new Faker();
        String emailaddress = fake.internet().safeEmailAddress();
        System.out.println(emailaddress);
        register.Email.sendKeys(emailaddress);

    }

    @And("user enter {string} password and confirm password")
    public void userEnterPasswordAndConfirmPassword(String arg0) {
    register.password.sendKeys(arg0);
    register.Confirmpassword.sendKeys(arg0);
    }

    @And("user click on register button")
    public void userClickOnRegisterButton() {
        register.registerbuton.click();

    }

    @Then("account created successfully")
    public void accountCreatedSuccessfully() {
        SoftAssert soft = new SoftAssert();
        //1- get text and verify it contains your registration completed
        soft.assertTrue(register.sucessmsg.getText().toLowerCase().contains("registration completed"));

        //2- get css value and verify color is green #4cb17c hex
        String actualColor = register.sucessmsg.getCssValue("color");
        soft.assertEquals(Color.fromString(actualColor).asHex(),"#4cb17c");

        soft.assertAll();

    }
}
