package Help;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FrameMethod {

    WebDriver driver;

    public FrameMethod(WebDriver driver) {
        this.driver = driver;
    }
    public void switchtoframebyid(String value){
        waitframe(value);

    }
    public void switchtoframebyElement(WebElement element){
        waitframe(element);
    }

    public void switchtodefault(){
        driver.switchTo().defaultContent();
    }

    public void waitframe(String value){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(value));
    }

    public void waitframe(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
    }


}
