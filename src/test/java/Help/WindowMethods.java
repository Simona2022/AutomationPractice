package Help;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {
    public WebDriver driver;

    public WindowMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchtotab(int index){
        List<String> multiplewindow=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(multiplewindow.get(index));
        System.out.println("Titlul paginii"+ driver.getTitle());
    }

    public void closecurrenttab(){
        driver.close();
    }
}
