package ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver driver;

    @Test
    void logoTest(){
        driver = new EdgeDriver();
        driver.get("https://outlook.be");
        WebElement signin=driver.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a"));
        Assert.assertTrue(signin.isDisplayed(),"Sign in button not available");

    }
}
