package javaSWT.appmanager;

import javaSWT.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class ContactHelper extends HelperBase {


  public ContactHelper(WebDriver wd) { super (wd);  }

  public void submitContactCreation() {
      click (By.xpath("//div[@id='content']/form/input[21]"));

  }

  public void fillContactForm(ContactData contactData) {
      type(By.name("lastname"), contactData.getLastName());
      type(By.name("firstname"), contactData.getFirstName());
      type(By.name("address"), contactData.getAddress());
      type(By.name("email"), contactData.getEmail1());
      type(By.name("email2"), contactData.getEmail2());
      type(By.name("email3"), contactData.getEmail3());

      type(By.name("home"), contactData.getHome());
      type(By.name("mobile"), contactData.getMobile());
      type(By.name("work"), contactData.getWork());
      type(By.name("fax"), contactData.getFax());

  }

  public void deleteSelectedContact() {
      click (By.xpath("//div[@id='content']/form[2]/div[2]/input"));
      wd.switchTo().alert().accept();
  }

  public void initContactModification() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
  }

  public void submitContactModification() {
    click(By.xpath("//div[@id='content']/form[1]/input[22]"));
  }
}
