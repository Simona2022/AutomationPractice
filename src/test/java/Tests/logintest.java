package Tests;

import Base.SharedData;
import Help.ElementMethod;
import org.junit.Assert;
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
        elementMethod.clickElement(signinElement);

        WebElement emailElement=driver.findElement(By.cssSelector("input[placeholder='E mail']"));
        elementMethod.fillElement(emailElement,"simona@123.com");

        WebElement parolaElement= driver.findElement(By.cssSelector("input[placeholder='Password']"));
        elementMethod.fillElement(parolaElement,"12345");

        WebElement enterElement=driver.findElement(By.id("enterbtn"));
        elementMethod.clickElement(enterElement);

        WebElement errorMessage = driver.findElement(By.id("errormsg"));
        elementMethod.validateElementtest(errorMessage,"Invalid User Name or PassWord");

    }
}
