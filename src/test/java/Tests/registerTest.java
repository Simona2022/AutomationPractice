package Tests;

import Base.SharedData;
import Help.ElementMethod;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class registerTest extends SharedData {
//ElementMethod-clasa
//elementMethod-obiectu
public ElementMethod elementMethod;
    @Test
    public void register(){
    elementMethod=new ElementMethod(driver);

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

        WebElement languageElement=driver.findElement(By.id("msdd"));
        languageElement.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        List<WebElement> languageOption= driver.findElements(By.cssSelector("ul.ui-autocomplete.ui-front>li>a"));
        for (int index=0; index< languageOption.size();index++){
            if (languageOption.get(index).getText().equals("Arabic")
                    || (languageOption.get(index).getText().equals("Bulgarian"))){
                languageOption.get(index).click();
            }
            if (languageOption.get(index).getText().equals("English")) {
                languageOption.get(index).click();
            }

        }
        genderElement.click();

        WebElement selectElement=driver.findElement(By.cssSelector("span[role='combobox']"));
        selectElement.click();

        WebElement countyinputElement=driver.findElement(By.className("select2-search__field"));
        countyinputElement.sendKeys("Australia");
        countyinputElement.sendKeys(Keys.ENTER);


        WebElement uploadphotoElement=driver.findElement(By.cssSelector("div>input[id=\"imagesrc\"]"));
        uploadphotoElement.sendKeys("C:\\Users\\Simona\\Desktop\\1.JPG");

        WebElement skillsElement= driver.findElement(By.id("Skills"));
        elementMethod.selectelementbytext(skillsElement,"C++");

        WebElement yearElement= driver.findElement(By.id("yearbox"));
        elementMethod.selectelementbyvalue(yearElement,"1995");

        WebElement monthElement= driver.findElement(By.cssSelector("div>select[ng-model='monthbox']"));
        elementMethod.selectelementbytext("July");




    }

}
