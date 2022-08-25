package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class MyStepDefs {

    CorridorDigitalSeason1Page corridorDigitalSeason1Page =new CorridorDigitalSeason1Page();

    @Given("User is on the Season1 page of corridor digital")
    public void user_is_on_the_season1_page_of_corridor_digital() {
        // Write code here that turns the phrase above into concrete actions
        Utils.verifyCurrentURL("https://www.corridordigital.com/season/1");
    }
    @When("User selects Newest option in Sort By menu")
    public void user_selects_newest_option_in_sort_by_menu() {
        // Write code here that turns the phrase above into concrete actions
        Utils.ClickElement(By.cssSelector("div.dropdown-toggle"));
        Utils.ClickElement(By.xpath("//*[contains(text(),'Newest')]"));
    }
    @Then("User should be able to sort the episodes from newest to oldest")
    public void user_should_be_able_to_sort_the_episodes_from_newest_to_oldest() {
        // Write code here that turns the phrase above into concrete actions
        corridorDigitalSeason1Page.VerifySortingOptionNewest();
    }

}
