package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {

    public P02_login ()
    {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(className = "ico-login")
    public WebElement loginlink;

    @FindBy(id = "Email")
    public WebElement enterMail;

    @FindBy(name = "Password")
    public WebElement enterPass;

    @FindBy(className = "login-button")
    public WebElement button;

    @FindBy(className = "ico-account")
    public WebElement myaccnt;

    @FindBy(className = "message-error")
    public WebElement msgerror;


}
