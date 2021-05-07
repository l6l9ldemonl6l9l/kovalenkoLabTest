package pageObjects;

import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.testng.Assert.assertEquals;


public class InstagramButton {
    private final WebDriver driver;

    public InstagramButton(WebDriver driver) {
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
        assertEquals(driver.getCurrentUrl(), "https://www.instagram.com/epamsystems/");
    }

}
