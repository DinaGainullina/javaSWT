import javaSWT.TestBase;
import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {

    
    @Test
    public void testDeleteGroup() {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage();
    }


}
