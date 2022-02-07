package Tests;

import Base.SharedData;
import Help.ElementMethod;
import Help.PageMethods;
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
    public ElementMethod elementMethod;
    public PageMethods pageMethods;

    @Test
    public void windowtesting(){
        //initializare obiect
        windowMethods=new WindowMethods(driver);
        elementMethod=new ElementMethod(driver);
        pageMethods=new PageMethods(driver);

        WebElement skipElement=driver.findElement(By.id("btn2"));
        elementMethod.clickElement(skipElement);

        WebElement switchtoElemet= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        elementMethod.movetoElement(switchtoElemet);

        WebElement windowElement= driver.findElement(By.xpath("//a[text()='Windows']"));
        elementMethod.clickElement(windowElement);

        pageMethods.navigateElement("http://demo.automationtesting.in/Windows.html");

        List<WebElement> windowoptions= driver.findElements(By.cssSelector(".nav-tabs>li>a"));
        windowoptions.get(0).click();

        WebElement newTabok=driver.findElement(By.cssSelector("#Tabbed>a>button"));
        elementMethod.clickElement(newTabok);

        windowMethods.switchtotab(1);
        windowMethods.closecurrenttab();
        windowMethods.switchtotab(0);

        windowoptions.get(1).click();
        WebElement newseperate=driver.findElement(By.cssSelector("#Seperate>button"));
        elementMethod.clickElement(newseperate);

        windowMethods.switchtotab(1);
        windowMethods.closecurrenttab();
        windowMethods.switchtotab(0);

        windowoptions.get(2).click();
        WebElement clickElementMultipleWindow = driver.findElement(By.cssSelector("#Multiple>button"));
        elementMethod.clickElement(clickElementMultipleWindow);
        System.out.println("Titlul paginii: "+ driver.getTitle());

        windowMethods.switchtotab(2);
        windowMethods.closecurrenttab();
        windowMethods.switchtotab(1);
        windowMethods.closecurrenttab();
        windowMethods.switchtotab(0);

    }
}
