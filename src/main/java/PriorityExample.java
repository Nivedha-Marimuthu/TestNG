import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 2)
    void setup() {
        System.out.println("This is setup test");
    }

    @Test(priority = 3)
    void login() {
        System.out.println("This is login");
    }

    @Test(priority = 1,enabled = false)
    void logout() {
        System.out.println("This is logout");
    }
}
