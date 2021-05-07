package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
public class allSteps {
    static WebDriver driver;
    static EpamTest epamTest;

    //all
    @Given("User has opened main page")
    public void userHasOpenedMainPage() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.epam.com/");
    }

    //check changing language
    @When("User clicks select a region and a language button")
    public void userClicksSelectLanguage() {
        epamTest = new EpamTest(driver);
        epamTest.clickSelectLanguage();
    }

    @And("choose Ukraine")
    public void userChooseUkraine() {
        epamTest = new EpamTest(driver);
        epamTest.chooseUkraine();
    }

    @Then("User see ukrainian main page")
    public void seeUkrainianMainPage() {
        CheckChangingLanguage checkChangingLanguage = new CheckChangingLanguage(driver);
        checkChangingLanguage.verifyPageIsOpened();
        driver.quit();
    }

    //learn more button
    @When("User clicks learn more button")
    public void userClicksLearnMoreButton() {
        epamTest = new EpamTest(driver);
        epamTest.clickLearnMore();
    }

    @Then("learn more page opens")
    public void learnMorePageOpens() {
        LearnMoreButton learnMoreButton = new LearnMoreButton(driver);
        learnMoreButton.verifyPageIsOpened();
        driver.quit();
    }

    //contact us button
    @When("User clicks contact us button")
    public void userClicksContactUsButton() {
        epamTest = new EpamTest(driver);
        epamTest.clickContactUs();
    }

    @Then("contact us page opens")
    public void contactUsPageOpens() {
        ContactUsButton contactUs = new ContactUsButton(driver);
        contactUs.verifyPageIsOpened();
        driver.quit();
    }

    //dream job button
    @When("User clicks find your dream job button")
    public void userClickDreamJobButton() {
        epamTest = new EpamTest(driver);
        epamTest.clickDreamJob();
    }

    @Then("find your dream job page opens")
    public void userFindDreamJob() {
        YourDreamJobButton yourDreamJobButton = new YourDreamJobButton(driver);
        yourDreamJobButton.verifyPageIsOpened();
        driver.quit();
    }

    //instagram button
    @When("User clicks instagram button")
    public void userClickInstagramButton() {
        epamTest = new EpamTest(driver);
        epamTest.clickInstagram();
    }

    @Then("User sees instagram locations under blockchain our offices")
    public void userSeesInstagramLocations() {
        InstagramButton instagramButton = new InstagramButton(driver);
        instagramButton.verifyPageIsOpened();
        driver.quit();
    }

    //telescopeai button
    @When("User clicks telescopeai button")
    public void userClickTelescopeaiButton() {
        epamTest = new EpamTest(driver);
        epamTest.clickTelescopeai();
    }

    @Then("telescopeai page opens")
    public void userSeesTelescopeaiPage() {
        TelescopeaiButton telescopeaiButton = new TelescopeaiButton(driver);
        telescopeaiButton.verifyPageIsOpened();
        driver.quit();
    }

    //search button
    @When("User clicks search button")
    public void userClicksSearchButton() {
        epamTest = new EpamTest(driver);
        epamTest.clickSearchButton();
    }

    @And("User check DevOps in search blockchain")
    public void userWritesSomething() {
        epamTest = new EpamTest(driver);
        epamTest.writesSomething();
    }

    @And("User clicks find button")
    public void userClicksFindButton() {
        epamTest = new EpamTest(driver);
        epamTest.clickFindButton();
    }

    @Then("User sees result")
    public void seesResult() {
        CheckSearchesBlockhain checkSearchesBlockhain = new CheckSearchesBlockhain(driver);
        checkSearchesBlockhain.verifyPageIsOpened();
        driver.quit();
    }

    //menu button
    @Given("User has opened small main page")
    public void userHasOpenedSmallMainPage() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.epam.com/");
    }

    @When("User clicks menu button")
    public void userClicksMenuButton() {
        epamTest = new EpamTest(driver);
        epamTest.clickMenuButton();
    }

    @And("User clicks insights button in menu blockchain")
    public void userClicksInsightsButton() {
        epamTest = new EpamTest(driver);
        epamTest.clickInsightsButton();
    }

    @Then("insights page opens")
    public void seeInsightsPageOpens() {
        InsightsButtonInMenuBlockchain insightsButtonInMenuBlockchain = new InsightsButtonInMenuBlockchain(driver);
        insightsButtonInMenuBlockchain.verifyPageIsOpened();
        driver.quit();
    }
}
