package Tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registerTest {

    public WebDriver driver;

    @Test
    public void register(){
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Index.html");

        WebElement skipElement=driver.findElement(By.id("btn2"));
        skipElement.click();
        WebElement firstnameElement=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        String firstnamevalue="Simona";
        firstnameElement.sendKeys(firstnamevalue);

        WebElement lastnameElement=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastnamevalue="Andrei";
        lastnameElement.sendKeys(lastnamevalue);

       // WebElement adressElement= driver.findElement(By.cssSelector("input[ng-model='Adress']"));
       // String adressvalue="str. Dunarii";
       // adressElement.sendKeys(adressvalue);

        WebElement emailadressElement=driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
        String emailadressvalue="gigi@gmail.com";
        emailadressElement.sendKeys(emailadressvalue);

        WebElement phoneElement=driver.findElement(By.cssSelector("input[ng-model='Phone']"));
        String phonevalue="07438973";
        phoneElement.sendKeys(phonevalue);

        WebElement genderElement=driver.findElement(By.cssSelector("input[value='FeMale']"));
        genderElement.click();

        WebElement hobbiesElement=driver.findElement(By.id("checkbox2"));
        hobbiesElement.click();

        WebElement passwordElement=driver.findElement(By.id("firstpassword"));
        String passwordvalue="12345";
        passwordElement.sendKeys(passwordvalue);

        WebElement password2Element=driver.findElement(By.id("secondpassword"));
        String password2value="12345";
        password2Element.sendKeys(password2value);





    }

}
