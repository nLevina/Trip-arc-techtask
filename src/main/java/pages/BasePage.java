package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver driver;

    public BasePage() {
        driver = Driver.getDriver();
    }

    public void clickEnter(By element) {
        driver.findElement(element).sendKeys(Keys.ENTER);
    }
}
