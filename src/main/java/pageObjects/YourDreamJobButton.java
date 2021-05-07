package pageObjects;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class YourDreamJobButton {
    private final WebDriver driver;

    public YourDreamJobButton(WebDriver driver) {
        this.driver = driver;
    }

    private String getUrl() {
        return driver.getCurrentUrl();
    }

    public void verifyPageIsOpened() {
        assertEquals(getUrl(), "https://www.epam.com/careers");
    }
}
