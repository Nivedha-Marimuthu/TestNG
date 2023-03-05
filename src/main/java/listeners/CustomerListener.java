package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class CustomerListener implements ITestListener {

    public void onStart(ITestContext arg){
        System.out.println("Starts"+arg.getName());
    }

    public void onFinish(ITestContext arg){
        System.out.println("Starts"+arg.getName());
    }

    public void onTestStart(ITestContext arg0){
        System.out.println("Starts"+arg0.getName());
    }

    public void onTestSkipped(ITestContext arg0){
        System.out.println("Starts"+arg0.getName());
    }

}

/*
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="All Test Suite">
    <listeners>
        <listener class-name="listeners.CustomerListener"></listener>
    </listeners>
    <test verbose="2" preserve-order="true" name="C:/Users/nmarimut/IdeaProjects/demo2/src/main/java/listeners">
        <classes>
            <class name="listeners.listenerTest">
            </class>
        </classes>
    </test>
</suite>
 */
