package pageObjects;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class CheckSearchesBlockhain {
    private final WebDriver driver;

    public CheckSearchesBlockhain(WebDriver driver) {
        this.driver = driver;
    }

    private String getUrl() {
        return driver.getCurrentUrl();
    }

    public void verifyPageIsOpened() {
        assertEquals(getUrl(), "https://www.epam.com/search?q=DevOps");
    }
}
