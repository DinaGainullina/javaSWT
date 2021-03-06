package javaSWT.tests;

import javaSWT.model.GroupData;
import org.testng.annotations.Test;

public class GroupModification extends  TestBase {

@Test
  public void testGroupModification () {
    app.getNavigationHelper().gotoGroupPage();
  if (! app.getGroupHelper().isThereAGGroup()) {
    app.getGroupHelper().createGroup(new GroupData("TestD1", null, null));
  }
    app.getGroupHelper().selectElement();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("TestD1", "TestD2", "TestD3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }

}

