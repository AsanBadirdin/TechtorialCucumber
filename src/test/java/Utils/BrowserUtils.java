package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

public class BrowserUtils extends TestBase {
    public static void switchWindow(WebDriver driver, String targetaTitle) {

        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        // The internet
        // targetTitle =  New Window
        if (!driver.getTitle().equals(targetaTitle)) {
            for (String window : allWindows) {
                driver.switchTo().window(window);
                if (driver.getTitle().equals(targetaTitle)) {
                    break;
                }
            }

        }
    }
    public static void select(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public static void verifyBrokenLink(List<WebElement> links) {

        for (WebElement link : links) {
            String hrefValue = link.getAttribute("href");
            try {
                URL url = new URL(hrefValue);

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setConnectTimeout(3000);

                connection.connect();
                if (connection.getResponseCode() >= 400 || connection.getResponseCode() >= 500) {
                    System.out.println(links);
                    System.out.println("This link is broken " + connection.getResponseMessage()
                            + " " + connection.getResponseCode());
                }
            } catch (IOException e) {
                e.getStackTrace();
            }


        }

    }

    public void howerOver(WebDriver driver, WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

    }

    public static void dragAndDrop(WebDriver driver, WebElement from, WebElement to) {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(from, to).build().perform();
    }

    public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement webElement, int second) {

        WebDriverWait wait = new WebDriverWait(driver, second);

        WebElement element1 = wait.until(ExpectedConditions.visibilityOf(webElement));

        return element1;
    }

    public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement webElement, int second) {

        WebDriverWait wait = new WebDriverWait(driver, second);

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(webElement));

        return element1;
    }


    public static void explicitlyWait(WebDriver driver, WebElement element, int timeOut, String value) {
        new WebDriverWait(driver, timeOut).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }

    public static void takeScreenShot() throws IOException {

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File desFile = new File("ScreenShotFile/"+System.currentTimeMillis()+".png");

        FileUtils.copyFile(src,desFile);


    }

    public static void scrollDown(int x, int y){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,3000)");
    }


}
