package stepdefs;

import driver.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.Assertions;
import pages.GoogleHomePage;
import pages.GoogleSearchPage;
import util.Util;

public class GoogleSteps {
    private final GoogleHomePage homePage = new GoogleHomePage();
    private final GoogleSearchPage searchPage = new GoogleSearchPage();
    private static final String URL_PROPERTY_NAME = "google.url";

    @Given("User opens the Google website")
    public void userOpensTheGoogleWebsite() {
        Driver.openBrowser(Util.getProperty(URL_PROPERTY_NAME));
    }

    @When("User enter {string} in the search bar and press Enter")
    public void userEnterInTheSearchBarAndPress(String keyword) {
        homePage.enterSearchWord(keyword);
        homePage.clickEnterOnSearchInput();
    }

    @Then("Verify that link to the Wikipedia page for {string} with the URL {string} is visible")
    public void verifyLinkToWikipediaExists(String title, String url) {
        Assertions.assertTrue(searchPage.isLinkWithUrlExists(url),
                String.format("Element with title =%s and url = %s is not visible", title, url));
    }

    @Attachment
    @Then("User makes a screenshot")
    public void userMakesAScreenshot() {
        Util.makeScreenshot();
    }
}
