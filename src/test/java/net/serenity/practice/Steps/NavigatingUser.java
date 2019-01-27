package net.serenity.practice.Steps;

import net.serenity.practice.model.Tabs;
import net.serenity.practice.ui.AppTabNavigationBar;
import net.serenity.practice.ui.CurrentPage;
import net.serenity.practice.ui.SalesforceHomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigatingUser {

    SalesforceHomePage salesforceHomePage;
    CurrentPage currentPage;
    AppTabNavigationBar appTabNavigationBar;

    @Step
    public void isOnTheHomePage() {
        salesforceHomePage.open();
        salesforceHomePage.logIntoSalesfroce("willokans@gmail.com", "Auto2019");
        salesforceHomePage.navigateSalesApp();
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }

    @Step
    public void navigatesToOpportunityPage(Tabs opportunity) {
        appTabNavigationBar.selectApplicaitonTab(opportunity);
    }
}
