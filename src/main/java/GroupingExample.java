import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"sanity"})
    void test1(){
        System.out.println("Test1");
    }

    @Test(groups = {"sanity"})
    void test2(){
        System.out.println("Test2");
    }

    @Test(groups = {"regression"})
    void test3(){
        System.out.println("Test3");
    }

    @Test(groups = {"sanity","regression"})
    void test4(){
        System.out.println("Test4");
    }
}

/*TestNg
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">
    <test name="groupingtest">
        <groups>
            <run>
                <exclude name="sanity"></exclude>
                <include name="regression"></include>
            </run>
        </groups>
        <classes>
            <class name="GroupingExample"></class>
        </classes>
    </test>
</suite>
 */