package net.serenity.practice.ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://login.salesforce.com/")
public class SalesforceHomePage  extends PageObject{


    @FindBy (xpath = "//a[text()='Sales']")
    WebElement salesAppLauncher;

    @FindBy (xpath = "//span[text()='Opportunities']")
    WebElement opportunityTab;


    public void logIntoSalesfroce(String userName, String password){

        $("#username").clear();
        $("#username").sendKeys(userName);

        $("#password").clear();
        $("#password").sendKeys(password);

        $("#Login").click();
    }

    public void navigateSalesApp(){
        $(".slds-icon-waffle").click();
        salesAppLauncher.click();
        opportunityTab.click();
    }


}
