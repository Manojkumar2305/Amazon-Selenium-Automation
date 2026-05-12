package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverManager;
import utils.ConfigReader;

public class AmazonPage {

    WebDriver driver;

    WebDriverWait wait;

    public AmazonPage() {

        driver = DriverManager.getDriver();

        int timeout =
                Integer.parseInt(
                        ConfigReader.getProperty("timeout"));

        wait = new WebDriverWait(driver,
                Duration.ofSeconds(timeout));
    }

    By searchBox =
            By.id("twotabsearchtextbox");

    By nikeCheckbox =
            By.xpath("//span[text()='Nike']/preceding-sibling::div");

    By minPrice =
            By.id("low-price");

    By maxPrice =
            By.id("high-price");

    By goButton =
            By.xpath("//input[@aria-label='Go - Submit price range']");

    By products =
            By.cssSelector("div[data-component-type='s-search-result']");

    public void openAmazon() {

        driver.get(
                ConfigReader.getProperty("url"));
    }

    public void searchShoes() {

        WebElement search =
                wait.until(ExpectedConditions
                        .visibilityOfElementLocated(searchBox));

        search.sendKeys("shoes");

        search.sendKeys(Keys.ENTER);
    }

    public void applyNikeFilter() throws Exception {

        WebElement nike =
                wait.until(ExpectedConditions
                        .presenceOfElementLocated(nikeCheckbox));

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView(true);",
                        nike);

        Thread.sleep(2000);

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].click();",
                        nike);
    }
    public void applyPriceFilter() throws Exception {

        Thread.sleep(3000);

        String currentUrl =
                driver.getCurrentUrl();

        if (!currentUrl.contains("low-price")) {

            currentUrl =
                    currentUrl +
                    "&low-price=2000&high-price=10000";
        }

        driver.get(currentUrl);
    }
    public int getProductCount() {

        By resultText =
                By.xpath("//h2/span[1]");

        WebElement result =
                wait.until(ExpectedConditions
                        .visibilityOfElementLocated(resultText));

        String text = result.getText();

        System.out.println(text);

        String total =
                text.split("of")[1]
                        .split("results")[0]
                        .trim();

        total = total.replace(",", "");

        return Integer.parseInt(total);
    }
}