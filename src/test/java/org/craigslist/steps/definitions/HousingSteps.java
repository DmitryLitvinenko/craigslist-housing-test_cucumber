package org.craigslist.steps.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.craigslist.pages.HousingPage;

import java.util.List;

public class HousingSteps {
    private HousingPage housingPage = new HousingPage();

    @Then("housing page is opened")
    public void housingPageOpened() {
        housingPage.isPageLoaded();
    }

    @Given("opened housing page")
    public void openedHousingPage() {
        housingPage.open();
    }

    @When("user click drop down menu with sorting options")
    public void clickDropDown() {
        housingPage.clickDropDown();
    }

    @Then("by default should be following options:")
    public void defaultSortingOptions(List<String> expectedOptions) {
       housingPage.validateDefaultSearchOptions(expectedOptions);
    }

    @When("user pick sorting filter for search: {string}")
    public void clickFilter(String filterOption) {
        housingPage.clickDropDown();
        housingPage.pickFilter(filterOption);
    }
}