package Tests;

import Base.SharedData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Frametest extends SharedData {
    @Test
    public void frametest(){
        WebElement skipElement=driver.findElement(By.id("btn2"));
        skipElement.click();

        WebElement switchtoElemet= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions action=new Actions(driver);
        action.moveToElement(switchtoElemet).perform();

        WebElement framesElement= driver.findElement(By.xpath("//a[text()='Frames']"));
        framesElement.click();
        driver.navigate().to("http://demo.automationtesting.in/Frames.html");

        driver.switchTo().frame("singleframe");
        WebElement inputText= driver.findElement(By.cssSelector("div>input['type='text']"));
        inputText.sendKeys("Foame");

        driver.switchTo().defaultContent();

        WebElement multipleiframe= driver.findElement(By.cssSelector("a[href='multiple']"));
        multipleiframe.click();

        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='SingleFrames.html']")));
        WebElement inputText2= driver.findElement(By.cssSelector("div>input[type='text']"));
        inputText2.sendKeys("foame partea a2a");
    }
}
