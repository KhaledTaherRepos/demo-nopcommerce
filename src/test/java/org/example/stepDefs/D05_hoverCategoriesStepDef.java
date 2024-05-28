package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {

    P03_homepage homepage = new P03_homepage();
    String selectedSubCategoryText ;

    @When("Sub category list appears click on random sub category")
    public void mainCategoryIsClicked() throws InterruptedException {
        Actions actions=new Actions(driver);
        List<WebElement> mainLinks = driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
        int count = 3;
        int selectedCategory = new Random(System.currentTimeMillis()).nextInt(count) ;
        actions.moveToElement(mainLinks.get(selectedCategory)).perform();
        Thread.sleep(2000);

        selectedCategory = selectedCategory+1;
        String locator = "(//ul[@class='top-menu notmobile']//ul)["+selectedCategory+"]/li";
        List<WebElement> subCategoryLinks = driver.findElements(By.xpath(locator));


        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);


            int subCategoryCount = subCategoryLinks.size();
            int selectedSubCategory = new Random(System.currentTimeMillis()).nextInt(subCategoryCount);
            selectedSubCategoryText = subCategoryLinks.get(selectedSubCategory).getText();
            subCategoryLinks.get(selectedSubCategory).click();



        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Given("In home page hover in main categories")
    public void inHomePage() {


    }

    @Then("Subcategory name appears in page")
    public void subcategoryNameAppearsInPage() {
        WebElement title = driver.findElement(By.className("page-title")) ;
        Assert.assertEquals(title.getText(), selectedSubCategoryText);

    }
}
