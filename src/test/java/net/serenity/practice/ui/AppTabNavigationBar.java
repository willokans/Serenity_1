package net.serenity.practice.ui;

import net.serenity.practice.model.Tabs;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class AppTabNavigationBar extends PageObject{

    @FindBy(css = "a[title*='Opportunities']")
    WebElement oppotunityTab;

    public void selectApplicaitonTab(Tabs Opportunity) {
        $("a[title*='"+Opportunity+"']").click();

    }
}
