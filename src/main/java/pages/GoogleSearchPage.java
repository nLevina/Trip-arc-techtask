package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class GoogleSearchPage extends BasePage {
    private static final String LINK_LOCATOR = "//*[contains(@href, '%s' )]";

    public boolean isLinkWithUrlExists(String url) {
        try {
            driver.findElement(getLinkLocator(url));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    private By getLinkLocator(String url) {
        return By.xpath(String.format(LINK_LOCATOR, url));
    }

}
