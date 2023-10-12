package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends BasePage {

    private final By searchInputLocator = By.xpath("//*[@type='search']");

    public void enterSearchWord(String searchWord) {
        WebElement searchInput = driver.findElement(searchInputLocator);
        searchInput.sendKeys(searchWord);
    }

    public void clickEnterOnSearchInput() {
        clickEnter(searchInputLocator);
    }
}

