package javaSWT.tests;

import javaSWT.model.ContactData;
import org.testng.annotations.Test;

public class ContactModification extends  TestBase {

  @Test
  public void testGroupModification () {

    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("TestD_LN", "TestD_FN", "TestD_address", "TestD_email1", "TestD_email2", "TestD_email3", "8843555456", "89645125452", "8545", "8546"));
    app.getContactHelper().submitContactModification();





  }


}
