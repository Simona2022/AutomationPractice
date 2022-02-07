package Tests;

import Base.SharedData;
import Help.ElementMethod;
import Help.FrameMethod;
import Help.PageMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Frametest extends SharedData {
    public FrameMethod frameMethod;
    public ElementMethod elementMethod;
    public PageMethods pageMethods;
    @Test

    public void frametest(){
        frameMethod=new FrameMethod(driver);
        elementMethod=new ElementMethod(driver);
        pageMethods=new PageMethods(driver);

        WebElement skipElement=driver.findElement(By.id("btn2"));
        elementMethod.clickElement(skipElement);

        WebElement switchtoElemet= driver.findElement(By.xpath("//a[text()='SwitchTo']"));
        elementMethod.movetoElement(switchtoElemet);

        WebElement framesElement= driver.findElement(By.xpath("//a[text()='Frames']"));
        elementMethod.clickElement(framesElement);

        pageMethods.navigateElement("http://demo.automationtesting.in/Frames.html");

        frameMethod.switchtoframebyid("singleframe");
        WebElement inputText = driver.findElement(By.cssSelector("div>input[type = 'text']"));
        elementMethod.fillElement(inputText,"Hello!");
        frameMethod.switchtodefault();

        //IFrame in Iframe
        WebElement multipleIFrame = driver.findElement(By.cssSelector("a[href = '#Multiple']"));
        elementMethod.clickElement(multipleIFrame);

        frameMethod.switchtoframebyElement(driver.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
        frameMethod.switchtoframebyElement(driver.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
        WebElement inputText2= driver.findElement(By.cssSelector("div>input[type='text']"));
        elementMethod.fillElement(inputText2,"ceva foame");
    }
}
