import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {

    WebDriver driver = new ChromeDriver();
    @BeforeClass
    void setup(){

        driver.get("https://outlook.be/");
        driver.manage().window().maximize();

    }

    @Test
    void buttonCheck(){
        WebElement signin=driver.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a"));
        Assert.assertTrue(signin.isDisplayed(),"Sign in button not available");
    }

    @Test
    void titleCheck(){
        String title = driver.getTitle();
        Assert.assertEquals("title","Outlook", "title is not matched");
    }

    @AfterClass
    void teardown(){
        driver.quit();
    }
}
