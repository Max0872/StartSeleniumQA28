import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomeTest {
    WebDriver wd;

    @BeforeMethod
    public void precondition(){
    wd = new ChromeDriver();
    wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");

    }
    @Test
    public void ElementTest(){

        List<WebElement> list = wd.findElements(By.tagName("a"));
        WebElement f ;
    for(int i = 0;i < list.size()-1;i++){
        if (list.equals("About"))
        {
           f =  list.get(i);
           f.click();
        }
        if (list.equals("Home"))
        {
            f =  list.get(i);
            f.click();
        }
    }



    }
    @AfterMethod
    public void postCondition(){
        // wd.quit();
         wd.close();
    }

}
