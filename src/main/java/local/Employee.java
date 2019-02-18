package local;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Employee {
@Test
    public void employee() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/test/employee");
        AddEmployee addEmployee = new AddEmployee(driver);
        addEmployee.typeUserName("Alexandr");
        addEmployee.typeUserId("5");
        addEmployee.typeUserContactNumber("0939517619");
        addEmployee.clickOnSendRequest();


    Assert.assertTrue(addEmployee.comparisonName().contains(""));
    Assert.assertTrue(addEmployee.comparisonId().contains(""));
    Assert.assertTrue(addEmployee.comparisonNumber().contains(""));

    driver.quit();
}

    }



