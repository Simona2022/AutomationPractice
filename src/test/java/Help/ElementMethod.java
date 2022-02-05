package Help;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementMethod {
    public WebDriver driver;

    public ElementMethod(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement elemente){
       waitElement(elemente);
        elemente.click();
    }
    public void waitElement(WebElement element){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void fillElement(WebElement element, String value){
        waitElement(element);
        element.sendKeys(value);
    }
        public void movetoElement(WebElement element){
            Actions action=new Actions(driver);
            action.moveToElement(element).perform();}
    public void validateElementtest(WebElement element,String value) {

        String actualmsg = element.getText();
        Assert.assertEquals("Textl cautat nu e corect", value, actualmsg);
    }

    public void selectelementbytext(WebElement element, String value){
        Select skills =new Select(element);
        skills.selectByVisibleText(value);

    }
    public void selectelementbyvalue(WebElement element, String value){
        Select skills =new Select(element);
        skills.selectByValue(value);}
}
