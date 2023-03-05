import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser, String app){
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            driver.get("https://outlook.be/");
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new EdgeDriver();
        }
        driver.get(app);
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


/*testngXML

    <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">
<parameter name="browser" value="chrome"></parameter>
<parameter name="url" value="https://outlook.be"></parameter>
<test name="ParametersTest">

<classes>
<class name="ParameterExample"></class>
</classes>
</test>

<parameter name="browser" value="firefox"></parameter>
<parameter name="url" value="https://outlook.be"></parameter>
<test name="ParametersTest2">

<classes>
<class name="ParameterExample"></class>
</classes>
</test>
</suite>
*/
