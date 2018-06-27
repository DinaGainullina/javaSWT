package javaSWT.tests;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {

    
    @Test
    public void testDeleteGroup() {
        app.gotoGroupPage();
        app.selectElement();
        app.deleteSelectedGroups();
        app.returnToGroupPage();
    }


}
