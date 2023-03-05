import org.testng.annotations.*;

public class FirstTC {
    @BeforeClass
    void beforeclass() {
        System.out.println("This is beforeclass");
    }
    @AfterClass
    void afterclass() {
        System.out.println("This is afterclass");
    }

    @BeforeMethod
    void beforemethod() {
        System.out.println("This is beforemethod");
    }
    @AfterMethod
    void aftermethod() {
        System.out.println("This is aftermethod");
    }

    @Test(priority = 3)
    void setup() {
        System.out.println("This is setup test");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("This is login");
    }

    @Test(priority = 1)
    void logout() {
        System.out.println("This is logout");
    }
    @BeforeTest
    void beforetest(){
        System.out.println("beforetest");
    }

    @AfterTest
    void aftertest(){
        System.out.println("aftertest");
    }

    @BeforeSuite
    void beforesuite(){
        System.out.println("beforesuite");
    }

    @AfterSuite
    void aftersuite(){
        System.out.println("aftersuite");
    }

}
