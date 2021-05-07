package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EpamTest {

    private final WebDriver driver;

    private final By acceptButton = By.xpath("//button[@class='button-ui bg-color-light-blue cookie-disclaimer__button' and @aria-label='Accept our use of cookies']");

    private final By language = By.xpath("//button[@class='location-selector__button']");
    private final By ukraineLanguage = By.xpath("//a[@class='location-selector__link' and @lang='uk']");

    private final By learnMore = By.xpath("//a[@class='button-ui bg-color-light-red standard' and @href='https://www.epam.com/our-work']");
    private final By contactUs = By.xpath("//a[@class='cta-button-ui cta-button--envelope header__control']");
    private final By dreamJob = By.xpath("//a[@class='button-ui bg-color-white standard' and @href='https://www.epam.com/careers']");

    private final By instagram = By.xpath("//a[@class='footer__social-link' and @data-type='instagram-filled']");

    private final By telescopeai = By.xpath("//a[@class='footer__brands-link' and @href='https://www.telescopeai.com/']");

    private final By searchIcon = By.xpath("//button[@class='header-search__button header__icon']");
    private final By DevOpsOption = By.xpath("//li[@class='frequent-searches__item' and contains(text(), 'DevOps')]");
    private final By findButton = By.xpath("//button[@class='header-search__submit']");

    private final By menu = By.xpath("//button[@class='hamburger-menu__button']");
    private final By insights = By.xpath("//a[@class='hamburger-menu__link' and contains(text(), 'Insights')]");

    public EpamTest(WebDriver driver) {
        this.driver = driver;
    }

    //check changing language
    private WebElement language() {
        return driver.findElement(language);
    }

    public void clickSelectLanguage() {
        language().click();
    }

    private WebElement ukraineLanguage() {
        return driver.findElement(ukraineLanguage);
    }

    public void chooseUkraine() {
        ukraineLanguage().click();
    }

    //accept button
    private WebElement acceptButton() {
        return driver.findElement(acceptButton);
    }

    public void clickAcceptButton() {
        acceptButton().click();
    }

    //learn more button
    private WebElement learnMore() {
        return driver.findElement(learnMore);
    }

    public void clickLearnMore() {
        Actions actions = new Actions(driver);
        actions.moveToElement(learnMore()).click().perform();
        clickAcceptButton();
        learnMore().click();
    }

    //contact us button
    private WebElement contactUs() {
        return driver.findElement(contactUs);
    }

    public void clickContactUs() {
        contactUs().click();
    }

    //dream job button
    private WebElement dreamJob() {
        return driver.findElement(dreamJob);
    }

    public void clickDreamJob() {
        Actions actions = new Actions(driver);
        actions.moveToElement(dreamJob()).click().perform();
        clickAcceptButton();
        dreamJob().click();
    }

    //instagram button

    private WebElement instagram() {
        return driver.findElement(instagram);
    }

    public void clickInstagram() {
        Actions actions = new Actions(driver);
        actions.moveToElement(instagram()).click().perform();
        clickAcceptButton();
        instagram().click();
    }

    //telescopeai button
    private WebElement telescopeai() {
        return driver.findElement(telescopeai);
    }

    public void clickTelescopeai() {
        Actions actions = new Actions(driver);
        actions.moveToElement(telescopeai()).click().perform();
        clickAcceptButton();
        telescopeai().click();
    }

    //search button
    private WebElement searchIcon() {
        return driver.findElement(searchIcon);
    }

    public void clickSearchButton() {
        searchIcon().click();
    }

    private WebElement DevOpsOption() {
        return driver.findElement(DevOpsOption);
    }

    public void writesSomething() {
        DevOpsOption().click();
    }

    private WebElement findButton() {
        return driver.findElement(findButton);
    }

    public void clickFindButton() {
        findButton().click();
    }

    //insights button
    private WebElement menu() {
        return driver.findElement(menu);
    }

    public void clickMenuButton() {
        menu().click();
    }

    private WebElement insightsButton() {
        return driver.findElement(insights);
    }

    public void clickInsightsButton() {
        insightsButton().click();
    }


}
