import org.testng.annotations.Test;

public class SecondTC {

        @Test(priority=1)

        void setup(){
            System.out.println("This is setup test2");
        }

        @Test(priority=2)
        void login(){
            System.out.println("This is login2");
        }

        @Test(priority=3)
        void logout(){
            System.out.println("This is logout2");
        }

}
