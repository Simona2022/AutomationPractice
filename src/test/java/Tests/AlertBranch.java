package Tests;

import Base.SharedData;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AlertBranch extends SharedData {
    @Test
    public void testautomat(){

        WebElement skipElement=driver.findElement(By.id("btn2"));
        skipElement.click();

        WebElement switchtoElemet= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action=new Actions(driver);
        action.moveToElement(switchtoElemet).perform();

        WebElement aletElement= driver.findElement(By.xpath("//a[text()='Alerts']"));
        aletElement.click();
        //get-merge catre pagina si asteapta sa se incarce
        //navgate-merge catre pagina

        driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
        List<WebElement> alertoptions= driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        alertoptions.get(0).click();
        WebElement alertokelement=driver.findElement(By.cssSelector("#OKTab>button"));
        alertokelement.click();
        Alert OK = driver.switchTo().alert();
        OK.accept();

        alertoptions.get(1).click();
        WebElement alertokcancelelement=driver.findElement(By.cssSelector("#CancelTab>button"));
        alertokcancelelement.click();
        Alert OKCancel = driver.switchTo().alert();
        OKCancel.dismiss();

        alertoptions.get(2).click();
        WebElement textbox=driver.findElement(By.cssSelector("#Textbox>button"));
        textbox.click();
        Alert Textbox = driver.switchTo().alert();
        Textbox.sendKeys("Pauza");
        Textbox.accept();


    }
}
