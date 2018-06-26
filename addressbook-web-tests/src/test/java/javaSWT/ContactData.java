package javaSWT;

public class ContactData {
  private final String lastName;
  private final String firstName;
  private final String address;
  private final String email1;
  private final String email2;
  private final String email3;
  private final String home;
  private final String mobile;
  private final String work;
  private final String fax;

  public ContactData(String lastName, String firstName, String Address, String email1, String email2, String email3, String home, String mobile, String work, String fax) {
    this.lastName = lastName;
    this.firstName = firstName;
    address = Address;
    this.email1 = email1;
    this.email2 = email2;
    this.email3 = email3;
    this.home = home;
    this.mobile = mobile;
    this.work = work;
    this.fax = fax;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getAddress() {
    return address;
  }

  public String getEmail1() {
    return email1;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getHome() {
    return home;
  }

  public String getMobile() {
    return mobile;
  }

  public String getWork() {
    return work;
  }

  public String getFax() {
    return fax;
  }
}
