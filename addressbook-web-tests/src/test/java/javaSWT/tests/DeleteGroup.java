package javaSWT.tests;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {

    
    @Test
    public void testDeleteGroup() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectElement();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }


}
