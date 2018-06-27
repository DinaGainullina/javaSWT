import javaSWT.ContactData;
import javaSWT.TestBase;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GreateContact extends TestBase {


    @Test
    public void testGreateContact()  {
        gotoContactPage();
        fillContactForm(new ContactData("TestD_LN", "TestD_FN", "TestD_address", "TestD_email1", "TestD_email2", "TestD_email3", "8843555456", "89645125452", "8545", "8546"));
        submitContactCreation();
    }


}
