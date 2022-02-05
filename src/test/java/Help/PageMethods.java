package Help;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageMethods {
    public WebDriver driver;

    public PageMethods(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateElement(String value){
        driver.navigate().to(value);
        wiatoLoadURL(value);
    }
    public void wiatoLoadURL(String value){
        WebDriverWait waitexplicit=new WebDriverWait(driver, Duration.ofSeconds(10));
        waitexplicit.until(ExpectedConditions.urlToBe(value));
    }
}
