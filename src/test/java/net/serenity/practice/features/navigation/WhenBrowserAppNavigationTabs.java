package net.serenity.practice.features.navigation;

import net.serenity.practice.Steps.NavigatingUser;
import net.serenity.practice.model.Tabs;
//import net.serenity.practice.tasks.NavigateTo;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenity.practice.model.Tabs.Opportunities;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;
import static org.hamcrest.Matchers.containsString;


@RunWith(SerenityRunner.class)
public class WhenBrowserAppNavigationTabs {

    @Steps
    NavigatingUser barry;

    @Managed (driver = "chrome", uniqueSession=true, clearCookies=BeforeEachTest)
    WebDriver browser;

    @Test
    public void shouldBeAbleToNavigateToOpportunityHomePage() {
        //Given
        barry.isOnTheHomePage();

        //When
        barry.navigatesToOpportunityPage(Opportunities);

        //Then
        barry.shouldSeePageTitleContaining("Opportunities");

    }

    @Manual
    @Test
    public void shouldBeAbleToViewAllAccountsList(){

        Actor will = Actor.named("Will");
        will.can(BrowseTheWeb.with(browser));

//        when(will).attemptsTo(NavigateTo.theApplication(Opportunities));

        then(will).should(seeThat(TheWebPage.title(), containsString("Opportunities")));
    }

}
