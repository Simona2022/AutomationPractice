package Tests;

import Base.SharedData;
import Help.ElementMethod;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class registerTest extends SharedData {

public ElementMethod elementMethod;

    @Test

    public void register(){

    elementMethod=new ElementMethod(driver);

        WebElement skipElement=driver.findElement(By.id("btn2"));
        elementMethod.clickElement(skipElement);

        WebElement firstnameElement=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        elementMethod.fillElement(firstnameElement,"Simonq");

        WebElement lastnameElement=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        elementMethod.fillElement(lastnameElement,"Andrei");

        WebElement adressElement= driver.findElement(By.cssSelector("textarea[rows='3']"));
        elementMethod.fillElement(adressElement,"str. Dunarii, nr.10");

        WebElement emailadressElement=driver.findElement(By.cssSelector("input[ng-model='EmailAdress']"));
        elementMethod.fillElement(emailadressElement, "gigi@yahoo.com");

        WebElement phoneElement=driver.findElement(By.cssSelector("input[ng-model='Phone']"));
        elementMethod.fillElement(phoneElement, "07462747");

        WebElement genderElement=driver.findElement(By.cssSelector("input[value='FeMale']"));
        elementMethod.clickElement(genderElement);

        WebElement hobbiesElement=driver.findElement(By.id("checkbox2"));
        elementMethod.clickElement(hobbiesElement);

        WebElement passwordElement=driver.findElement(By.id("firstpassword"));
        elementMethod.fillElement(passwordElement,"12345");

        WebElement password2Element=driver.findElement(By.id("secondpassword"));
        elementMethod.fillElement(password2Element,"12345");

        WebElement languageElement=driver.findElement(By.id("msdd"));
        elementMethod.clickElement(languageElement);

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
        elementMethod.clickElement(selectElement);

        WebElement countyinputElement=driver.findElement(By.className("select2-search__field"));
        elementMethod.fillElement(countyinputElement,"Australia");
        countyinputElement.sendKeys(Keys.ENTER);

        WebElement uploadphotoElement=driver.findElement(By.cssSelector("div>input[id=\"imagesrc\"]"));
        uploadphotoElement.sendKeys("C:\\Users\\Simona\\Desktop\\1.JPG");

        WebElement skillsElement= driver.findElement(By.id("Skills"));
        elementMethod.selectelementbytext(skillsElement,"C++");

        WebElement yearElement= driver.findElement(By.id("yearbox"));
        elementMethod.selectelementbyvalue(yearElement,"1995");

        WebElement monthElement= driver.findElement(By.cssSelector("div>select[ng-model='monthbox']"));
        elementMethod.selectelementbytext(monthElement,"July");

        WebElement dayElement=driver.findElement(By.id("daybox"));
        elementMethod.selectelementbyvalue(dayElement,"3");




    }

}
