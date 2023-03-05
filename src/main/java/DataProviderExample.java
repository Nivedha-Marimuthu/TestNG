import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
//@Test(dataProvider = "LoginDataProvider",dataProviderClass=CustomDataProvider.class) incase if @DataProvider is in another class
    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String email,String pwd){
        System.out.println(email+"   "+pwd);
    }


    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData(){
        Object[][] data= {{"abc@gc.xom","abc"},{"xyz@gmail.com","123"},{"gh@outlook.com","456"}};
        return data;
    }
}
