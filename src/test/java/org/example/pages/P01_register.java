package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_register {

    //1- constructor
    public P01_register ()
    {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className ="ico-register")
    public WebElement registerLink;

    /*public WebElement registerLink()
    {
        WebElement register=Hooks.driver.findElement(By.className("ico-register"));
        return register;
    }*/
    @FindBy(id = "gender-male")
    public WebElement male;

    @FindBy(id = "FirstName")
    public WebElement firstName;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy (name = "DateOfBirthDay")
    public WebElement dayList;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement monthList;

    @FindBy(name = "DateOfBirthYear")
    public WebElement yearList;

    @FindBy (id = "Email")
    public WebElement Email;

    @FindBy (id = "Password")
    public WebElement password;

    @FindAll({
            @FindBy(id = "ConfirmPassword"),
            @FindBy(name = "ConfirmPassword")
    })
    public WebElement Confirmpassword;

    @FindBy(id = "register-button")
    public WebElement registerbuton;

    @FindBy(className = "result")
    public WebElement sucessmsg;
}
