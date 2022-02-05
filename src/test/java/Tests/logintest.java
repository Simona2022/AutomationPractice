package Tests;

import Base.SharedData;
import Help.ElementMethod;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest extends SharedData {


    //declaram variabila web driver
    public ElementMethod elementMethod;
    @Test
    public void login(){
    elementMethod=new ElementMethod(driver);

        WebElement signinElement=driver.findElement(By.id("btn1"));
        signinElement.click();
        WebElement emailElement=driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        String emailvalue="simona@yahoo.com";
        emailElement.sendKeys(emailvalue);
        WebElement parolaElement= driver.findElement(By.cssSelector("input[placeholder='Password']"));
        String parolavalue="1234";
        parolaElement.sendKeys(parolavalue);
        WebElement enterElement=driver.findElement(By.id("enterbtn"));
        enterElement.click();

        WebElement errorElemnt=driver.findElement(By.id(""));
        elementMethod.validateElementtest(errorElemnt,"invalid password or adress");


    }
}
