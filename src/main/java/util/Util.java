package util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static driver.Driver.getDriver;

public class Util {
    public static final Logger LOGGER = LoggerFactory.getLogger(Util.class);
    private static final Properties PROPERTIES = new Properties();

    public static String getProperty(String key) {
        try (FileInputStream fis = new FileInputStream("src/main/resources/config/configuration.properties")) {
            PROPERTIES.load(fis);
        } catch (IOException e) {
            LOGGER.error("failed to load data from configuration.properties");
        }
        return PROPERTIES.getProperty(key);
    }

    public static void makeScreenshot() {
        File screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        String fileName = "screenshot.png";
        String filePath = "./screenshots/";
        try {
            FileUtils.copyFile(screenshot, new File(filePath + fileName));
        } catch (IOException e) {
            LOGGER.error("no screenshot taken");
        }
    }
}
