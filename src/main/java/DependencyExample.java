import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
    @Test
    void startCar(){
        System.out.println("Start car");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
        System.out.println("drive car");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("stop car");
    }

    @Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun = true)
    void parkcar(){
        System.out.println("park car");
    }

}
