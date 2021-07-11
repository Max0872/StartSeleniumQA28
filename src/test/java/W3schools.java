import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class W3schools {
    WebDriver wd;

    @BeforeMethod
    public void precondition(){
        wd=new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }
    @Test
    public void w3schoolTest(){
        List<WebElement> rows = wd.findElements(By.cssSelector("#customers tr"));
        int numberRows= rows.size();
        System.out.println(numberRows);
        List<WebElement> columns = wd.findElements(By.cssSelector("tr:first-child th"));
        System.out.println("Columns in table" +columns.size());
        List<WebElement> row3= wd.findElements(By.cssSelector("tr:nth-child(3)"));
        for(WebElement el:row3){
            System.out.println(el.getText());
        }
        List<WebElement>lastColumns =wd.findElements(By.cssSelector("td:last-child"));
        for(WebElement el:lastColumns){
            System.out.println(el.getText());
        }
        WebElement txt = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        System.out.println(txt.getText());
    }
    @AfterMethod
    public void postcondition(){
    //wd.close();
    }
}
