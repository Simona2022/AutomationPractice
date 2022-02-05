package Tests;

import Base.SharedData;
import Help.ElementMethod;
import Help.FrameMethod;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Frametest extends SharedData {
    public FrameMethod frameMethod;
    public ElementMethod elementMethod;
    @Test

    public void frametest(){
        frameMethod=new FrameMethod(driver);
        elementMethod=new ElementMethod(driver);

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
        elementMethod.fillElement(inputText2,"ceva foame");
    }
}
