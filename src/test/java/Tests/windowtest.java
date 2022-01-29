package Tests;

import Base.SharedData;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class windowtest extends SharedData {
    @Test
    public void windowtest(){
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

        System.out.println("Titlul paginii"+ driver.getTitle());
        List<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Titlul paginii 2"+ driver.getTitle());

        driver.close();
        driver.switchTo().window(tabs.get(0));
        System.out.println("Titlul paginii"+ driver.getTitle());

        windowoptions.get(1).click();
        WebElement newseperate=driver.findElement(By.cssSelector("#Seperate>button"));
        newseperate.click();

        System.out.println("Titlul paginii"+driver.getTitle());
        List<String> window=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(window.get(1));
        System.out.println("Titlul paginii 2"+ driver.getTitle());

        driver.close();
        driver.switchTo().window(window.get(0));
        System.out.println("Titlul paginii"+ driver.getTitle());

        windowoptions.get(2).click();
        WebElement multiple=driver.findElement(By.cssSelector("#Multiple>button"));
        multiple.click();

        System.out.println("Titlul paginii"+driver.getTitle());
        List<String> multipletabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(multipletabs.get(1));
        System.out.println("Titlul paginii 2"+ driver.getTitle());

        driver.close();
        driver.switchTo().window(multipletabs.get(0));
        System.out.println("Titlul paginii"+ driver.getTitle());




    }
}
