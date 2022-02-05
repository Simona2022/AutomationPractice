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
        List<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        System.out.println("Titlul paginii"+ driver.getTitle());
    }
    public void closecurrenttab(){
        driver.close();
    }
}
