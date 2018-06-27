package javaSWT.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{



  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click (By.linkText("groups"));
  }

  public void gotoContactPage() {
      wd.findElement(By.linkText("add new")).click();
  }

  public void gotoHomePage() {
      wd.findElement(By.linkText("home")).click();
  }
}
