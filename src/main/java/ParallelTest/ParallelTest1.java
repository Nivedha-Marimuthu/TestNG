package ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParallelTest1 {
    WebDriver driver;

    @Test
    void logoTest(){
        driver = new EdgeDriver();
        driver.get("https://outlook.be");
        WebElement signin=driver.findElement(By.xpath("/html/body/header/div/aside/div/nav/ul/li[2]/a"));
        Assert.assertTrue(signin.isDisplayed(),"Sign in button not available");

    }

    @Test
    void homePageTitle(){
        driver = new EdgeDriver();
        driver.get("https://outlook.be");
        String title = driver.getTitle();
        System.out.println(title);

    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}

/*<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite" parallel="methods" thread-count="2">
    <test name="test1">
        <classes>
            <class name="ParallelTest.ParallelTest1">
            </class>
        </classes>
    </test>
</suite>

 */
