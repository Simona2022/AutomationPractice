package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SharedData {
    public WebDriver driver;

    @Before
    public void setup(){
        //setam driver de chrome
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        //deschidem o instanta de chrome
        driver=new ChromeDriver();
        //accesam un url
        driver.get("http://demo.automationtesting.in/Index.html");
    }
    @After
    public void Teardown(){
       // driver.quit();

    }
}
