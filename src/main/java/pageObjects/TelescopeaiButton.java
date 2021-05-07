package pageObjects;

import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class TelescopeaiButton {
    private final WebDriver driver;

    public TelescopeaiButton(WebDriver driver) {
        this.driver = driver;
    }

    private Set<String> allTabs() {
        return driver.getWindowHandles();
    }

    private void switchToNewWindow() {
        driver.switchTo().window(getTheLastOpenedWindow());
    }

    private String getTheLastOpenedWindow() {
        String window = null;
        for (String s : allTabs()) {
            window = s;
        }
        return window;
    }

    public void verifyPageIsOpened() {
        switchToNewWindow();
        assertEquals(driver.getCurrentUrl(), "https://www.telescopeai.com/");
    }
}
