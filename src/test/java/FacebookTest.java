import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FacebookTest {
    @org.junit.Test
    public void OpenGoogleChrome() {
        System.setProperty("webdriver.chrome.driver", "/chromedriver_win32 (1)/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com//");

        WebElement element_enter = driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']"));
        element_enter.sendKeys("Facebook");
        element_enter.submit();


        //Katya put waiter

        WebElement findElement = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3"));
        findElement.click();
        driver.quit();
    }

}