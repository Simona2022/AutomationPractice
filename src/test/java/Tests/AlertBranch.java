package Tests;

import Base.SharedData;
import Help.AlertMethods;
import Help.ElementMethod;
import Help.PageMethods;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AlertBranch extends SharedData {
    public ElementMethod elementMethod;
    public PageMethods pageMethods;
    public AlertMethods alertMethods;
    @Test
    public void testautomat(){

        elementMethod= new ElementMethod(driver) ;
        pageMethods= new PageMethods(driver);
        alertMethods=new AlertMethods(driver);

        WebElement skipElement=driver.findElement(By.id("btn2"));
       elementMethod.clickElement(skipElement);

        WebElement switchtoElemet= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action=new Actions(driver);
        action.moveToElement(switchtoElemet).perform();

        WebElement aletElement= driver.findElement(By.xpath("//a[text()='Alerts']"));
        elementMethod.clickElement(aletElement);
        //get-merge catre pagina si asteapta sa se incarce
        //navgate-merge catre pagina

        pageMethods.navigateElement("http://demo.automationtesting.in/Alerts.html");
        List<WebElement> alertoptions= driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        alertoptions.get(0).click();
        WebElement alertokelement=driver.findElement(By.cssSelector("#OKTab>button"));
        alertokelement.click();

        //wait explicit
        WebDriverWait waitexplicit=new WebDriverWait(driver, Duration.ofSeconds(10));
        waitexplicit.until(ExpectedConditions.alertIsPresent());

        //Thread Sleep-wait for 4 second
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Alert OK = driver.switchTo().alert();
        alertMethods.acceptAlert();

        alertoptions.get(1).click();
        WebElement alertokcancelelement=driver.findElement(By.cssSelector("#CancelTab>button"));
        alertokcancelelement.click();
        alertMethods.cancelAlert();

        alertoptions.get(2).click();
        WebElement textbox=driver.findElement(By.cssSelector("#Textbox>button"));
        textbox.click();
        alertMethods.acceptfillAlert("pauza");


    }
}
