package javaSWT.tests;

import javaSWT.model.GroupData;
import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {

    
    @Test
    public void testDeleteGroup() {
        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAGGroup()) {
            app.getGroupHelper().createGroup(new GroupData("TestD1", null, null));
        }
        app.getGroupHelper().selectElement();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }


}
