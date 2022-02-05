package Tests;

import Base.SharedData;
import Help.WindowMethods;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class windowtest extends SharedData {
    public WindowMethods windowMethods;
    @Test
    public void windowtest(){
        //initializare obiect
        windowMethods=new WindowMethods(driver);
        WebElement skipElement=driver.findElement(By.id("btn2"));
        skipElement.click();

        WebElement switchtoElemet= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action=new Actions(driver);
        action.moveToElement(switchtoElemet).perform();

        WebElement windowElement= driver.findElement(By.xpath("//a[text()='Windows']"));
        windowElement.click();
        driver.navigate().to("http://demo.automationtesting.in/Windows.html");

        List<WebElement> windowoptions= driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        windowoptions.get(0).click();
        WebElement newTabok=driver.findElement(By.cssSelector("#Tabbed>a>button"));
        newTabok.click();

       windowMethods.switchtotab(1);
       //m-am mutat pe tab
       windowMethods.closecurrenttab();
       //inpoi pe tab-ul anterior
       windowMethods.switchtotab(0);

        windowoptions.get(2).click();
        WebElement newseperate=driver.findElement(By.cssSelector("#Seperate>button"));
        newseperate.click();


        windowMethods.switchtotab(2);
        windowMethods.closecurrenttab();
        windowMethods.switchtotab(1);
        windowMethods.closecurrenttab();
        windowMethods.switchtotab(0);




    }
}
