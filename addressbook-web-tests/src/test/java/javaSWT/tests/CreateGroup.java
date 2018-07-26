package javaSWT.tests;

import javaSWT.model.GroupData;
import org.testng.annotations.Test;

public class CreateGroup extends TestBase {

  @Test
  public void testCreateGroup() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
   // app.getGroupHelper().fillGroupForm(new GroupData("TestD1", "TestD2", "TestD3"));
    app.getGroupHelper().fillGroupForm(new GroupData("TestD1", null, null));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
