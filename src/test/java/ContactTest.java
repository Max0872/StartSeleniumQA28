import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ContactTest {
    WebDriver wd;

    @BeforeMethod
    public void precondition(){
        wd =new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home" );

    }
    @Test
    public void loginTest(){
        List<WebElement> list = wd.findElements(By.tagName("a"));
        int last = list.size()-1;

        WebElement element = list.get(last);
        element.click();
    }

    @Test
    public void locatorTest(){
        List<WebElement> list = wd.findElements(By.tagName("a"));
        list.get(2).click();

        //By tagname
        wd.findElement(By.tagName("a"));
        wd.findElement(By.tagName("h1"));
        wd.findElement(By.tagName("input"));
        wd.findElement(By.tagName("button"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("button"));

        //By id
        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.cssSelector("[id = 'root']"));

        //By className
        wd.findElement(By.className("container"));
        wd.findElement(By.className("active"));
        wd.findElement(By.cssSelector(".active"));
        wd.findElement(By.cssSelector("[class = 'active']"));

        //By name
        wd.findElement(By.cssSelector("[name = 'namename']"));
        //By linkText
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[placeholder='Password']"));
        //начинается
        wd.findElement(By.cssSelector("[placeholder='Pas']"));
        //заканчивается
        wd.findElement(By.cssSelector("[placeholder='ord']"));
        //содержит
        wd.findElement(By.cssSelector("[placeholder='swor']"));
    }
    @Test
    public void loginTest1(){
        wd.findElement(By.linkText("LOGIN")).click();
        List<WebElement> elements = wd.findElements(By.tagName("input"));
        WebElement email = elements.get(0);
        WebElement password = elements.get(1);
        email.click();
        email.clear();
        email.sendKeys("maria9@gmail.com");
        password.click();
        password.clear();
        password.sendKeys("Mm123456$");
        List<WebElement>buttons =  wd.findElements(By.tagName("button"));
        buttons.get(1).click();

    }
    @Test
    public void loginTest2(){
        wd.findElement(By.cssSelector("a[href ='/login']")).click();
        wd.findElement(By.cssSelector("[placeholder$='Email']")).click();
        wd.findElement(By.cssSelector("[placeholder$='Email']")).clear();
        wd.findElement(By.cssSelector("[placeholder$='Email']")).sendKeys("maria9@gmail.com");
        wd.findElement(By.cssSelector("[placeholder='Password']")).click();
        wd.findElement(By.cssSelector("[placeholder='Password']")).clear();
        wd.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("Mm123456$");
        wd.findElement(By.cssSelector("div[class$='login_login__3EHKB'] button:nth-child(4)")).click();

    }
    @AfterMethod
    public void postCondition(){
       // wd.quit();
      //  wd.close();
    }

}
;