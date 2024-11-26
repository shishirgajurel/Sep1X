public class Customer
{


    private String name;
    private int phoneNumber;
    private String emailAddress;

    public Customer(String name, int phoneNumber, String emailAddress){
      this.name = name;
      this.phoneNumber = phoneNumber;
      this.emailAddress= emailAddress;
    }
  public String getName()
  {
    return name;
  }

  public int getPhoneNumber()
  {
    return phoneNumber;
  }

  public String getEmailAddress()
  {
    return emailAddress;
  }
  public void setName(String name)
  {
    this.name = name;
  }

  public void setPhoneNumber(int phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  public void setEmailAddress(String emailAddress)
  {
    this.emailAddress = emailAddress;
  }

}
