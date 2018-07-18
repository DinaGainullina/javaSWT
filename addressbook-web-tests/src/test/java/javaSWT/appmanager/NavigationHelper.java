package javaSWT.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class NavigationHelper extends HelperBase{



  public NavigationHelper(WebDriver wd) {
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
