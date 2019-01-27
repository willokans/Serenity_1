package net.serenity.practice.features.navigation;

import net.serenity.practice.Steps.NavigatingUser;
import net.serenity.practice.model.Tabs;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class WhenBrowserAppNavigationTabs {

    @Steps
    NavigatingUser barry;

    @Managed
    WebDriver browser;

    @Test
    public void shouldBeAbleToNavigateToOpportunityHomePage() {
        //Given
        barry.isOnTheHomePage();

        //When
        barry.navigatesToOpportunityPage(Tabs.Opportunities);

        //Then
        barry.shouldSeePageTitleContaining("Opportunities");

    }

}
