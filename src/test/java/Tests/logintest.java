package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintest {


    //declaram variabila web driver

    public WebDriver driver;

    @Test
    public void login(){
        //setam driver de chrome
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        //deschidem o instanta de chrome
        driver=new ChromeDriver();
        //accesam un url
        driver.get("http://demo.automationtesting.in/Index.html");

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

    }
}
