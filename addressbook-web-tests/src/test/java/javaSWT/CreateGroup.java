import javaSWT.GroupData;
import javaSWT.TestBase;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CreateGroup extends TestBase {

  @Test
  public void testCreateGroup() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("TestD1", "TestD2", "TestD3"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
