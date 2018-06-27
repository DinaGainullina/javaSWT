package javaSWT.tests;

import org.testng.annotations.Test;

public class DeleteContact extends TestBase {

    

    @Test
    public void testDeleteContact() {
        app.gotoHomePage();
        app.getGroupHelper().selectElement();
        app.deleteSelectedContact();
    }


}
