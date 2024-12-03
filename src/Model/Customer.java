package Model;

public class Customer
{

    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Customer(String name, String phoneNumber, String emailAddress)
    {
      this.name = name;
      this.phoneNumber = phoneNumber;
      setEmailAddress(emailAddress);
    }
  public String getName()
  {
    return name;
  }

  public String getPhoneNumber()
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

  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  public void setEmailAddress(String emailAddress)
  {
    if (formattedEmail(emailAddress))
    {
      this.emailAddress = emailAddress;
    }
    else
    {
      throw new RuntimeException("Wrong email format user@host.domain");
    }
  }
  public boolean formattedEmail(String emailAddress)
  {
    if(emailAddress.contains("@") && emailAddress.contains("."))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  // toString method
  public String toString()
  {
    return "Name: " + name + "\nPhone Number: " + phoneNumber + "\nEmail Address: " + emailAddress;
  }
  // equals method
  public boolean equals(Object obj)
  {
    if (obj == null || getClass() != obj.getClass())
    {
      return false;
    }
    Customer other = (Customer) obj;
    return name.equals(other.name) && phoneNumber.equals(other.phoneNumber) && emailAddress.equals(other.emailAddress);
  }
}
